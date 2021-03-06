/*
 * To change this license header, choose License Headers in Project Properties.
 * Owen Figueroa -10-
 */
package Visual;

import static Visual.Menu.menu;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Owen Figueroa
 */
public class MiCuenta extends javax.swing.JPanel {

    /**
     * Creates new form MiCuenta
     */
    public MiCuenta() {
        initComponents();
        String[] info = Menu.users.search(Menu.userLogged).toString().split("-");
        jLabel1.setText(info[0]);
        jLabel2.setText(info[1]);
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(Long.parseLong(info[2]));
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        String mes = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.forLanguageTag("es"));
        int año=cal.get(Calendar.YEAR);
        jLabel3.setText(dia+"/"+mes+"/"+año);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnFacebook = new javax.swing.JButton();
        btnCambiarPassword = new javax.swing.JButton();
        btnTwitter = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre");
        add(jLabel1);
        jLabel1.setBounds(120, 30, 160, 20);

        btnFacebook.setText("Conectar a Facebook");
        btnFacebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFacebookMouseClicked(evt);
            }
        });
        add(btnFacebook);
        btnFacebook.setBounds(213, 130, 170, 23);

        btnCambiarPassword.setText("Cambiar Password");
        btnCambiarPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCambiarPasswordMouseClicked(evt);
            }
        });
        add(btnCambiarPassword);
        btnCambiarPassword.setBounds(30, 130, 170, 23);

        btnTwitter.setText("Conectar a Twitter");
        btnTwitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTwitterMouseClicked(evt);
            }
        });
        add(btnTwitter);
        btnTwitter.setBounds(30, 190, 170, 23);

        btnEliminar.setText("Eliminar Cuenta");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        add(btnEliminar);
        btnEliminar.setBounds(210, 190, 170, 23);

        btnRegresar.setText("Regresar");
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });
        add(btnRegresar);
        btnRegresar.setBounds(293, 253, 90, 30);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Puntaje");
        add(jLabel2);
        jLabel2.setBounds(120, 60, 160, 20);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Fecha");
        add(jLabel3);
        jLabel3.setBounds(120, 90, 160, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        // TODO add your handling code here:
        Menu.menu.setPanel(new MenuPrincipal());
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnCambiarPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarPasswordMouseClicked
        // TODO add your handling code here:
        Menu.menu.setPanel(new NuevaPassword());
    }//GEN-LAST:event_btnCambiarPasswordMouseClicked

    private void btnFacebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacebookMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(menu, "PROXIMAMENTE ESTARA DISPONIBLE", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnFacebookMouseClicked

    private void btnTwitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTwitterMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(menu, "PROXIMAMENTE ESTARA DISPONIBLE", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnTwitterMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(menu, "PROXIMAMENTE ESTARA DISPONIBLE", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnEliminarMouseClicked
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarPassword;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFacebook;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnTwitter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
