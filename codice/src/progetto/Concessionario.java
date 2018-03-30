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
public class Concessionario implements Observer{

    private int tipo;
    private int optional;
    private Cliente c;
    private AbstractFactory factory;
    private Berlina berlina;
    private Suv suv;
    
    public Concessionario(Cliente c){
        this.c = c;
        this.c.Attach(this);
    }

    @Override
    public void update() {
        this.tipo = c.getTipo();
        this.optional = c.getOptional();
        createFactory();
    }

    private void createFactory(){     
        if(optional == 0){
            factory = new FactoryStandard();
        }else if (optional == 1){
            factory = new FactoryOptional();
        }
        if(tipo == 0){
            berlina = factory.createBerlina();
            berlina.create();
        }else if (tipo == 1){
            suv = factory.createSuv();
            suv.create();
        }
    }
    
    public int getTipo() {
        return tipo;
    }

    public int getOptional() {
        return optional;
    }
    
}
