
package Visual;
import Logic.*;
import javax.swing.*;
import java.awt.Image;

public class NewProduct extends javax.swing.JFrame {
    private GestionImg gestion = new GestionImg();
    private Usuario vendedor;
    private Producto producto;
    
    //Constructor
    public NewProduct(Usuario u) {
        this.vendedor = u;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    //Constructor
    public NewProduct(Producto p, Usuario u) {
        this.vendedor = u;
        this.producto = p;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    public void setUsuario(Usuario u){
        this.vendedor = u; 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLnombre = new javax.swing.JLabel();
        jT_nombreProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jT_Cantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Descripcion = new javax.swing.JTextArea();
        jT_Locacion = new javax.swing.JTextField();
        jT_Precio = new javax.swing.JTextField();
        jLImagen = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jBAbrirArchivo = new javax.swing.JButton();
        jB_guardarProducto = new javax.swing.JButton();
        jC_Categoria = new javax.swing.JComboBox<>();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLnombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLnombre.setText("Nombre del Producto:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 10);
        jPanel1.add(jLnombre, gridBagConstraints);

        jT_nombreProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 10);
        jPanel1.add(jT_nombreProducto, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Cantidad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 10);
        jPanel1.add(jLabel2, gridBagConstraints);

        jT_Cantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jT_Cantidad.setMaximumSize(new java.awt.Dimension(200, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 10);
        jPanel1.add(jT_Cantidad, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Categoria: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 10);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Locacion:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Precio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 10);
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Descripcion:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel6, gridBagConstraints);

        jScrollPane1.setMaximumSize(new java.awt.Dimension(100, 100));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(100, 50));

        jT_Descripcion.setColumns(20);
        jT_Descripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jT_Descripcion.setRows(5);
        jT_Descripcion.setMaximumSize(new java.awt.Dimension(100, 100));
        jScrollPane1.setViewportView(jT_Descripcion);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 60;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jT_Locacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 365;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel1.add(jT_Locacion, gridBagConstraints);

        jT_Precio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 10);
        jPanel1.add(jT_Precio, gridBagConstraints);

        jLImagen.setBackground(new java.awt.Color(255, 255, 255));
        jLImagen.setToolTipText("");
        jLImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLImagen.setMaximumSize(new java.awt.Dimension(200, 200));
        jLImagen.setOpaque(true);
        jLImagen.setPreferredSize(new java.awt.Dimension(200, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLImagen, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Producto Nuevo");
        jLabel9.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel9, gridBagConstraints);

        jBAbrirArchivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBAbrirArchivo.setText("Abrir Archivos");
        jBAbrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAbrirArchivoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(jBAbrirArchivo, gridBagConstraints);

        jB_guardarProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jB_guardarProducto.setText("Guardar Producto");
        jB_guardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_guardarProductoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(jB_guardarProducto, gridBagConstraints);

        jC_Categoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jC_Categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Categoria...", "Electrodomesticos", "Consolas y Videojuegos", "Ropa", "Deportes", "Hogar", "Jugueteria" }));
        jC_Categoria.setMinimumSize(new java.awt.Dimension(142, 25));
        jC_Categoria.setPreferredSize(new java.awt.Dimension(145, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 10);
        jPanel1.add(jC_Categoria, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAbrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAbrirArchivoActionPerformed
        
        if(gestion.abrirImagen()){
            jLImagen.setIcon(new ImageIcon(new ImageIcon(gestion.getImagen()).getImage().getScaledInstance(jLImagen.getWidth(), jLImagen.getHeight(),Image.SCALE_SMOOTH)));
        }else{
            jLImagen.setIcon(null);
        }
    }//GEN-LAST:event_jBAbrirArchivoActionPerformed
    
    private void jB_guardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_guardarProductoActionPerformed
        boolean band = true;
        
        //verifica las casillas numericas tenga valor numerico y no esten vacioas
        if(jT_Cantidad.getText().isBlank()||isNumero(jT_Cantidad.getText())){
            jT_Cantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            band = false;
        } else{
            jT_Cantidad.setBorder(null);
        }
        if(jT_Precio.getText().isBlank()||isNumero(jT_Precio.getText())){
            jT_Precio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            band = false;
        }else{
            jT_Precio.setBorder(null);
        }
        //verifica las demas casillas que tengan valor
        if(jT_nombreProducto.getText().isBlank()){
            jT_nombreProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            band = false;
        }else{
            jT_nombreProducto.setBorder(null);
        }
        if(jC_Categoria.getSelectedIndex()==0){
            jC_Categoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            band = false;
        }else{
            jC_Categoria.setBorder(null);
        }
        if(jT_Descripcion.getText().isBlank()){
            jT_Descripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            band = false;
        }else{
            jT_Descripcion.setBorder(null);
        }
        if(jT_Locacion.getText().isBlank()){
            jT_Locacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            band = false;
        }else{
            jT_Locacion.setBorder(null);
        }
        
        if(jLImagen.getIcon()==null){
            int  res = JOptionPane.showConfirmDialog(null,"¿Desea Guardar sin una imagen?");
            System.out.println(res);
            if(res != 0){
                jLImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                band = false;
            }else{
                jLImagen.setBorder(null);
            }
        }
        
        if(band){
            
            if("Guardar Producto".equals(jB_guardarProducto.getText())){
                producto = new Producto();
                producto = obtenerInfo(producto);
                
                /*if(producto.agregarProducto(vendedor)){
                    System.out.println("Se ha guardado con exito");
                    limpiarCasillas();
                    int res = JOptionPane.showConfirmDialog(null, "Desea Añadir otro producto");
                    if(res!=0){
                        this.setVisible(false);
                    }
                }else{
                    System.out.println("Error al guardar");
                }*/
            }else{
                producto = obtenerInfo(producto);
                if(producto.actualizarProducto()){
                    System.out.println("Se ha actualizado con exito");
                    limpiarCasillas();
                    this.setVisible(false);
                }else{
                    System.out.println("Error al actualizar");
                }
            }
            
        }
    }//GEN-LAST:event_jB_guardarProductoActionPerformed
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(producto != null){
            producto.consultarPorId();
            jC_Categoria.setSelectedItem(producto.getCategoria());
            jT_nombreProducto.setText(producto.getNombre());
            jT_Cantidad.setText(Integer.toString(producto.getCantidad()));
            jT_Descripcion.setText(producto.getDescripcion());
            jT_Locacion.setText(producto.getLocacion());
            jT_Precio.setText(Double.toString(producto.getPrecio()));
            try{
                jLImagen.setIcon(new ImageIcon(new ImageIcon(producto.getImagen()).getImage().getScaledInstance(jLImagen.getWidth(), jLImagen.getHeight(), Image.SCALE_SMOOTH)));
            }catch(Exception ex){
                System.out.println("Error "+ ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened
    
    private boolean isNumero(String num){
        try{
            double numero = Double.parseDouble(num);
            return false;
        }catch(NumberFormatException e){
            return true;
        }
    }
    
    private void limpiarCasillas(){
        jT_nombreProducto.setText("");
        jC_Categoria.setSelectedIndex(0);
        jT_Descripcion.setText("");
        jT_Locacion.setText("");
        jT_Cantidad.setText("");
        jT_Precio.setText("");
        jLImagen.setIcon(null);
    }
    
    private Producto obtenerInfo(Producto p){
        p.setCantidad(Integer.parseInt(jT_Cantidad.getText()));
        p.setNombre(jT_nombreProducto.getText());
        p.setCategoria(jC_Categoria.getSelectedItem().toString());
        p.setDescripcion(jT_Descripcion.getText());
        p.setLocacion(jT_Locacion.getText());
        p.setPrecio(Double.parseDouble(jT_Precio.getText()));
        if(jLImagen.getBorder()!=null){
            if(gestion.getImagen() == null){
                gestion.setImagen(producto.getImagen());
            }
            p.setImagen(gestion.getImagen());
        }
        
        return p;
    }
    
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewProduct(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAbrirArchivo;
    public javax.swing.JButton jB_guardarProducto;
    private javax.swing.JComboBox<String> jC_Categoria;
    private javax.swing.JLabel jLImagen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jT_Cantidad;
    private javax.swing.JTextArea jT_Descripcion;
    private javax.swing.JTextField jT_Locacion;
    private javax.swing.JTextField jT_Precio;
    private javax.swing.JTextField jT_nombreProducto;
    // End of variables declaration//GEN-END:variables
}
