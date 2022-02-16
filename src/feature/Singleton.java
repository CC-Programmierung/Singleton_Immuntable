package feature;

public class Singleton {

    private static Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public static double calculatingAreaRectabgle(double a, double b){
        return a * b;
    }

    public static double calculatingAreaSquare(double a){
        return a * a;
    }

    public static double calculatingDot(double x, double y){return y - x;}

    public static double calculatingLine(double a, double b){return b - a;}

}
