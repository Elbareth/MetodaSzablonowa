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
//Separator @
public abstract class Przepis {
    final public String przepisOgolny(){
        String tmp;
        tmp = ilustracja();
        tmp = tmp + "@"+tytul();
        tmp = tmp + "@"+skladniki();
        tmp = tmp + "@"+ciasto();
        tmp = tmp + "@"+masa();
        tmp = tmp + "@"+pieczenie();
        tmp = tmp + "@"+dodatki();
        tmp = tmp + "@"+polewa();
        return tmp;
    } 
    protected abstract String ilustracja();
    protected abstract String tytul();
    protected abstract String skladniki();
    protected abstract String ciasto();
    protected abstract String masa();
    protected abstract String pieczenie();
    protected abstract String dodatki();
    protected abstract String polewa();
}
