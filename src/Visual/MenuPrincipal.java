/*
 * To change this license header, choose License Headers in Project Properties.
 * Owen Figueroa -10-
 */
package Visual;

/**
 *
 * @author Owen Figueroa
 */
public class MenuPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        btnJugar = new javax.swing.JButton();
        btnMiCuenta = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        btnJugar.setText("Jugar Chaturanga");
        btnJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnJugarMouseClicked(evt);
            }
        });
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        btnJugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnJugarKeyTyped(evt);
            }
        });
        add(btnJugar);
        btnJugar.setBounds(130, 90, 140, 23);

        btnMiCuenta.setText("Mi Cuenta");
        btnMiCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiCuentaActionPerformed(evt);
            }
        });
        add(btnMiCuenta);
        btnMiCuenta.setBounds(130, 130, 140, 23);

        btnReportes.setText("Reportes");
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportesMouseClicked(evt);
            }
        });
        add(btnReportes);
        btnReportes.setBounds(130, 170, 140, 23);

        btnLogOut.setText("Log Out");
        btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOutMouseClicked(evt);
            }
        });
        add(btnLogOut);
        btnLogOut.setBounds(310, 260, 71, 23);
        add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 300);
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseClicked
        // TODO add your handling code here:
        Menu.menu.setPanel(new MenuInicial());
    }//GEN-LAST:event_btnLogOutMouseClicked

    private void btnJugarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnJugarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJugarKeyTyped

    private void btnJugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJugarMouseClicked
        // TODO add your handling code here:
        Menu.menu.setPanel(new JugarChaturanga());
    }//GEN-LAST:event_btnJugarMouseClicked

    private void btnMiCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiCuentaActionPerformed
        // TODO add your handling code here:
        Menu.menu.setPanel(new MiCuenta());
    }//GEN-LAST:event_btnMiCuentaActionPerformed

    private void btnReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseClicked
        // TODO add your handling code here:
        Menu.menu.setPanel(new Reportes());
    }//GEN-LAST:event_btnReportesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnMiCuenta;
    private javax.swing.JButton btnReportes;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}