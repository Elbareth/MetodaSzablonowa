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
public class Piernik extends Przepis{

    @Override
    protected String ilustracja() {
        return "obraz\\piernik.jpg";
    }

    @Override
    protected String tytul() {
        return "Piernik";
    }

    @Override
    protected String skladniki() {
        return "<html> 500 g miodu <br/>"
                + "250 g masła <br/>"
                + "0,5 szklanki mleka<br/>"
                + "3 jajka <br>"
                + "1 kg mąki <br/>"
                + "1,5 szklanki cukru <br/>"
                + "3 łyżeczki sody <br/>"
                + "150 g orzechów włoskich <br/>"
                + "3 łyżki kandyzowanej skórki pomarańczy <br/>"
                + "2 łyżeczki przyprawy do piernika <br/>"
                + "słoik powidła śliwkowego</html>";
    }

    @Override
    protected String ciasto() {
        return "<html> Masło rozpuścić, dodać cukier, wmieszać miód. Odstawiamy by wszystko ostygło. <br/>"
                + "Sodę rozpuścić w mleku, wmieszać jajka i mąkę. Dodać przyprawę do piernika <br/>"
                + "orzechy i skórkę pomarańczy. Odstawić na 4 tyg. </html>";
    }

    @Override
    protected String masa() {
        return "";
    }

    @Override
    protected String pieczenie() {
        return "Piec w piekarniku nagrzanym do 160 stopni przez 60 min";
    }

    @Override
    protected String dodatki() {
        return "Ciasto przełożyć powidłem śliwkowym";
    }

    @Override
    protected String polewa() {
        return "Ciasto polać polewą czekoladową.";
    }
    
}
