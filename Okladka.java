/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodaszablonowa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author lenovo
 */
public class Okladka extends JPanel{
    private JLabel tlo;
    private JButton strzalka;  
    public Okladka(){
        setSize(600,844);       
        tlo = new JLabel(new ImageIcon("obraz\\okladka2.jpg")); 
        tlo.setBounds(0,0,600,844);
        strzalka = new JButton(new ImageIcon("obraz\\strzalkaPrawo.png"));
        strzalka.setBounds(450,650,100,100);
        strzalka.setContentAreaFilled(false);
        strzalka.addActionListener(new StronyKsiazki());
        tlo.add(strzalka);
        add(tlo);
        setVisible(true);        
    }
    class StronyKsiazki implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {               
            JFrame parent = (JFrame)SwingUtilities.getAncestorOfClass(JFrame.class, Okladka.this);
            parent.getContentPane().removeAll();           
            parent.setSize(1250,844);     
            parent.add(new Strony());
        }        
    }
}
