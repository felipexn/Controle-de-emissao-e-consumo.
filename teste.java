import java.util.ArrayList;

/**
 * @author felipe
 */

public class teste {
    public static void main(String[] args) {
        ArrayList<Onibus> onibus = new ArrayList();
        onibus.add(new OnibusGasolina(1, 7000));
        onibus.add(new OnibusEletrico(2,5000,4000));
        onibus.add(new OnibusHibrido(3,7000,5000));
        
        
        for(Onibus it:onibus){
            System.out.println(it);
        }
    }
    
}
