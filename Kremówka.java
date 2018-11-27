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
public class Kremówka extends Przepis{

    @Override
    protected String ilustracja() {
        return "obraz\\kremówka.jpg";
    }

    @Override
    protected String tytul() {
        return "Kremówka";
    }

    @Override
    protected String skladniki() {
        return "<html> 100 g mąki <br/>"
                + "3 kostki masła <br/>"
                + "400 g mąki </br>"
                + "2 jajka <br/>"
                + "0,5 szklanki wody <br/>"
                + "7 żółtek <br/>"
                + "1 l mleka <br/>"
                + "250 g mąki <br/>"
                + "250 g cukru <br/>"
                + "ocet</html>";
    }

    @Override
    protected String ciasto() {
        return "<html> Do mąki dodajemy masło i urabiamy. Ciasto odstawiamy na 15 min <br/>"
                + "do lodówki. Do mąki dodajemy ocet, jajak i wodę i ugniatamy. Odstawiamy <br/>"
                + "na pół godziny.Na ciasto z octem kładziemy ciasto z masłem. Rozwałkowujemy i składamy ciasto <br/>"
                + "Następnie wkładamy je do lodówki na 15 min. Tą czynność powtarzamy 5 razy   </html>";
    }

    @Override
    protected String masa() {
        return " ";
    }

    @Override
    protected String pieczenie() {
        return "Pieczemy w piekarniku nagrzanym do 220 stopni przez 30 min";
    }

    @Override
    protected String dodatki() {
        return "<html>Ucieramy żółtka z cukrem. Dodajemy mąki i powoli gorące mleko. Postawić nad <br/>"
                + "ciepłą wodą i mieszamy. Gdy wystygnie ucieramy masło i dodajemy krem. Kakładamy na </br>"
                + "ciasto. Na krem nałożyć bita śmietanę i ozdobić owocami.</html>";
    }

    @Override
    protected String polewa() {
        return "Posypujemy cukrem pudrem";
    }
    
}
