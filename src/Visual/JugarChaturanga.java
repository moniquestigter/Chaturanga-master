/*
 * To change this license header, choose License Headers in Project Properties.
 * Owen Figueroa -10-
 */
package Visual;

import static Visual.Menu.menu;
import javax.swing.JOptionPane;

/**
 *
 * @author Owen Figueroa
 */
public class JugarChaturanga extends javax.swing.JPanel {

    /**
     * Creates new form JugarChaturanga
     */
    public JugarChaturanga() {
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

        btnNueva = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        btnNueva.setText("Nueva Partida");
        btnNueva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnNuevaKeyPressed(evt);
            }
        });
        add(btnNueva);
        btnNueva.setBounds(130, 100, 120, 23);

        btnCargar.setText("Cargar Partida");
        btnCargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCargarMouseClicked(evt);
            }
        });
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        add(btnCargar);
        btnCargar.setBounds(130, 140, 120, 23);

        btnEliminar.setText("Eliminar Partida");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        add(btnEliminar);
        btnEliminar.setBounds(130, 180, 120, 23);

        btnSalir.setText("Regresar");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        add(btnSalir);
        btnSalir.setBounds(313, 270, 80, 23);
        add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 300);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        Menu.menu.setPanel(new MenuPrincipal());
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(menu, "PROXIMAMENTE ESTARA DISPONIBLE", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnCargarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(menu, "PROXIMAMENTE ESTARA DISPONIBLE", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnNuevaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnNuevaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNueva;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
