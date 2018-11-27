/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodaszablonowa;

import java.util.List;

/**
 *
 * @author lenovo
 */
public class KonkretnyIteratorCiast implements IteratorCiast{
    private static int pozycja  = 0;
    private List <Przepis> lista;
    
    public KonkretnyIteratorCiast(List <Przepis> lista){
        this.lista = lista;
    }

    @Override
    public String currentItem() {
        return lista.get(pozycja).przepisOgolny();
    }

    @Override
    public boolean hasNext() {
        pozycja++;
        if(pozycja == 10) pozycja = 0;
        return true;
    }

    @Override
    public boolean hasPrev() {
        pozycja--;
        if(pozycja == -1) pozycja = 9;
        return true;
    }    
}
