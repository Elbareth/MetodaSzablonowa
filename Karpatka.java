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
public class Karpatka extends Przepis{

    @Override
    protected String ilustracja() {
        return "obraz\\karpatka.jpg";
    }

    @Override
    protected String tytul() {
        return "Karpatka";
    }

    @Override
    protected String skladniki() {
        return "<html> 100 g masła <br/>"
                + "250 ml wody <br/>"
                + "160 g mąki <br/>"
                + "9 jajek <br/>"
                + "1 l mleka <br/>"
                + "4 żółtka <br/>"
                + "2 budynie waniliowe <br/>"
                + "3 kostki masła </br>"
                + "400 g cukru pudru</html>";
    }

    @Override
    protected String ciasto() {
        return " <html> Do goroącej wody dodjemy maslo. Dodać sól i całą mąkę. Mieszamy aż </br>"
                + "powstanie jednolita masa. Gdy przestygnie wbijamy 7 jajek i mieszamy. </html>";
    }

    @Override
    protected String masa() {
        return " ";
    }

    @Override
    protected String pieczenie() {
        return "Pieczemy w piekarniku nagrzanym do 230 stopni przez 18 min";
    }

    @Override
    protected String dodatki() {
        return "<html> Do szklanki mleka dodać jajak i żółtka. Mieszamy. Dodajemy cukier i </br>"
                + "budyń. Resztę mleka grzejemy na małym ogniu. Gdy będzie gorące wlewamy masę. Gdy <br/>"
                + "się połączy i zagotuje. Odstawiamy. Ucieramy masło i dodajemy budyń. Samrujemy ciasto</html>";
    }

    @Override
    protected String polewa() {
        return "Posypujemy cukrem pudrem";
    }
    
}
