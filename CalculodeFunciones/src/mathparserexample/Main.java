package mathparserexample;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.XYSeries;
import org.mariuszgromada.math.mxparser.*;

public class Main {

    public static void main(String[] args) {

        Function f = new Function("f(x) = x^2");
        System.out.println("f(5) = " + f.calculate(5));
        System.out.println("f(10) = " + f.calculate(10));
        System.out.println("f(7) = " + f.calculate(7));
        
        
        JFreeChart Grafica;
        XYSeries series1 = new XYSeries("Label uno", true, false);
        series1.add(0.1, 25);
        series1.add(0.2, 43);
        series1.add(0.5, 70);
        series1.add(0.64, 94);
        series1.add(0.9, 112);        
        DefaultTableXYDataset dataset = new DefaultTableXYDataset();
        dataset.addSeries(series1);
        Grafica = ChartFactory.createStackedXYAreaChart("EJEMPLO", "XLABEL", "YLABEL", dataset);
        ChartPanel Panel = new ChartPanel(Grafica);
        JFrame Ventana = new JFrame("JFreeChart");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }

}

