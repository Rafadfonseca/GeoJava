package geometrias;

import java.util.*;
import static java.lang.Math.*;

public class espacial {

    public float esfera() {
        double PI, raio, areaSuperficial, volume; //soma, sub;
        areaSuperficial = 4 * Math.PI * (Math.pow(raio, 2));
        //4 pi r^2
        volume = (4 / 3) * Math.PI * (Math.pow(raio, 3));
        
        if( operacao == 1){
            return volume;
        }else{
            return areaSuperficial;
        }
    }

    public float cilindro(){

    }

}




