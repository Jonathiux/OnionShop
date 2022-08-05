package Visual;

import Logic.Producto;
import Logic.Usuario;
import java.awt.Image;
import javax.swing.ImageIcon;

public class VistaProducto extends javax.swing.JFrame {

    private Producto producto = new Producto();
    private Usuario usuario = new Usuario();

    public VistaProducto(Producto producto,Usuario usuario) {
        this.usuario = usuario;
        this.producto = producto;
        initComponents();
        this.setExtendedState(NORMAL);
        this.setLocationRelativeTo(null);
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
        jTRegreso = new javax.swing.JToggleButton();
        jTAgregar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        JLDescripcion.setText("jLabel5");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLTituloPre, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLTituloCan, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(JLtituloIma, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLTituloDes, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLTituloLoca, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JLLocalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jTRegreso)
                        .addGap(195, 195, 195)
                        .addComponent(jTAgregar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLtituloIma)
                    .addComponent(JLTituloDes))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(JLDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLTituloLoca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JLLocalizacion))
                            .addComponent(JLPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(JLTituloCan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JLTituloPre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(JLImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTRegreso)
                    .addComponent(jTAgregar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_jTAgregarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ImageIcon la;
        jLNombreProducto.setText(producto.getNombre());
        JLCantidad.setDisplayedMnemonic(producto.getCantidad());
        JLPrecio.setText(Double.toString(producto.getPrecio()));
        JLDescripcion.setText(producto.getDescripcion());
        JLLocalizacion.setText(producto.getLocacion());
        JLCantidad.setText(Integer.toString(producto.getCantidad()));
        if (producto.getImagen() == null) {
            la = new ImageIcon(getClass().getResource("/Imagenes/productoSinImagen.jpg"));
        } else {
            la = new ImageIcon(producto.getImagen());
        }
        JLImagen.setIcon(new ImageIcon(la.getImage().getScaledInstance(JLImagen.getWidth(), JLImagen.getHeight(), Image.SCALE_SMOOTH)));
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
    private javax.swing.JToggleButton jTAgregar;
    private javax.swing.JToggleButton jTRegreso;
    // End of variables declaration//GEN-END:variables
}
