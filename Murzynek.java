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
public class Murzynek extends Przepis{

    @Override
    protected String ilustracja() {
        return "obraz\\murzynek.jpg";
    }

    @Override
    protected String tytul() {
        return "Murzynek";
    }

    @Override
    protected String skladniki() {
        return "<html> 2 szklanki mąki pszennej<br/>" +
                "1½ szklanki drobnego cukru <br/>" +
                "2 łyżeczki cukru waniliowego<br/>" +
                "3 czubate łyżki ciemnego kakao<br/>" +
                "2 łyżeczki cynamonu<br/>" +
                "2 płaskie łyżeczki proszku do pieczenia<br/>" +
                "szczypta soli<br/>" +
                "1 szklanka oleju<br/>" +
                "½ szklanki mleka<br/>" +
                "3 średniej jajka<br/>" +
                "garść rodzynek</html>";
    }

    @Override
    protected String ciasto() {
        return "Mieszamy wszystko ze wszystkim";
    }

    @Override
    protected String masa() {
        return "";
    }

    @Override
    protected String pieczenie() {
        return "Piec w piekarniku nagrzanym do 175 stopni przez 40 min";
    }

    @Override
    protected String dodatki() {
        return "";
    }

    @Override
    protected String polewa() {
        return "Polać polewą czekoladową";
    }
    
}
