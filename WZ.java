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
public class WZ extends Przepis{

    @Override
    protected String ilustracja() {
        return "obraz\\wz.jpg";
    }

    @Override
    protected String tytul() {
        return "WZ";
    }

    @Override
    protected String skladniki() {
        return "<html> kostka margaryny <br/>"
                + "szklanka cukru <br/>"
                + "4 łyżki kakao <br/>"
                + "0,5 szklanki wody <br/>"
                + "2 szklanki mąki <br/>"
                + "łyżeczka proszku do pieczenia <br/>"
                + "4 żółtka <br/>"
                + "4 białka <br/>"
                + "0,5 l śmietani kremóki <br/>"
                + "łyżka żelatyny <br/>"
                + "0,5 litra wody <br/>"
                + "150 g cukru <br/>"
                + "kieliszek spirytusu <br/>"
                + "0,5 cytryny </html>";
    }

    @Override
    protected String ciasto() {
        return "<html>Margarynę roztapiamy i mieszamy z cukrem. Zdejujemy z ognia i dodajemy kakao <br/>"
                + "Dodajemy wodę. Stopniowo dodawać żółtka, mąkę i proszek. Ubijamy białka i <br/>"
                + "dodajemy do ciasta. </html>";
    }

    @Override
    protected String masa() {
        return "";
    }

    @Override
    protected String pieczenie() {
        return "Pieczemy w temperaturze 180 stopni przez 50 min";
    }

    @Override
    protected String dodatki() {
        return "<html> Ubijamy śmietanę z cukrem i dodajemy żelatyny. Do wody dodać cukier <br/>"
                + "i pokrojoną w plastry cytrynę. Zagotowujemy. Gdy wystygnie dolewamy spirytus. <br/>"
                + "Ciasto kroimy na 2 i przekładamy śmietana.  </html>";
    }

    @Override
    protected String polewa() {
        return "Wierzch ciasta polać ponczem, posmarować marmoladą i polać polewą czekoladową";
    }
    
}
