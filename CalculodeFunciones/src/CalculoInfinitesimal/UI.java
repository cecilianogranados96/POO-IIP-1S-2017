
package CalculoInfinitesimal;

import java.awt.BorderLayout;
import java.awt.Image;
import static java.awt.SystemColor.text;
import java.net.URL;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.XYSeries;
import org.mariuszgromada.math.mxparser.*;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeriesCollection;

public class UI extends javax.swing.JFrame {
    public UI() {
        initComponents();
        lbfuncion.setText("");
        lbpunto.setText("");
        Image img =(new ImageIcon(getClass().getResource("/Images/calculator.png"))).getImage();        
        this.setIconImage(img); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbfuncion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        PanelGraficar = new javax.swing.JPanel();
        lbDerivada = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbpunto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lbLimite = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbIntegral = new javax.swing.JComboBox<>();
        lbIntegral = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pA = new javax.swing.JTextField();
        lbPuntoB = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cálculo infinitesimal");
        setBackground(new java.awt.Color(102, 102, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(null);
        setPreferredSize(new java.awt.Dimension(800, 750));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Ingrese la función:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 130, 130, 15);

        lbfuncion.setFont(new java.awt.Font("Lucida Bright", 2, 12)); // NOI18N
        lbfuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbfuncionActionPerformed(evt);
            }
        });
        getContentPane().add(lbfuncion);
        lbfuncion.setBounds(330, 130, 210, 21);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search.png"))); // NOI18N
        jButton1.setText("Calcular");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(590, 210, 100, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cálculo Infinitesimal");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(145, 40, 510, 55);

        PanelGraficar.setPreferredSize(new java.awt.Dimension(700, 290));

        javax.swing.GroupLayout PanelGraficarLayout = new javax.swing.GroupLayout(PanelGraficar);
        PanelGraficar.setLayout(PanelGraficarLayout);
        PanelGraficarLayout.setHorizontalGroup(
            PanelGraficarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        PanelGraficarLayout.setVerticalGroup(
            PanelGraficarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        getContentPane().add(PanelGraficar);
        PanelGraficar.setBounds(50, 390, 700, 290);

        lbDerivada.setEditable(false);
        lbDerivada.setFont(new java.awt.Font("Lucida Bright", 2, 12)); // NOI18N
        lbDerivada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbDerivadaActionPerformed(evt);
            }
        });
        getContentPane().add(lbDerivada);
        lbDerivada.setBounds(50, 360, 210, 21);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Ingrese el punto a evaluar:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 170, 190, 15);

        lbpunto.setFont(new java.awt.Font("Lucida Bright", 2, 12)); // NOI18N
        lbpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbpuntoActionPerformed(evt);
            }
        });
        getContentPane().add(lbpunto);
        lbpunto.setBounds(330, 170, 210, 21);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Derivada");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 340, 80, 15);

        lbLimite.setEditable(false);
        lbLimite.setFont(new java.awt.Font("Lucida Bright", 2, 12)); // NOI18N
        lbLimite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbLimiteActionPerformed(evt);
            }
        });
        getContentPane().add(lbLimite);
        lbLimite.setBounds(300, 360, 210, 21);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Límite");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(300, 340, 60, 15);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Integral Definida");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(540, 340, 130, 15);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Método de integración: ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 210, 160, 15);

        cbIntegral.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        cbIntegral.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trapecio", "Simpson" }));
        cbIntegral.setDoubleBuffered(true);
        cbIntegral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIntegralActionPerformed(evt);
            }
        });
        getContentPane().add(cbIntegral);
        cbIntegral.setBounds(330, 210, 210, 20);

        lbIntegral.setEditable(false);
        lbIntegral.setFont(new java.awt.Font("Lucida Bright", 2, 12)); // NOI18N
        lbIntegral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbIntegralActionPerformed(evt);
            }
        });
        getContentPane().add(lbIntegral);
        lbIntegral.setBounds(540, 360, 210, 21);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Ingrese el inicio:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(130, 250, 130, 15);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Ingrese el final:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(130, 290, 120, 15);

        pA.setFont(new java.awt.Font("Lucida Bright", 2, 12)); // NOI18N
        pA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pAActionPerformed(evt);
            }
        });
        getContentPane().add(pA);
        pA.setBounds(330, 250, 210, 21);

        lbPuntoB.setFont(new java.awt.Font("Lucida Bright", 2, 12)); // NOI18N
        lbPuntoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbPuntoBActionPerformed(evt);
            }
        });
        getContentPane().add(lbPuntoB);
        lbPuntoB.setBounds(330, 290, 210, 21);

        jLabel11.setBackground(new java.awt.Color(40, 105, 194));
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 800, 110);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Lucida Bright", 2, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 51));
        jLabel10.setMaximumSize(new java.awt.Dimension(800, 750));
        jLabel10.setOpaque(true);
        jLabel10.setPreferredSize(new java.awt.Dimension(800, 750));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 800, 750);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbfuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbfuncionActionPerformed

    }//GEN-LAST:event_lbfuncionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!lbfuncion.getText().isEmpty() && !lbpunto.getText().isEmpty() && !pA.getText().isEmpty()&& !lbPuntoB.getText().isEmpty())
        {
            String funcion = lbfuncion.getText(); 
            MetodoAproximacion Limite = new MetodoAproximacion();
            String resultado_Limite = Double.toString(Limite.CalcularLimiteEn(Double.parseDouble(lbpunto.getText()), funcion));
            lbLimite.setText(resultado_Limite);

            /* IMPLEMENTACION DE DERIVADA*/
            MetodoDiferenciasCentrales Derivada = new MetodoDiferenciasCentrales();
            String resultado_Derivada = Double.toString(Derivada.CalcularDerivadaEn(Double.parseDouble(lbpunto.getText()), funcion));
            lbDerivada.setText(resultado_Derivada);

             /* IMPLEMENTACION DE INTEGRAL*/
            if(cbIntegral.getSelectedItem() == "Trapecio"){
                MetodoTrapecio integral = new MetodoTrapecio();
                String resultado_Integral = Double.toString(integral.calcularIntegralDefinida(Double.parseDouble(pA.getText()),Double.parseDouble(lbPuntoB.getText()), funcion));
                lbIntegral.setText(resultado_Integral);
            }
            else{
                MetodoSimpson integral = new MetodoSimpson();
                String resultado_Integral = Double.toString(integral.calcularIntegralDefinida(Double.parseDouble(pA.getText()),Double.parseDouble(lbPuntoB.getText()), funcion));
                lbIntegral.setText(resultado_Integral);
            }


            /*IMPLEMENTACION DEL GRAFICO DE LA FUNCION*/
            XYSeries series1 = new XYSeries("Función");

            Function f = new Function("f(x) = " + funcion);
            for (int idx = 1; idx <= 100; ++idx){
              series1.add(idx,f.calculate(idx));
            }
            JFreeChart Grafica;
            XYSeriesCollection dataset = new XYSeriesCollection();
            dataset.addSeries(series1);

            Grafica =  ChartFactory.createXYLineChart("f(x) = "+funcion,"","",dataset,PlotOrientation.VERTICAL,true,true,false);
            ChartPanel Panel = new ChartPanel(Grafica);
            Panel.setMouseWheelEnabled(true);
            PanelGraficar.setLayout(new java.awt.BorderLayout());
            PanelGraficar.add(Panel,BorderLayout.CENTER);
            PanelGraficar.validate();
        }
        else{
            JOptionPane.showMessageDialog(this, "Debe llenar todos los espacios",    "Información incompleta",    JOptionPane.ERROR_MESSAGE);
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lbDerivadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbDerivadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbDerivadaActionPerformed

    private void lbpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbpuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbpuntoActionPerformed

    private void lbLimiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbLimiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbLimiteActionPerformed

    private void cbIntegralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIntegralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbIntegralActionPerformed

    private void lbIntegralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbIntegralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbIntegralActionPerformed

    private void pAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pAActionPerformed

    private void lbPuntoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbPuntoBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbPuntoBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelGraficar;
    private javax.swing.JComboBox<String> cbIntegral;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lbDerivada;
    private javax.swing.JTextField lbIntegral;
    private javax.swing.JTextField lbLimite;
    private javax.swing.JTextField lbPuntoB;
    private javax.swing.JTextField lbfuncion;
    private javax.swing.JTextField lbpunto;
    private javax.swing.JTextField pA;
    // End of variables declaration//GEN-END:variables
}
