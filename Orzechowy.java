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
public class Orzechowy extends Przepis{

    @Override
    protected String ilustracja() {
        return "obraz\\orzechowy.jpg";
    }

    @Override
    protected String tytul() {
        return "Tort Orzechowy";
    }

    @Override
    protected String skladniki() {
        return "<html> 10 jajek <br/>"
                + "200 g cukru <br/>"
                + "250 g mąki <br/>"
                + "150 g zmielonych orzechów <br/>"
                + "proszek do pieczenia <br/>"
                + "2 łyżki oliwy <br/>"
                + "szklanka zmielonych biszkoptów <br/>"
                + "400 g orzechów włoskich <br/>"
                + "400 ml mleka <br/>"
                + "300 g cukru <br/>"
                + "400 g masła <br/>"
                + "kieliszek spirytusu </html>";
    }

    @Override
    protected String ciasto() {
        return "<html>Białka oddziel od żółtek. Białka ubij.Wmiwszaj w nie żółtka. Zielone <br/>"
                + "orzechy wymieszaj z mąką, biszkoptami i proszkiem do pieczenia. Wmieszaj to <br/>"
                + "wszystko w pianę.</html>";
    }

    @Override
    protected String masa() {
       return "";
    }

    @Override
    protected String pieczenie() {
        return "Piecz w piekarniuku nagrzanym do 180 stopni przez 40 min";
    }

    @Override
    protected String dodatki() {
        return "<html> Zagotuj mleko i rozpuść cukier. Gotuj aż zgęstnieje przez 10 min. <br/>"
                + "wmieszaj orzechy. Gdy ostygnie wrzuć dwie kostki masła. Mieszaj i dodaj spirutus <br/>"
                + "Ciasto pokrój na 3 części i przełóż kremem.</html>";
    }

    @Override
    protected String polewa() {
        return "Ciasto przykryj klemem, obsyp zmielonymi orzechami i udekoruj całymi orzechami";
    }
    
}
