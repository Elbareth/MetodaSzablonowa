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
public class Czarnylas extends Przepis{
    @Override
    protected String ilustracja(){
       return "obraz\\czarnylas.jpeg";
    }
    @Override
    protected String tytul(){
        return "Czarnylas";
    }
    @Override
    protected String skladniki(){
        return "<html> 8 jajek <br/>"
                + "150 g mąki <br/>"
                + "150 g cukru <br/>"
                + "1 budyń czekoldowy <br/>"
                + "2 łyżki kakao <br/>"
                + "2 łyżki oliwy <br/>"
                + "szczypta soli <br/>"
                + "200 ml ponczu wiśniowego <br/>"
                + "1 słoik wiśni w kompocie <br/>"
                + "750 ml śmietanki 30 % <br/>"
                + "1 łyżka cukru pudru <br/>"
                + "3 łyżeczki żelatyny <br/>"
                + "1 tabliczna gorzkiej czekolady </html>";
    }
    @Override
    protected String ciasto(){
        return "<html>Mąkę przesiać i dokłdnie wymieszać z kakao, budyniem, proszkiem do <br/>"
                + "pieczenia i szczyptą soli. Oddzielić żółtka od białek.  Białka ubijamy <br/>"
                + "Dodajemy cukier. Pianę mieszamy z żółtkiem, mąką i oliwą</html>";
    }
    @Override
    protected String masa(){
        return "";
    }
    @Override
    protected String pieczenie(){
        return "Piec w piekarniku nagrzanym do 180 stopni przez 40 min";
    }
    @Override
    protected String dodatki(){
        return "<html>Robimy poncz: kompot mieszamy z Kirschwsser. Przygotowujemy krem: <br/>"
                + "Żelatynę rozpuszczamy w wodzie. Ubijamy śmietankę, dodajemy cukier </br>"
                + "i na końcu żelatnynę. Kroimy ciato na 3. Każdą część ponczujemy i przekładamy kremem.</html>";
    }
    @Override
    protected String polewa(){
        return "Ciasto ozdabiamy bitą śmietaną, wiórkami czekoladowymi i wiśniami";
    }
}
