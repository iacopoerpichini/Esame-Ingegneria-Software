/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progetto;

import java.util.ArrayList;

/**
 *
 * @author iacop
 */
public abstract class Subject {
    ArrayList<Observer> list = new ArrayList<>();
    public void Attach(Observer o){
        list.add(o);
    }
    public void Detach(Observer o){
        list.remove(o);
        Notify();
    }

    public void Notify() {
        for(int i = 0 ; i < list.size();i++){
            list.get(i).update();
        }
    }
}
