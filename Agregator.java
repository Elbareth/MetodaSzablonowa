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
public interface Agregator {
    public abstract List <Przepis> listaCiast();
    public abstract IteratorCiast createIterator(List <Przepis> lista);
}
