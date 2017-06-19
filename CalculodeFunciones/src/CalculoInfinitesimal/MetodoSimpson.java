/*
 * MetodoDeSimpson: implementación del método de Simpson de 1/3 para integrales.
 */
package CalculoInfinitesimal;
import org.mariuszgromada.math.mxparser.*;

public class MetodoSimpson implements CalculoIntegral{
    @Override
    public Double calcularIntegralDefinida(double a, double b, String funcion) {
        Double resultado = 0.0;
        Argument x2 = new Argument("x = "+a+"");
        Function f = new Function("f(x) = " + funcion);

        int n = 10000; 
        double h = (b - a) / (n - 1);

        // 1/3 terms
        Double fa = f.calculate(a);
        Double fb = f.calculate(b);
        
        double sumatoria = 0.0;
        
        if (!fb.isInfinite() && !fa.isInfinite() && !fa.isNaN() && !fb.isNaN())
            sumatoria = 1.0 / 3.0 * (f.calculate(a) + f.calculate(b));

        // 4/3 terms
        for (int i = 1; i < n - 1; i += 2) {
           double x = a + h * i;
           Double fx = f.calculate(x);
           if (!fx.isInfinite() && !fx.isNaN())
            sumatoria += 4.0 / 3.0 * f.calculate(x);
        }

        // 2/3 terms
        for (int i = 2; i < n - 1; i += 2) {
           double x = a + h * i;
           Double fx = f.calculate(x);
           if (!fx.isInfinite() && !fx.isNaN())
            sumatoria += 2.0 / 3.0 * f.calculate(x);
        }

        resultado = fijarNumero(sumatoria * h,3);
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
