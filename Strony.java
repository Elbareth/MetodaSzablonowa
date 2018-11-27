/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodaszablonowa;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author lenovo
 */
//Dodać tu iterator, żeby można było przechodzić po liście przepisów
//Przepisy konstruowane za pomocą metody szablonowej
public class Strony extends JPanel{
    private JLabel tlo;
    private JButton lewy;
    private JButton prawy;
    private JLabel ilustracja;
    private JLabel tytul;
    private JLabel skladniki;
    private JLabel ciasto;    
    private JLabel masa;
    private JLabel pieczenie;
    private JLabel dodatki;
    private JLabel polewa;
    private Agregator agregator;
    private List <Przepis> lista;
    private IteratorCiast iterator;
    private String [] elementy;
    public void tmp(){
        agregator = new KonkretnyAgregator();
        lista = agregator.listaCiast();
        iterator = agregator.createIterator(lista);
    }
    public void teraz(){
        elementy = iterator.currentItem().split("@");        
    }
    public Strony(){
        tmp();
        teraz();
        setSize(1250,844);
        tlo = new JLabel(new ImageIcon("obraz\\ksiazka.jpg"));
        lewy = new JButton(new ImageIcon("obraz\\strzalkaLewo.png"));
        lewy.setBounds(30,650,100,100);
        lewy.setContentAreaFilled(false);
        lewy.addActionListener(new Lewo());
        tlo.add(lewy);
        prawy = new JButton(new ImageIcon("obraz\\strzalkaPrawo.png"));
        prawy.setBounds(1100,650,100,100);
        prawy.setContentAreaFilled(false);
        prawy.addActionListener(new Prawo());
        tlo.add(prawy);
        ilustracja = new JLabel(new ImageIcon(elementy[0]));
        ilustracja.setBounds(30,50,300,200);
        tlo.add(ilustracja);
        tytul = new JLabel(elementy[1]);
        tytul.setFont(new Font("Brush Script MT kursywa",Font.BOLD,30));
        tytul.setBounds(370,50,250,50);
        tlo.add(tytul);
        skladniki = new JLabel(elementy[2]);
        skladniki.setFont(new Font("Brush Script MT kursywa",Font.PLAIN,20));
        skladniki.setBounds(370,80,250,400);
        tlo.add(skladniki);     
        ciasto = new JLabel(elementy[3]);
        ciasto.setFont(new Font("Brush Script MT kursywa",Font.PLAIN,20));
        ciasto.setBounds(30,430,600,250);
        tlo.add(ciasto); 
        masa = new JLabel(elementy[4]);
        masa.setFont(new Font("Brush Script MT kursywa",Font.PLAIN,20));
        masa.setBounds(30,450,600,250);
        tlo.add(masa);  
        pieczenie = new JLabel(elementy[5]);
        pieczenie.setFont(new Font("Brush Script MT kursywa",Font.PLAIN,20));
        pieczenie.setBounds(670,30,600,50);
        tlo.add(pieczenie); 
        dodatki = new JLabel(elementy[6]);
        dodatki.setFont(new Font("Brush Script MT kursywa",Font.PLAIN,20));
        dodatki.setBounds(670,80,600,250);
        tlo.add(dodatki);
        polewa = new JLabel(elementy[7]);
        polewa.setFont(new Font("Brush Script MT kursywa",Font.PLAIN,20));
        polewa.setBounds(670,330,600,100);
        tlo.add(polewa); 
        add(tlo);
        setVisible(true);
    }
    class Lewo implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            iterator.hasPrev();
            elementy = iterator.currentItem().split("@");                     
            ilustracja.setIcon(new ImageIcon(elementy[0]));       
            tytul.setText(elementy[1]);
            skladniki.setText(elementy[2]);
            ciasto.setText(elementy[3]);    
            masa.setText(elementy[4]);
            pieczenie.setText(elementy[5]);
            dodatki.setText(elementy[6]);
            polewa.setText(elementy[7]);
        }        
    }
    class Prawo implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            iterator.hasNext();
            elementy = iterator.currentItem().split("@");                     
            ilustracja.setIcon(new ImageIcon(elementy[0]));       
            tytul.setText(elementy[1]);
            skladniki.setText(elementy[2]);
            ciasto.setText(elementy[3]);    
            masa.setText(elementy[4]);
            pieczenie.setText(elementy[5]);
            dodatki.setText(elementy[6]);
            polewa.setText(elementy[7]);
        }        
    }
}
