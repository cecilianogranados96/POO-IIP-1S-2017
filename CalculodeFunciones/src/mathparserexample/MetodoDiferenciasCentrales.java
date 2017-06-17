package mathparserexample;
import org.mariuszgromada.math.mxparser.*;
public class MetodoDiferenciasCentrales implements CalculoDerivada {
    @Override
    public double CalcularDerivadaEn(double x, String funcion) {
        double resultado = 0.0;
        
        Function f = new Function("der(" + funcion + ","+x+")");
        double r = f.calculate(); 
        System.out.println(r);
        
        
        return resultado;   
    }
    
}
