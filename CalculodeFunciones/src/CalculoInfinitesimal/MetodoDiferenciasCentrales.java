package CalculoInfinitesimal;
import org.mariuszgromada.math.mxparser.*;
public class MetodoDiferenciasCentrales implements CalculoDerivada {
    @Override
    public double CalcularDerivadaEn(double x, String funcion) {
        double resultado = 0.0;
        Argument x2 = new Argument("x = "+x+"");
        Expression e = new Expression("der("+ funcion +", x)", x2);
        resultado = fijarNumero(e.calculate(),3);
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
