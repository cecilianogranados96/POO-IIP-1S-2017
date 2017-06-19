
package mathparserexample;
import org.mariuszgromada.math.mxparser.*;

public class MetodoTrapecio implements CalculoIntegral {

    public Double calcularIntegralDefinida(double a, double b, String funcion) {
        Double resultado = 0.0;
        Argument x2 = new Argument("x = "+a+"");
        Function f = new Function("f(x) = " + funcion);
        Expression e = new Expression("int("+funcion+ ", x, 0, 4)");
        Double v = e.calculate();
 
        
        Double N = 5.0;
        Double h;// = (b - a) / N;              // step size
        h = fijarNumero((b - a) / N, 10);
        System.out.println("h="+h);
        
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
            System.out.println("Sum: "+sum);
        }
        System.out.println("h: "+h);
        System.out.println("result: "+sum*h);
        resultado = fijarNumero(sum * h,10);
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
