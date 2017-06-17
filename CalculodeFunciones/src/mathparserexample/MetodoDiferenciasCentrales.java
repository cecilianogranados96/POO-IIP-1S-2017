package mathparserexample;
import org.mariuszgromada.math.mxparser.*;
public class MetodoDiferenciasCentrales implements CalculoDerivada {
    @Override
    public double CalcularDerivadaEn(double x, String funcion) {
        Function f = new Function("f(x) = " + funcion);
        f.calculate(10); 
        
        
        double resultado = 0.0;
        
        return resultado;   
    }
    
}
