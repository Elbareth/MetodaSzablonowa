/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodaszablonowa;

/**
 *
 * @author lenovo
 */
public class Sachera extends Przepis{

    @Override
    protected String ilustracja() {
        return "obraz\\sachera.jpg";
    }

    @Override
    protected String tytul() {
        return "Tort Sachera";
    }

    @Override
    protected String skladniki() {
        return "<html> 65 g gorzkiej czekolady <br/>"
                + "65 g masła <br/>"
                + "65 g mąki </br>"
                + "90 g masła <br/>"
                + "0,5 łyżeczki proszku do pieczenia <br/>"
                + "4 jajka <br/>"
                + "75 g marmolady morelowej <br/>"
                + "125 g czekolady na polewe </html>";
    }

    @Override
    protected String ciasto() {
       return "<html> Masło i czekoladę rozpuszczamy w kąpieli wodnej. Jajka ubijamy z cukrem <br/>"
               + "Do piany dodajemy mąkę, proszek, ostudzoną czekoladę z masłem.  </html>";
    }

    @Override
    protected String masa() {
        return "";
    }

    @Override
    protected String pieczenie() {
        return "Pieczemy w temperaturze 180 stopni przez 35 min";
    }

    @Override
    protected String dodatki() {
        return "Ciasto podzielić na 2 i przełożyć marmoladą";
    }

    @Override
    protected String polewa() {
        return "Ciasto posmarować marmoladę i polać polewą czekoladową";
    }
    
}
