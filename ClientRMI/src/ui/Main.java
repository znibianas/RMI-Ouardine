/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;

/**
 *
 * @author Ouardine
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setTitle("Gestion des machines");
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        machineMenuItem = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        RechercheMenuItem = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        machineMenuItem.setMnemonic('e');
        machineMenuItem.setText("Gestion");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Machine");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        machineMenuItem.add(cutMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Salles");
        pasteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteMenuItemActionPerformed(evt);
            }
        });
        machineMenuItem.add(pasteMenuItem);

        menuBar.add(machineMenuItem);

        RechercheMenuItem.setMnemonic('h');
        RechercheMenuItem.setText("Recherche");
        RechercheMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RechercheMenuItemMouseClicked(evt);
            }
        });

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Recherche machine par salle");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        RechercheMenuItem.add(contentMenuItem);

        menuBar.add(RechercheMenuItem);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed

        // TODO add your handling code here:
        MachineForm mf = MachineForm.getInstance();

        if (mf == null || !mf.isVisible()) {
            mf = MachineForm.getInstance();
            desktopPane.add(mf);
            mf.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Vous avez deja une page de gestion des machines ouverte");
        }
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
        RechercheForm rf = RechercheForm.getInstance();
        if (rf == null || !rf.isVisible()) {
            rf = RechercheForm.getInstance();
            desktopPane.add(rf);
            rf.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Vous avez deja une page de recherche des machines par salles ouverte");
        }
    }//GEN-LAST:event_contentMenuItemActionPerformed

    private void pasteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteMenuItemActionPerformed
        // TODO add your handling code here:
        SalleForm sf = SalleForm.getInstance();
        if (sf == null || !sf.isVisible()) {
            sf = SalleForm.getInstance();
            desktopPane.add(sf);
            sf.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Vous avez deja une page de gestion des salles ouverte");
        }
    }//GEN-LAST:event_pasteMenuItemActionPerformed

    private void RechercheMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RechercheMenuItemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RechercheMenuItemMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu RechercheMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu machineMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem pasteMenuItem;
    // End of variables declaration//GEN-END:variables

}
