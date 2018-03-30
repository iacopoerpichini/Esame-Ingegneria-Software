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
public class FactoryStandard implements AbstractFactory{

    @Override
    public Berlina createBerlina() {
        return new BerlinaStandard();
    }

    @Override
    public Suv createSuv() {
        return new SuvStandard();
    }
    
}
