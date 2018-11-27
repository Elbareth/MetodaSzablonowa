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
public class OpityIzydor extends Przepis{

    @Override
    protected String ilustracja() {
        return "obraz\\opityIzydor.jpg";
    }

    @Override
    protected String tytul() {
        return "Opity Izydor";
    }

    @Override
    protected String skladniki() {
        return "<html>8 jajek <br/>"
                + "350 g masła <br/>"
                + "300 g cukru <br/>"
                + "4 łyżki kakao <br/>"
                + "400 g zmielonych orzechów włoskich <br/>"
                + "50 g mąki <br/>"
                + "dżem morelowy <br/>"
                + "250 ml wódki <br/>"
                + "100 g gorzkiej czekolady</html>";
    }

    @Override
    protected String ciasto() {
        return "<html> Oddzielamy żółtka od białek. Białka ubijamy. Masło uceramy z <br/>"
                + "cukrem, żółtkami kakaem i mąką.  Dodajemy orzechy. Dodajemy piany</html>";
    }

    @Override
    protected String masa() {
        return "";
    }

    @Override
    protected String pieczenie() {
        return "Pieczemy w piekarniku nagrzanym do 200 stopni przez 25 min";
    }

    @Override
    protected String dodatki() {
        return "<html> Do orzechów wlewamy wódki i mieszamy. Jajak ubijamy z cukrem podczas <br/>"
                + "kompieli wodnej. Masło ucieramy, dodajemy do niego krem, kakao, roztopioną <br/>"
                + " czekoladę i trochę spirytusu. Ciasto smarujemy dżemem i moasą orzechową.</html>";
    }

    @Override
    protected String polewa() {
        return "Na wierzch i boki kładziemy masę czekoladową.";
    }
    
}
