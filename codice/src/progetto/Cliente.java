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
public class Cliente extends Subject{
    private int tipo;
    private int optional;
    public static Cliente INSTANCE = null;
    
    private Cliente(){}
    
    public static Cliente getIstance(){
        if(INSTANCE == null){
            INSTANCE = new Cliente();
        }
        return INSTANCE;
    }
    
    public void setAuto(int tipo, int optional) {
        this.tipo = tipo;
        this.optional = optional;
        Notify();
    }

    public int getTipo() {
        return tipo;
    }

    public int getOptional() {
        return optional;
    }
    
}
