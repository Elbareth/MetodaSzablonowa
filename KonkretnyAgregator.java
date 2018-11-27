/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodaszablonowa;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class KonkretnyAgregator implements Agregator{
    
    private List <Przepis> listaCiast = new ArrayList <Przepis> ();

    @Override
    public List <Przepis> listaCiast() {
        listaCiast.add(new Czarnylas());
        listaCiast.add(new Karpatka());
        listaCiast.add(new Kremówka());
        listaCiast.add(new Murzynek());
        listaCiast.add(new OpityIzydor());
        listaCiast.add(new Orzechowy());
        listaCiast.add(new Piernik());
        listaCiast.add(new Sachera());
        listaCiast.add(new Tiramisu());
        listaCiast.add(new WZ());
        return listaCiast;
    }

    @Override
    public IteratorCiast createIterator(List <Przepis> lista) {
        return new KonkretnyIteratorCiast(lista);
    }
    
}
