package Visual;

import Logic.Producto;
import Logic.Usuario;
import java.awt.Image;
import javax.swing.ImageIcon;
import Logic.Carrito;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class VistaProducto extends javax.swing.JFrame {
    private ImageIcon imagen;
    private Icon icono;
    private Producto producto = new Producto();
    private Usuario usuario = new Usuario();
    
   

    public VistaProducto(Producto producto,Usuario usuario) {
        //this.setLocationRelativeTo(this);
        //this.pintarimagen(this.jlogo, "/Imagenes/LogoMin.jpg");
        this.usuario = usuario;
        this.producto = producto;
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
         
    }

    public DefaultComboBoxModel modelo(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for(int num=0;num<=producto.getCantidad();num++){
            modelo.addElement(num);
        }
    return modelo;
}
    public VistaProducto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLImagen = new javax.swing.JLabel();
        jLNombreProducto = new javax.swing.JLabel();
        JLtituloIma = new javax.swing.JLabel();
        JLTituloDes = new javax.swing.JLabel();
        JLDescripcion = new javax.swing.JLabel();
        JLTituloLoca = new javax.swing.JLabel();
        JLLocalizacion = new javax.swing.JLabel();
        JLTituloCan = new javax.swing.JLabel();
        JLCantidad = new javax.swing.JLabel();
        JLTituloPre = new javax.swing.JLabel();
        JLPrecio = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTRegreso = new javax.swing.JToggleButton();
        jTAgregar = new javax.swing.JToggleButton();
        jcbCantidad = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        JLImagen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JLImagen.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLNombreProducto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLNombreProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLNombreProducto.setText("Nombre del producto.");

        JLtituloIma.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLtituloIma.setText("Imagen");

        JLTituloDes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLTituloDes.setText("Descripcion");

        JLDescripcion.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        JLDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLDescripcion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JLTituloLoca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLTituloLoca.setText("Localizacion");

        JLLocalizacion.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        JLLocalizacion.setText("jLabel7");
        JLLocalizacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JLTituloCan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLTituloCan.setText("Cantidad");

        JLCantidad.setBackground(new java.awt.Color(255, 255, 255));
        JLCantidad.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        JLCantidad.setText("jLabel9");
        JLCantidad.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JLTituloPre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLTituloPre.setText("Precio");

        JLPrecio.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        JLPrecio.setText("jLabel11");
        JLPrecio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1253, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jTRegreso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTRegreso.setText("Regreso");
        jTRegreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTRegresoActionPerformed(evt);
            }
        });

        jTAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTAgregar.setText("Agregar carrito.");
        jTAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTAgregarActionPerformed(evt);
            }
        });

        jcbCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Cantidad");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jTRegreso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 401, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addComponent(jcbCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jTAgregar)
                .addGap(267, 267, 267))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTRegreso)
                    .addComponent(jTAgregar)
                    .addComponent(jcbCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(93, 93, 93))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(JLTituloCan, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(JLTituloPre, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(JLTituloLoca, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(334, 334, 334)
                                .addComponent(JLTituloDes, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(JLCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(JLPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(JLLocalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(JLDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(JLtituloIma, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 1076, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JLtituloIma)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JLImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JLTituloCan)
                                    .addComponent(JLTituloPre)
                                    .addComponent(JLTituloLoca))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(JLCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JLPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(JLLocalizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(JLTituloDes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JLDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTRegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTRegresoActionPerformed
        Inicio regreso = new Inicio();
        regreso.setUsuario(usuario);
        regreso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jTRegresoActionPerformed

    private void jTAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTAgregarActionPerformed

        Carrito regi=new Carrito(); 
        jcbCantidad.getSelectedItem();
        regi.setIdproducto(producto.getIDProducto());
        regi.AgregarCarrito();
        JOptionPane.showMessageDialog(null, "tu producto fue agregado con éxito");
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jTAgregarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ImageIcon img;
        jLNombreProducto.setText(producto.getNombre());
        JLCantidad.setDisplayedMnemonic(producto.getCantidad());
        JLPrecio.setText(Double.toString(producto.getPrecio()));
        JLDescripcion.setText(producto.getDescripcion());
        JLLocalizacion.setText(producto.getLocacion());
        JLCantidad.setText(Integer.toString(producto.getCantidad()));
        jcbCantidad.setModel(this.modelo());
        if (producto.getImagen() == null) {
            img = new ImageIcon(getClass().getResource("/Imagenes/productoSinImagen.jpg"));
        } else {
            img = new ImageIcon(producto.getImagen());
        }
        JLImagen.setIcon(new ImageIcon(img.getImage().getScaledInstance(JLImagen.getWidth(), JLImagen.getHeight(), Image.SCALE_SMOOTH)));
        
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProducto().setVisible(true);
            }
        });
    }
    
    private void pintarimagen(JLabel lb1,String ruta){
        this.imagen=new ImageIcon(ruta);
 this.icono=new ImageIcon(this.imagen.getImage().getScaledInstance(lb1.getWidth(), lb1.getHeight(), Image.SCALE_DEFAULT));
 lb1.setIcon(this.icono);
 this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLCantidad;
    private javax.swing.JLabel JLDescripcion;
    private javax.swing.JLabel JLImagen;
    private javax.swing.JLabel JLLocalizacion;
    private javax.swing.JLabel JLPrecio;
    private javax.swing.JLabel JLTituloCan;
    private javax.swing.JLabel JLTituloDes;
    private javax.swing.JLabel JLTituloLoca;
    private javax.swing.JLabel JLTituloPre;
    private javax.swing.JLabel JLtituloIma;
    private javax.swing.JLabel jLNombreProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jTAgregar;
    private javax.swing.JToggleButton jTRegreso;
    private javax.swing.JComboBox<String> jcbCantidad;
    // End of variables declaration//GEN-END:variables
}
