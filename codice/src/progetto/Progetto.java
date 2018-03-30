
package progetto;

/**
 *
 * @author iacop
 */
public class Progetto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c = Cliente.getIstance();
        Concessionario sc = new Concessionario(c);
        c.setAuto(0, 0);
        c.setAuto(0, 1);
        c.setAuto(1, 0);
        c.setAuto(1, 1);
  
    }
    
}
