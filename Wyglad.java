/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodaszablonowa;


import javax.swing.JFrame;

/**
 *
 * @author lenovo
 */
public class Wyglad extends JFrame{    
    public Wyglad(){
        setSize(600,844);
        setTitle("Książka Kucharska");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           
        add(new Okladka());
        setVisible(true);
    }    
}
