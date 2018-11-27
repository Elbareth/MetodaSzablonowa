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
public class Tiramisu extends Przepis{

    @Override
    protected String ilustracja() {
        return "obraz\\tiramisu.jpg";
    }

    @Override
    protected String tytul() {
        return "Tiramisu";
    }

    @Override
    protected String skladniki() {
        return "<html> 600 g serka mascarpone <br/>"
                + "4 żółtka <br/>"
                + "2,5 łyżki cukru <br/>"
                + "laska wanilii <br/>"
                + "200 ml kawy <br/>"
                + "kieliszek koniaku <br/>"
                + "opakowaie biszkoptów <br/>"
                + "kakao <br/>"
                + "wiórki kokosowe</html>";
    }

    @Override
    protected String ciasto() {
        return "<html>Żółtak ucieramy z cukrem nad kąpielą wodną. Mieszamy i gdy jest chłodniejsze <br/>"
                + "dodajemy serka mascarpone. Dodajemy do masy wanilię. Biszkopty moczymy w kawie i <br/>"
                + "koniaku. Układamy na półmisku. </html>";
    }

    @Override
    protected String masa() {
        return "Nakładamy masę na ciasto i posypujemy wiórkami";
    }

    @Override
    protected String pieczenie() {
        return "Pieczemy w temaraturze 180 stopni przez 2 min.";
    }

    @Override
    protected String dodatki() {
        return "Nakładamy pozostałą część biszkoptów i resztę masy";
    }

    @Override
    protected String polewa() {
        return "Posypujemy kakao i wstawiamy do lodówki na 5 godzin";
    }
    
}
