/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21p10svai;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class FrmPrincipal extends javax.swing.JFrame {
    List<Datos> datos = new ArrayList<>();
    

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        btnagrega = new javax.swing.JButton();
        btnmuestra = new javax.swing.JButton();
        btnbusca = new javax.swing.JButton();
        btnelimina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Datos");

        jLabel2.setText("Nombre");

        jLabel3.setText("Edad");

        jLabel4.setText("Correo");

        btnagrega.setText("Grabar");
        btnagrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregaActionPerformed(evt);
            }
        });

        btnmuestra.setText("Mostrar");
        btnmuestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmuestraActionPerformed(evt);
            }
        });

        btnbusca.setText("Buscar");
        btnbusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscaActionPerformed(evt);
            }
        });

        btnelimina.setText("Eliminar");
        btnelimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(171, 171, 171)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(txtcorreo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnagrega)
                        .addGap(85, 85, 85)
                        .addComponent(btnmuestra))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnelimina)
                            .addComponent(btnbusca))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagrega)
                    .addComponent(btnmuestra))
                .addGap(18, 18, 18)
                .addComponent(btnbusca)
                .addGap(18, 18, 18)
                .addComponent(btnelimina)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregaActionPerformed
        // TODO add your handling code here:
        Datos datos = new Datos();
        ManejoArchivo archivo = new ManejoArchivo();
        
        
        datos.setNombre(txtnombre.getText());
        datos.setEdad(Integer.parseInt(txtedad.getText()));
        datos.setCorreo(txtcorreo.getText());
        
        archivo.grabar(datos); 
        limpia();
        
    }//GEN-LAST:event_btnagregaActionPerformed

    private void btnmuestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmuestraActionPerformed
        // TODO add your handling code here:
        ManejoArchivo archivo = new ManejoArchivo();
        datos = archivo.leer();
        
        datos.forEach(contenido ->{
        System.out.println("nombre" + contenido.getNombre());
        System.out.println("edad" + contenido.getEdad());
        System.out.println("correo" + contenido.getCorreo());
                
        });
        
    }//GEN-LAST:event_btnmuestraActionPerformed

    private void btnbuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaActionPerformed
        // TODO add your handling code here:
        
        String busca = JOptionPane.showInputDialog(null,"ingresa el nombre a buscar");
                
                
                datos.forEach(contenido -> {
                if (contenido.getNombre().equals(busca)){
          String nombre, correo, edad;
                nombre = contenido.getNombre();
                correo = contenido.getCorreo();
                edad = String.valueOf(contenido.getEdad());
                txtnombre.setText(nombre);
                txtedad.setText(edad);
                txtcorreo.setText(correo);
                
                
                }
                });
                
    }//GEN-LAST:event_btnbuscaActionPerformed

    private void btneliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminaActionPerformed
        // TODO add your handling code here:
        Datos edatos = new Datos();
        
        String buscar = JOptionPane.showInputDialog(null, "ingrese el nombre a buscar");
        for(int i=0;i<datos.size();i++){
        edatos = datos.get(1);
        if (edatos.getNombre().equals(buscar)){
        
           int confirma = JOptionPane.showConfirmDialog(null, "Deseas eliminarlo?", "eliminar", JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
            if(confirma == JOptionPane.OK_OPTION){
            datos.remove(1);
            break;
            }
        }
        }        
    }//GEN-LAST:event_btneliminaActionPerformed
private void limpia(){
txtnombre.setText("");
txtedad.setText("");
txtcorreo.setText("");

}
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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagrega;
    private javax.swing.JButton btnbusca;
    private javax.swing.JButton btnelimina;
    private javax.swing.JButton btnmuestra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
