package mathparserexample;
import org.mariuszgromada.math.mxparser.*;
public class MetodoAproximacion implements CalculoLimite{
    @Override
    public double CalcularLimiteEn(double x, String funcion) {
        double resultado = 0.0;  
        double[] arreglo = new double[11]; 
        Function f = new Function("f(x) = " + funcion);
        double x_menor = x;
        double x_mayor = x;
        double limite_menor = 0.0;
        double limite_mayor = 0.0;
        /*Menores que el numero*/
        for(int i=5; i>=0;i--){
            x_menor = x_menor - 0.01;
            arreglo[i] = f.calculate(x_menor); 
        }
        arreglo[5] = x;
        /*Mayores que el numero*/
        for(int i=6; i<arreglo.length;i++){
            x_mayor = x_mayor + 0.01;
            arreglo[i] = f.calculate(x_mayor); 
        }
        /*Limite por menor (izquierda)*/
        for(int i=5; i>=0;i--){
            limite_menor =  fijarNumero(arreglo[i],3);       
        } 
        /*Limite por mayor (derecha)*/
        for(int i=6; i<arreglo.length;i++){
            limite_mayor =  fijarNumero(arreglo[i],3); 
        }
        
        //System.out.println("LIMITE MENOR"+limite_menor + " LIMITE MAYOR "+limite_mayor );
        resultado = (limite_menor + limite_mayor) / 2;
        return resultado; 
    }
    
    public static double fijarNumero(double numero, int digitos) {
        double resultado;
        resultado = numero * Math.pow(10, digitos);
        resultado = Math.round(resultado);
        resultado = resultado/Math.pow(10, digitos);
        return resultado;
    }
}
