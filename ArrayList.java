import java.util.ArrayList;
import java.util.Collections;

class ArrayList{
    public static void main(String[] args){
        ArrayList<KrediYöneticisi> krediler=new ArrayList<KrediYöneticisi>();
        krediler.add(new MortgageManager());
        krediler.add(new VehicleManager());
        for (KrediYöneticisi kredi : krediler){
            kredi.calculate();
        }

    }
}