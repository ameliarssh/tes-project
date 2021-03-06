/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simrs;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class frmUtama extends javax.swing.JFrame {

    /**
     * Creates new form frmUtama
     */
    public frmUtama() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuObat = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        MenuDokter = new javax.swing.JMenuItem();
        MnObat = new javax.swing.JMenuItem();
        Mnpoliklinik = new javax.swing.JMenuItem();
        Mncarabayar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Data Master");

        MenuObat.setText("Obat");
        MenuObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuObatActionPerformed(evt);
            }
        });
        jMenu1.add(MenuObat);

        jMenuItem2.setText("Tindakan");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Pasien");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transaksi");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Master");

        MenuDokter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Doctor.png"))); // NOI18N
        MenuDokter.setText("Dokter");
        MenuDokter.setPreferredSize(new java.awt.Dimension(150, 35));
        MenuDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDokterActionPerformed(evt);
            }
        });
        jMenu3.add(MenuDokter);

        MnObat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Pills.png"))); // NOI18N
        MnObat.setText("Obat");
        MnObat.setPreferredSize(new java.awt.Dimension(150, 35));
        MnObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnObatActionPerformed(evt);
            }
        });
        jMenu3.add(MnObat);

        Mnpoliklinik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/17.png"))); // NOI18N
        Mnpoliklinik.setText("Poliklinik");
        Mnpoliklinik.setPreferredSize(new java.awt.Dimension(150, 35));
        Mnpoliklinik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnpoliklinikActionPerformed(evt);
            }
        });
        jMenu3.add(Mnpoliklinik);

        Mncarabayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Money-32x32.png"))); // NOI18N
        Mncarabayar.setText("Cara Bayar");
        Mncarabayar.setPreferredSize(new java.awt.Dimension(150, 35));
        Mncarabayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MncarabayarActionPerformed(evt);
            }
        });
        jMenu3.add(Mncarabayar);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuObatActionPerformed
        frmObat form=new frmObat(this, false);
        form.setVisible(true);
    }//GEN-LAST:event_MenuObatActionPerformed

    private void MenuDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDokterActionPerformed
        // TODO add your handling code here:
        //new frmDokter(this, false).setVisible(true);
        Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
        frmDokter dokter= new frmDokter(this, false);
        //dokter.setSize(screen.width,screen.height-100);
        dokter.setVisible(true);
        //dokter.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //dokter.setTitle("Master Dokter"); 
    }//GEN-LAST:event_MenuDokterActionPerformed

    private void MnObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnObatActionPerformed
        Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
        frmObat obat= new frmObat(this, false);
        obat.setSize(screen.width-100,screen.height-100);
        obat.setVisible(true);
    }//GEN-LAST:event_MnObatActionPerformed

    private void MnpoliklinikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnpoliklinikActionPerformed
       Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
        frmpoliklinik poliklinik= new frmpoliklinik(this, false);
        poliklinik.setSize(screen.width-100,screen.height-100);
        poliklinik.setVisible(true);
    }//GEN-LAST:event_MnpoliklinikActionPerformed

    private void MncarabayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MncarabayarActionPerformed
        Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
        frmcarabayar carabayar= new frmcarabayar(this, false);
        carabayar.setSize(screen.width-100,screen.height-100);
        carabayar.setVisible(true);
    }//GEN-LAST:event_MncarabayarActionPerformed

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
            java.util.logging.Logger.getLogger(frmUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuDokter;
    private javax.swing.JMenuItem MenuObat;
    private javax.swing.JMenuItem MnObat;
    private javax.swing.JMenuItem Mncarabayar;
    private javax.swing.JMenuItem Mnpoliklinik;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
