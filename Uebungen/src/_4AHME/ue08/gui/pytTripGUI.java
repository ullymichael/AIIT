/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _4AHME.ue08.gui;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import _4AHME.ue08.calc.PytTripRechner;
import _4AHME.ue08.data.PytTrip;
/**
 *
 * @author micha
 */
public class pytTripGUI extends javax.swing.JFrame {

    /**
     * Creates new form pytTripGUI
     */
    public pytTripGUI() {
        initComponents();
        listenfeld.setModel(new PytTripListModel(new ArrayList<>()));
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

        pMain = new javax.swing.JPanel();
        pWest = new javax.swing.JPanel();
        pText = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        spObergrenze = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        tfErgebnisse = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        tfDauer = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        pButtons = new javax.swing.JPanel();
        pBerechnen = new javax.swing.JButton();
        pLoeschen = new javax.swing.JButton();
        pBeenden = new javax.swing.JButton();
        Liste = new javax.swing.JScrollPane();
        listenfeld = new javax.swing.JList<>();
        pSouth = new javax.swing.JPanel();
        ProgressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Pythagoräische Tripel V 0.1");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                onWindowClosing(evt);
            }
        });

        pMain.setLayout(new java.awt.GridLayout(1, 2));

        pWest.setLayout(new java.awt.GridLayout(2, 1));

        java.awt.GridBagLayout pTextLayout = new java.awt.GridBagLayout();
        pTextLayout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        pTextLayout.rowHeights = new int[] {0, 5, 0, 5, 0};
        pText.setLayout(pTextLayout);

        jLabel1.setText("Obergrenze");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        pText.add(jLabel1, gridBagConstraints);

        spObergrenze.setModel(new javax.swing.SpinnerNumberModel(20, 1, 9999, 10));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        pText.add(spObergrenze, gridBagConstraints);

        jLabel2.setText("Ergebnisse");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        pText.add(jLabel2, gridBagConstraints);

        tfErgebnisse.setColumns(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        pText.add(tfErgebnisse, gridBagConstraints);

        jLabel3.setText("Dauer");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        pText.add(jLabel3, gridBagConstraints);

        tfDauer.setColumns(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        pText.add(tfDauer, gridBagConstraints);

        pWest.add(pText);

        pButtons.setLayout(new java.awt.GridLayout(3, 1, 0, 5));

        pBerechnen.setText("Berechnen");
        pBerechnen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onBerechnen(evt);
            }
        });
        pButtons.add(pBerechnen);

        pLoeschen.setText("Loeschen");
        pLoeschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLoeschen(evt);
            }
        });
        pButtons.add(pLoeschen);

        pBeenden.setText("Beenden");
        pBeenden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onBeenden(evt);
            }
        });
        pButtons.add(pBeenden);

        jPanel1.add(pButtons);

        pWest.add(jPanel1);

        pMain.add(pWest);

        Liste.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Liste"));

        listenfeld.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Liste.setViewportView(listenfeld);

        pMain.add(Liste);

        getContentPane().add(pMain, java.awt.BorderLayout.CENTER);

        ProgressBar.setMinimumSize(new java.awt.Dimension(100, 40));
        pSouth.add(ProgressBar);

        getContentPane().add(pSouth, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //innere Klasse
    private class PytTripSwingWorker extends SwingWorker<PytTripRechner, Object> //Erster Datentyp von dem was ich berecne
    {
        private final int obergrenze;

        public PytTripSwingWorker(int obergrenze) {
            this.obergrenze = obergrenze;
        }
        
        @Override
        protected PytTripRechner doInBackground() throws Exception {
            final PytTripRechner rechner = new PytTripRechner(obergrenze);
            return new PytTripRechner(obergrenze);
        }

        @Override
        protected void done() { 
            ProgressBar.setIndeterminate(true);
            pBerechnen.setEnabled(false);
            try {
            // kan auf swing thread zugreifen
            PytTripRechner rechner = get();
            final List<PytTrip> pytTrips = new rechner
            listenfeld.setModel(new PytTripListModel(pytTrips));
            tfErgebnisse.setValue(pytTrips.size());
            tfDauer.setValue(rechner.getDauerInMs());//To change body of generated methods, choose Tools | Templates.
            } catch (InterruptedException ignore) {
                
            } catch (ExecutionException ex) {
                JOptionPane.showMessageDialog(pytTripGUI.this, ex.getCause().getMessage(), "Fehler aufgetreten", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
    
    private void loeschen()
    {
              listenfeld.setModel(new PytTripListModel(new ArrayList<>()));
        tfErgebnisse.setValue(0);
        tfDauer.setValue(0);
    }
    private void onBerechnen(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onBerechnen
        loeschen();
        pBerechnen.setEnabled(false);
        final int obergrenze =  ((Number)spObergrenze.getValue()).intValue();
        ProgressBar.setIndeterminate(true);
        ProgressBar.setString("Thinking....");
        ProgressBar.setStringPainted(true);
        new PytTripSwingWorker(obergrenze).execute();
      /* try{
            final PytTripRechner rechner = new PytTripRechner(obergrenze);
            final List<PytTrip> pytTrips = rechner.getPytTrips();
            listenfeld.setModel(new PytTripListModel(pytTrips));
            tfErgebnisse.setValue(pytTrips.size());
            tfDauer.setValue(rechner.getDauerInMs());
       }
       catch (Exception ex)
       {
           System.out.println(""+ex.getMessage());
       }*/
           
        
     
    }//GEN-LAST:event_onBerechnen
    
    private void onX()
    {
        if(JOptionPane.showConfirmDialog(this, "Programm wirklich beenden?", "Sicherheitsabfrage", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
            dispose();
        }
    }
    private void onLoeschen(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLoeschen
        loeschen();
    }//GEN-LAST:event_onLoeschen

    private void onBeenden(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onBeenden
        onX();
    }//GEN-LAST:event_onBeenden

    private void onWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onWindowClosing
        onX();
    }//GEN-LAST:event_onWindowClosing

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
            java.util.logging.Logger.getLogger(pytTripGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pytTripGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pytTripGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pytTripGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pytTripGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Liste;
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JList<PytTrip> listenfeld;
    private javax.swing.JButton pBeenden;
    private javax.swing.JButton pBerechnen;
    private javax.swing.JPanel pButtons;
    private javax.swing.JButton pLoeschen;
    private javax.swing.JPanel pMain;
    private javax.swing.JPanel pSouth;
    private javax.swing.JPanel pText;
    private javax.swing.JPanel pWest;
    private javax.swing.JSpinner spObergrenze;
    private javax.swing.JFormattedTextField tfDauer;
    private javax.swing.JFormattedTextField tfErgebnisse;
    // End of variables declaration//GEN-END:variables
}