
package Visual;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.*;
import javax.swing.*;
//import Logic.GestionImg;
import Logic.Producto;
import Logic.Usuario;

public class NewProduct extends javax.swing.JFrame {
    Usuario vendedor = FVendedor.vendedor;
    Producto producto;
    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    byte[] bytesImg;
    //GestionImg gestion = new GestionImg();
    public NewProduct() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jT_nombreProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jT_Cantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Descripcion = new javax.swing.JTextArea();
        jT_Categoria = new javax.swing.JTextField();
        jT_Locacion = new javax.swing.JTextField();
        jT_Precio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLImagen = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jBAbrirArchivo = new javax.swing.JButton();
        jB_guardarProducto = new javax.swing.JButton();

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Nombre del Producto:");

        jLabel2.setText("Cantidad:");

        jLabel3.setText("Categoria: ");

        jLabel4.setText("Locacion:");

        jLabel5.setText("Precio:");

        jLabel6.setText("Descripcion:");

        jT_Descripcion.setColumns(20);
        jT_Descripcion.setRows(5);
        jScrollPane1.setViewportView(jT_Descripcion);

        jLabel7.setText("Imagen:");

        jLImagen.setBackground(new java.awt.Color(255, 255, 255));
        jLImagen.setToolTipText("");
        jLImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLImagen.setOpaque(true);

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Producto Nuevo");

        jBAbrirArchivo.setText("Abrir Archivos");
        jBAbrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAbrirArchivoActionPerformed(evt);
            }
        });

        jB_guardarProducto.setText("Guardar Producto");
        jB_guardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_guardarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jT_Locacion)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBAbrirArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jT_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jT_Categoria, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jT_nombreProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(jT_Cantidad, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(68, 68, 68)
                                        .addComponent(jB_guardarProducto)))
                                .addGap(0, 80, Short.MAX_VALUE)))))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jT_nombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_guardarProducto))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jT_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jT_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jT_Locacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jT_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(96, 96, 96))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jBAbrirArchivo)))
                        .addContainerGap(38, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAbrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAbrirArchivoActionPerformed
        if(seleccionado.showDialog(this, "ABRIR ARCHIVO") == JFileChooser.APPROVE_OPTION){
            archivo = seleccionado.getSelectedFile();
            if(archivo.canRead()){
                if(archivo.getName().endsWith("jpg")||archivo.getName().endsWith("png")||archivo.getName().endsWith("gif")){
                    //bytesImg = gestion.AbrirImagen(archivo);
                    jLImagen.setIcon(new ImageIcon(new ImageIcon(bytesImg).getImage().getScaledInstance(jLImagen.getWidth(), jLImagen.getHeight(), Image.SCALE_SMOOTH)));
                }
            }
        }
    }//GEN-LAST:event_jBAbrirArchivoActionPerformed

    private void jB_guardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_guardarProductoActionPerformed
        String nombre = jT_nombreProducto.getText();
        String categoria = jT_Categoria.getText();
        String descripcion = jT_Descripcion.getText();
        String locacion = jT_Locacion.getText();
        int cantidad = Integer.parseInt(jT_Cantidad.getText());
        double precio = Double.parseDouble(jT_Precio.getText());
        
        producto = new Producto();
        producto.setCantidad(cantidad);
        producto.setNombre(nombre);
        producto.setCategoria(categoria);
        producto.setDescripcion(descripcion);
        producto.setLocacion(locacion);
        producto.setPrecio(precio);
        String mensaje = producto.agregarProducto(vendedor);
        
        try{
            archivo = seleccionado.getSelectedFile();
            if(archivo.getName().endsWith("jpg")||archivo.getName().endsWith("png")||archivo.getName().endsWith("gif")){
                String respuesta = "";
                //respuesta = gestion.guardarImagen(bytesImg);
                if(respuesta != null){
                    //JOptionPane.showMessageDialog(null, respuesta);
                } else{
                    //JOptionPane.showMessageDialog(null, "Error al Guardar Imagen...");
                }
            }
        } catch(HeadlessException | java.lang.NullPointerException ex){
        }
        jT_nombreProducto.setText("");
        jT_Categoria.setText("");
        jT_Descripcion.setText("");
        jT_Locacion.setText("");
        jT_Cantidad.setText("");
        jT_Precio.setText("");
        jLImagen.setIcon(null);
    }//GEN-LAST:event_jB_guardarProductoActionPerformed

    
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
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAbrirArchivo;
    private javax.swing.JButton jB_guardarProducto;
    private javax.swing.JLabel jLImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jT_Cantidad;
    private javax.swing.JTextField jT_Categoria;
    private javax.swing.JTextArea jT_Descripcion;
    private javax.swing.JTextField jT_Locacion;
    private javax.swing.JTextField jT_Precio;
    private javax.swing.JTextField jT_nombreProducto;
    // End of variables declaration//GEN-END:variables
}
