package debug;

import feature.Immuntable;
import feature.Singleton;

public class Main {

    public static void main(String[] args) {
        double p = Math.PI;
        int[] dD = new int[1];
        dD[0] = 5;

        /**
         * Muss ich Singleton hier callen
         */
        Singleton singleton = Singleton.getInstance(); 

        System.out.println("Die Fläche des Quadrats ist: " + Singleton.calculatingAreaRectabgle(4,4));
        System.out.println("Die Fläche des Rechteck ist: " + Singleton.calculatingAreaSquare(5));

        //Wie setze ich das richtig um
        //System.out.println("Die Koordinaten lauten: " + Singleton.calculatingDot(33,12));
        System.out.println("Die Länge von Punkt a bis b beträgt: " + Singleton.calculatingLine(33,12));

        Immuntable immu = new Immuntable(dD);

        int[] temp = immu.getDurchmesser();
        for( int a : temp){
            System.out.println("Der Umfang des Kreises ist: " + a*p);
        }
    }
}

