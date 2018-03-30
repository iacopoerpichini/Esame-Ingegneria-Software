/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progetto;

/**
 *
 * @author iacop
 */
public class SuvOptional implements Suv {

    @Override
    public Suv create() {
        System.out.println("Creazione suv full optional");
        return this;
    }
    
}
