package ecuacion;

/**
 * Created by al341805 on 7/02/17.
 */
public class EcuacionCuadratica {
    private double a;
    private double b;
    private double c;

    public EcuacionCuadratica(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void resolver(){
        if(discriminante()>0){ //Dos soluciones
            double x1 = (-b + Math.sqrt(discriminante()))/(2*a);
            double x2 = (-b - Math.sqrt(discriminante()))/(2*a);
        }
        else if(discriminante()==0){ //Solución única
            double
        }
        else{ //Soluciones complejas

        }
    }

    private double discriminante(){
        return (Math.pow(b,2)-4*a*c);
    }
}
