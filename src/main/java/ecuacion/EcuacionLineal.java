package ecuacion;

/**
 * Created by al341805 on 7/02/17.
 */
public class EcuacionLineal {
    private double a; //Ecuacion lineal ax + b = 0
    private double b;

    public EcuacionLineal(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double resolver(){
        double result = b!=0?(-b)/a:0;

        return result;
    }
}
