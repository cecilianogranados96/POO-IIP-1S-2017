/*
 * MetodoDelTrapecio: implementación del método del trapecio para integrales.
 */
package CalculoInfinitesimal;
import org.mariuszgromada.math.mxparser.*;

public class MetodoTrapecio implements CalculoIntegral {

    public Double calcularIntegralDefinida(double a, double b, String funcion) {
        Double resultado = 0.0;
        Argument x2 = new Argument("x = "+a+"");
        Function f = new Function("f(x) = " + funcion);
        
        Double N = 10000.0;
        Double h = (b - a) / N; 
        
        Double fa = f.calculate(a);
        Double fb = f.calculate(b);
        
        double sum = 0.0;
        
        if (!fb.isInfinite() && !fa.isInfinite() && !fa.isNaN() && !fb.isNaN())
            sum = 0.5 * (f.calculate(a) + f.calculate(b)); 
        
        // area
        for (int i = 1; i < N; i++) {
            Double x = a + h * i;
            Double fx = f.calculate(x);
            if (!fx.isInfinite() && !fx.isNaN())
                sum = sum + f.calculate(x); 
        }
        resultado = fijarNumero(sum * h,3);
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
