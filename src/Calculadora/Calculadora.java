
package Calculadora;

import java.awt.Image;
import java.awt.Toolkit;
import static java.lang.Math.max;
import static java.lang.Math.sqrt;
import javax.swing.ImageIcon;

public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
        this.setTitle("Calculadora PabloSoft");
        Image img = Toolkit.getDefaultToolkit().createImage(getClass().getResource("/img/logo.jpg"));
        this.setIconImage(img);
        lblogo.setIcon(new ImageIcon(img.getScaledInstance(lblogo.getWidth(), lblogo.getHeight(), Image.SCALE_SMOOTH)));
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblogo = new javax.swing.JLabel();
        lblAplicativo = new javax.swing.JLabel();
        lblNumero01 = new javax.swing.JLabel();
        lblNumero02 = new javax.swing.JLabel();
        txtNumero01 = new javax.swing.JTextField();
        txtNumero02 = new javax.swing.JTextField();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnRaizPrimerNumero = new javax.swing.JButton();
        btnRaizSegundoNumero = new javax.swing.JButton();
        btnMayor = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Logo.jpg"))); // NOI18N
        jPanel1.add(lblogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 280, 80));

        lblAplicativo.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lblAplicativo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAplicativo.setText("Aplicativo para calcular diferentes valores dados dos numeros");
        jPanel1.add(lblAplicativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 460, 40));

        lblNumero01.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        lblNumero01.setText("Numero 01:");
        jPanel1.add(lblNumero01, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        lblNumero02.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 12)); // NOI18N
        lblNumero02.setText("Numero 02:");
        jPanel1.add(lblNumero02, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        txtNumero01.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtNumero01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumero01.setBorder(null);
        txtNumero01.setPreferredSize(new java.awt.Dimension(60, 20));
        txtNumero01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumero01ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumero01, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 60, 30));

        txtNumero02.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtNumero02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumero02.setBorder(null);
        txtNumero02.setMinimumSize(new java.awt.Dimension(60, 20));
        jPanel1.add(txtNumero02, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 60, 30));

        btnSuma.setFont(new java.awt.Font("Montserrat Black", 0, 12)); // NOI18N
        btnSuma.setText("Suma");
        btnSuma.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnSuma.setMaximumSize(new java.awt.Dimension(120, 30));
        btnSuma.setMinimumSize(new java.awt.Dimension(120, 30));
        btnSuma.setPreferredSize(new java.awt.Dimension(120, 30));
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        btnResta.setFont(new java.awt.Font("Montserrat Black", 0, 12)); // NOI18N
        btnResta.setText("Resta");
        btnResta.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnResta.setMaximumSize(new java.awt.Dimension(120, 30));
        btnResta.setMinimumSize(new java.awt.Dimension(120, 30));
        btnResta.setPreferredSize(new java.awt.Dimension(120, 30));
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        jPanel1.add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        btnMultiplicacion.setFont(new java.awt.Font("Montserrat Black", 0, 12)); // NOI18N
        btnMultiplicacion.setText("Multiplicacion");
        btnMultiplicacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnMultiplicacion.setMaximumSize(new java.awt.Dimension(120, 30));
        btnMultiplicacion.setMinimumSize(new java.awt.Dimension(120, 30));
        btnMultiplicacion.setPreferredSize(new java.awt.Dimension(120, 30));
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        btnDivision.setFont(new java.awt.Font("Montserrat Black", 0, 12)); // NOI18N
        btnDivision.setText("Division");
        btnDivision.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnDivision.setMaximumSize(new java.awt.Dimension(120, 30));
        btnDivision.setMinimumSize(new java.awt.Dimension(120, 30));
        btnDivision.setPreferredSize(new java.awt.Dimension(120, 30));
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        jPanel1.add(btnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        btnRaizPrimerNumero.setFont(new java.awt.Font("Montserrat Black", 0, 12)); // NOI18N
        btnRaizPrimerNumero.setText("Raiz 1er numero");
        btnRaizPrimerNumero.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnRaizPrimerNumero.setMaximumSize(new java.awt.Dimension(120, 30));
        btnRaizPrimerNumero.setMinimumSize(new java.awt.Dimension(120, 30));
        btnRaizPrimerNumero.setPreferredSize(new java.awt.Dimension(120, 30));
        btnRaizPrimerNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizPrimerNumeroActionPerformed(evt);
            }
        });
        jPanel1.add(btnRaizPrimerNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        btnRaizSegundoNumero.setFont(new java.awt.Font("Montserrat Black", 0, 12)); // NOI18N
        btnRaizSegundoNumero.setText("Raiz 2do numero");
        btnRaizSegundoNumero.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnRaizSegundoNumero.setMaximumSize(new java.awt.Dimension(120, 30));
        btnRaizSegundoNumero.setMinimumSize(new java.awt.Dimension(120, 30));
        btnRaizSegundoNumero.setPreferredSize(new java.awt.Dimension(120, 30));
        btnRaizSegundoNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizSegundoNumeroActionPerformed(evt);
            }
        });
        jPanel1.add(btnRaizSegundoNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        btnMayor.setFont(new java.awt.Font("Montserrat Black", 0, 12)); // NOI18N
        btnMayor.setText("Mayor");
        btnMayor.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnMayor.setMaximumSize(new java.awt.Dimension(120, 30));
        btnMayor.setMinimumSize(new java.awt.Dimension(120, 30));
        btnMayor.setPreferredSize(new java.awt.Dimension(120, 30));
        btnMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMayorActionPerformed(evt);
            }
        });
        jPanel1.add(btnMayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        btnLimpiar.setFont(new java.awt.Font("Montserrat Black", 0, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnLimpiar.setMaximumSize(new java.awt.Dimension(120, 30));
        btnLimpiar.setMinimumSize(new java.awt.Dimension(120, 30));
        btnLimpiar.setPreferredSize(new java.awt.Dimension(120, 30));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        lblResultado.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        lblResultado.setText("Resultado");
        jPanel1.add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        txtResultado.setFont(new java.awt.Font("Montserrat Black", 0, 14)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultado.setBorder(null);
        txtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoActionPerformed(evt);
            }
        });
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 260, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumero01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumero01ActionPerformed
    }//GEN-LAST:event_txtNumero01ActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        double num1 = Double.parseDouble(txtNumero01.getText());
        double num2 = Double.parseDouble(txtNumero02.getText());
        txtResultado.setText(String.valueOf(num1 + num2));
    }//GEN-LAST:event_btnSumaActionPerformed

    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoActionPerformed
    }//GEN-LAST:event_txtResultadoActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        double num1 = Double.parseDouble(txtNumero01.getText());
        double num2 = Double.parseDouble(txtNumero02.getText());
        txtResultado.setText(String.valueOf(num1 - num2));
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        double num1 = Double.parseDouble(txtNumero01.getText());
        double num2 = Double.parseDouble(txtNumero02.getText());
        txtResultado.setText(String.valueOf(num1 * num2));
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        double num1 = Double.parseDouble(txtNumero01.getText());
        double num2 = Double.parseDouble(txtNumero02.getText());
        txtResultado.setText(String.valueOf(num1 / num2));
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtResultado.setText("");
        txtNumero01.setText("");
        txtNumero02.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRaizPrimerNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizPrimerNumeroActionPerformed
        double num1 = Double.parseDouble(txtNumero01.getText());
        double num2 = Double.parseDouble(txtNumero02.getText());
        txtResultado.setText(String.valueOf(sqrt(num1)));
    }//GEN-LAST:event_btnRaizPrimerNumeroActionPerformed

    private void btnRaizSegundoNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizSegundoNumeroActionPerformed
        double num1 = Double.parseDouble(txtNumero01.getText());
        double num2 = Double.parseDouble(txtNumero02.getText());
        txtResultado.setText(String.valueOf(sqrt(num2)));
    }//GEN-LAST:event_btnRaizSegundoNumeroActionPerformed

    private void btnMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMayorActionPerformed
        double num1 = Double.parseDouble(txtNumero01.getText());
        double num2 = Double.parseDouble(txtNumero02.getText());
        txtResultado.setText(String.valueOf(max(num1, num2)));
    }//GEN-LAST:event_btnMayorActionPerformed
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMayor;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnRaizPrimerNumero;
    private javax.swing.JButton btnRaizSegundoNumero;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAplicativo;
    private javax.swing.JLabel lblNumero01;
    private javax.swing.JLabel lblNumero02;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblogo;
    private javax.swing.JTextField txtNumero01;
    private javax.swing.JTextField txtNumero02;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
