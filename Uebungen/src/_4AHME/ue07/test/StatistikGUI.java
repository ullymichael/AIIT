/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4AHME.ue07.test;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import _4AHME.ue07.calc.StatistikRechner;

/**
 *
 * @author micha
 */
public class StatistikGUI extends javax.swing.JFrame {

    /**
     * Creates new form StatistikGUI
     */
    public StatistikGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        pMain = new javax.swing.JPanel();
        Text = new javax.swing.JLabel();
        pButtons = new javax.swing.JPanel();
        onBerechnen = new javax.swing.JButton();
        pContent = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfZahl1 = new javax.swing.JFormattedTextField();
        tfZahl2 = new javax.swing.JFormattedTextField();
        tfZahl3 = new javax.swing.JFormattedTextField();
        tfZahl4 = new javax.swing.JFormattedTextField();
        tfDurchschnitt = new javax.swing.JFormattedTextField();
        tfStandardabweichung = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Statistische Berechnungen");
        setLocationByPlatform(true);

        pMain.setLayout(new java.awt.BorderLayout());

        Text.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text.setText("Satistische Berechnungen");
        pMain.add(Text, java.awt.BorderLayout.PAGE_START);

        onBerechnen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        onBerechnen.setText("Berechnen");
        onBerechnen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onBerechnen(evt);
            }
        });
        pButtons.add(onBerechnen);

        pMain.add(pButtons, java.awt.BorderLayout.PAGE_END);

        java.awt.GridBagLayout pContentLayout = new java.awt.GridBagLayout();
        pContentLayout.columnWidths = new int[] {0, 5, 0};
        pContentLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        pContent.setLayout(pContentLayout);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Zahl 1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 0, 0);
        pContent.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Zahl 2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pContent.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Zahl 3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pContent.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Zahl 4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pContent.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Durchschnitt");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(14, 0, 0, 0);
        pContent.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Standardabweichung");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pContent.add(jLabel6, gridBagConstraints);

        tfZahl1.setColumns(10);
        tfZahl1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        tfZahl1.setValue(0.0);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 0, 0);
        pContent.add(tfZahl1, gridBagConstraints);

        tfZahl2.setColumns(10);
        tfZahl2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        tfZahl2.setValue(0.0);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pContent.add(tfZahl2, gridBagConstraints);

        tfZahl3.setColumns(10);
        tfZahl3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        tfZahl3.setValue(0.0);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pContent.add(tfZahl3, gridBagConstraints);

        tfZahl4.setColumns(10);
        tfZahl4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        tfZahl4.setValue(0.0);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pContent.add(tfZahl4, gridBagConstraints);

        tfDurchschnitt.setEditable(false);
        tfDurchschnitt.setColumns(10);
        tfDurchschnitt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.000"))));
        tfDurchschnitt.setValue(0.0
        );
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(14, 0, 0, 0);
        pContent.add(tfDurchschnitt, gridBagConstraints);

        tfStandardabweichung.setEditable(false);
        tfStandardabweichung.setColumns(10);
        tfStandardabweichung.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.000"))));
        tfStandardabweichung.setValue(0.0
        );
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        pContent.add(tfStandardabweichung, gridBagConstraints);

        pMain.add(pContent, java.awt.BorderLayout.CENTER);

        jScrollPane1.setViewportView(pMain);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onBerechnen(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onBerechnen
          try 
        {
          final ArrayList<Double> zahlen = new ArrayList<>();
          zahlen.add(((Number)tfZahl1.getValue()).doubleValue());
          zahlen.add(((Number)tfZahl2.getValue()).doubleValue());
          zahlen.add(((Number)tfZahl3.getValue()).doubleValue());
          zahlen.add(((Number)tfZahl4.getValue()).doubleValue());
          final StatistikRechner rechner = new StatistikRechner(zahlen);
          tfDurchschnitt.setValue(rechner.getDurchschnitt());
          tfStandardabweichung.setValue(rechner.getStandardabweichung());
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Fehler aufgetreten", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_onBerechnen

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
            java.util.logging.Logger.getLogger(StatistikGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatistikGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatistikGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatistikGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatistikGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton onBerechnen;
    private javax.swing.JPanel pButtons;
    private javax.swing.JPanel pContent;
    private javax.swing.JPanel pMain;
    private javax.swing.JFormattedTextField tfDurchschnitt;
    private javax.swing.JFormattedTextField tfStandardabweichung;
    private javax.swing.JFormattedTextField tfZahl1;
    private javax.swing.JFormattedTextField tfZahl2;
    private javax.swing.JFormattedTextField tfZahl3;
    private javax.swing.JFormattedTextField tfZahl4;
    // End of variables declaration//GEN-END:variables
}
