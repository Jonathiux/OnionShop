package Visual;

import Logic.Producto;
import Logic.Usuario;
import javax.swing.*;
import java.awt.*;

public class Inicio extends javax.swing.JFrame {

    Usuario usuario;
    private String usu;

    public Inicio() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    public void IDUsuario() {
        usuario.setNombUsuario(usu);
    }

    public void paneles(Usuario usuario) {
        if (usuario == null) {
            System.out.println("No hay usuario en la sesion");
        }
        Producto[] productos = usuario.datosproductos();
        java.awt.GridBagConstraints gridBagConstraints;
        JPanel producto[] = new JPanel[productos.length];
        JLabel[] jlnomb = new JLabel[productos.length];
        JLabel[] jlNombre = new JLabel[productos.length];
        JLabel[] jlImagen = new JLabel[productos.length];
        JLabel[] jlcat = new JLabel[productos.length];
        JLabel[] jlubi = new JLabel[productos.length];
        JLabel[] jlUbicacion = new JLabel[productos.length];
        JLabel[] jlCategoria = new JLabel[productos.length];
        JButton[] jbAgregarC = new JButton[productos.length];
        JLabel[] jldesc = new JLabel[productos.length];
        JLabel[] jlprec = new JLabel[productos.length];
        JLabel[] jlPrecio = new JLabel[productos.length];
        JLabel[] jlSeparador = new JLabel[productos.length];
        JScrollPane[] jsp = new JScrollPane[productos.length];
        JTextArea[] jtaDescripcion = new JTextArea[productos.length];
        ImageIcon[] imagen = new ImageIcon[productos.length];

        for (int a = 0; a < productos.length; a++) {
            //Panel
            producto[a] = new JPanel();
            producto[a].setName(Integer.toString(productos[a].getIDProducto()));
            producto[a].setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            producto[a].setPreferredSize(new Dimension(850, 160));
            GridBagLayout Layout = new GridBagLayout();
            Layout.columnWidths = new int[]{0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
            Layout.rowHeights = new int[]{0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
            producto[a].setLayout(Layout);

            //Etiquetas
            jlnomb[a] = new JLabel();
            jlnomb[a].setText("Nombre :  ");
            jlnomb[a].setFont(new Font("Century Gothic", 0, 14));
            gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 4;
            producto[a].add(jlnomb[a], gridBagConstraints);

            jlcat[a] = new JLabel();
            jlcat[a].setText("Categoria");
            jlcat[a].setFont(new Font("Century Gothic", 0, 14));
            gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 10;
            gridBagConstraints.gridy = 4;
            producto[a].add(jlcat[a], gridBagConstraints);

            jldesc[a] = new JLabel();
            jldesc[a].setText("Descripcion");
            jldesc[a].setFont(new Font("Century Gothic", 0, 14));
            gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 18;
            gridBagConstraints.gridy = 4;
            producto[a].add(jldesc[a], gridBagConstraints);

            jlprec[a] = new JLabel();
            jlprec[a].setText("Precio");
            jlprec[a].setFont(new Font("Century Gothic", 0, 14));
            gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 26;
            gridBagConstraints.gridy = 4;
            producto[a].add(jlprec[a], gridBagConstraints);

            jlSeparador[a] = new JLabel();
            jlSeparador[a].setBackground(new Color(0, 0, 0));
            jlSeparador[a].setText("");
            jlSeparador[a].setOpaque(true);
            jlSeparador[a].setPreferredSize(new Dimension(1, 145));
            gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 16;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.gridheight = 11;
            producto[a].add(jlSeparador[a], gridBagConstraints);

            jlubi[a] = new JLabel();
            jlubi[a].setText("Ubicacion");
            jlubi[a].setFont(new Font("Century Gothic", 0, 1));
            gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 8;
            gridBagConstraints.gridy = 8;
            producto[a].add(jlubi[a], gridBagConstraints);

            //Labels con Datos del producto
            jlNombre[a] = new JLabel();
            jlNombre[a].setText(productos[a].getNombre());
            jlNombre[a].setFont(new Font("Century Gothic", 0, 14));
            gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 2;
            gridBagConstraints.gridy = 4;
            producto[a].add(jlNombre[a], gridBagConstraints);

            jlUbicacion[a] = new JLabel();
            jlUbicacion[a].setFont(new Font("Century Gothic", 0, 14));
            jlUbicacion[a].setText(productos[a].getLocacion());
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 8;
            gridBagConstraints.gridy = 10;
            gridBagConstraints.anchor = GridBagConstraints.NORTH;
            producto[a].add(jlUbicacion[a], gridBagConstraints);

            jlCategoria[a] = new JLabel();
            jlCategoria[a].setText(productos[a].getCategoria());
            jlCategoria[a].setFont(new Font("Century Gothic", 0, 14));
            gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 14;
            gridBagConstraints.gridy = 4;
            producto[a].add(jlCategoria[a], gridBagConstraints);

            jlPrecio[a] = new JLabel();
            jlPrecio[a].setText(Double.toString(productos[a].getPrecio()));
            jlPrecio[a].setFont(new Font("Century Gothic", 0, 14));
            gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 26;
            gridBagConstraints.gridy = 10;
            gridBagConstraints.insets = new Insets(-60, 0, 0, 0);
            producto[a].add(jlPrecio[a], gridBagConstraints);

            jbAgregarC[a] = new JButton();
            jbAgregarC[a].setFont(new Font("Century Gothic", 0, 14));
            jbAgregarC[a].setText("Añadir al carrito");
            gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 10;
            producto[a].add(jbAgregarC[a], gridBagConstraints);

            jsp[a] = new JScrollPane();
            jsp[a].setPreferredSize(new Dimension(226, 130));
            jtaDescripcion[a] = new JTextArea();
            jtaDescripcion[a].setColumns(20);
            jtaDescripcion[a].setRows(5);
            jtaDescripcion[a].setPreferredSize(new Dimension(224, 60));
            jsp[a].setViewportView(jtaDescripcion[a]);

            jlImagen[a] = new JLabel();
            jlImagen[a].setPreferredSize(new Dimension(130, 130));
            imagen[a] = new ImageIcon(getClass().getResource("/Imagenes/" + Integer.toString(productos[a].getIDProducto()) + ".jpg"));
            jlImagen[a].setIcon(new ImageIcon(imagen[a].getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH)));
            gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 6;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.gridheight = 11;
            producto[a].add(jlImagen[a], gridBagConstraints);

            //Agregar los paneles
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = a;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            ListaProduc.add(producto[a], gridBagConstraints);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jbSesionV = new javax.swing.JButton();
        jbCerrarS = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jtfBuscador = new javax.swing.JTextField();
        jbCarrito = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jtfPrecioMin = new javax.swing.JTextField();
        jtfPrecioMax = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jcbCategoria = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaProduc = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 255, 102));
        jPanel4.setPreferredSize(new java.awt.Dimension(1053, 1095));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        java.awt.GridBagLayout jPanel3Layout = new java.awt.GridBagLayout();
        jPanel3Layout.columnWidths = new int[] {0, 5, 0, 5, 0};
        jPanel3Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel3.setLayout(jPanel3Layout);

        jbSesionV.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbSesionV.setText("Sesión Vendedor");
        jbSesionV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSesionVActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel3.add(jbSesionV, gridBagConstraints);

        jbCerrarS.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbCerrarS.setText("Cerrar sesión");
        jbCerrarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarSActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel3.add(jbCerrarS, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel4.add(jPanel3, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(781, 70));
        jPanel2.setPreferredSize(new java.awt.Dimension(820, 60));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jtfBuscador.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jtfBuscador.setText("Buscador...");
        jtfBuscador.setPreferredSize(new java.awt.Dimension(79, 30));
        jtfBuscador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfBuscadorMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 588;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 24, 0);
        jPanel2.add(jtfBuscador, gridBagConstraints);

        jbCarrito.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbCarrito.setText("Carrito");
        jbCarrito.setPreferredSize(new java.awt.Dimension(90, 30));
        jbCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCarritoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 24, 21);
        jPanel2.add(jbCarrito, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        jPanel4.add(jPanel2, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(233, 1025));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1.setLayout(jPanel1Layout);

        jtfPrecioMin.setText("Mínimo");
        jtfPrecioMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfPrecioMinMouseClicked(evt);
            }
        });
        jtfPrecioMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPrecioMinActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jtfPrecioMin, gridBagConstraints);

        jtfPrecioMax.setText("Máximo");
        jtfPrecioMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfPrecioMaxMouseClicked(evt);
            }
        });
        jtfPrecioMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPrecioMaxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jtfPrecioMax, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setText("Categorías:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel1, gridBagConstraints);

        jcbCategoria.setBackground(new java.awt.Color(204, 204, 255));
        jcbCategoria.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todo", "Electrodomésticos", "Consola y Videojuegos", "Ropa", "Deportes", "Hogar", "Jueguetería" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jcbCategoria, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Precio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(jPanel1, gridBagConstraints);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(820, 1025));

        ListaProduc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ListaProduc.setPreferredSize(new java.awt.Dimension(820, 1025));
        ListaProduc.setLayout(new java.awt.GridBagLayout());
        jScrollPane1.setViewportView(ListaProduc);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel4.add(jScrollPane1, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCarritoActionPerformed
        carritoCompras carrito = new carritoCompras();
        carrito.setVisible(true);
    }//GEN-LAST:event_jbCarritoActionPerformed

    private void jtfBuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfBuscadorMouseClicked
        // TODO add your handling code here:
        jtfBuscador.setText("");
    }//GEN-LAST:event_jtfBuscadorMouseClicked

    private void jtfPrecioMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPrecioMaxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jtfPrecioMaxActionPerformed

    private void jtfPrecioMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPrecioMinActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jtfPrecioMinActionPerformed

    private void jtfPrecioMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfPrecioMinMouseClicked
        // TODO add your handling code here:
        jtfPrecioMin.setText("");
    }//GEN-LAST:event_jtfPrecioMinMouseClicked

    private void jtfPrecioMaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfPrecioMaxMouseClicked
        // TODO add your handling code here:
        jtfPrecioMax.setText("");
    }//GEN-LAST:event_jtfPrecioMaxMouseClicked

    private void jbCerrarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarSActionPerformed
        FLogin fl = new FLogin();
        this.setVisible(false);
        fl.setVisible(true);
        fl.usuario = new Usuario();
    }//GEN-LAST:event_jbCerrarSActionPerformed

    private void jbSesionVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSesionVActionPerformed
        // TODO add your handling code here:
        FVendedor fv = new FVendedor();
        fv.setVisible(true);
        fv.setExtendedState(MAXIMIZED_BOTH);
        this.setVisible(false);
    }//GEN-LAST:event_jbSesionVActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        paneles(usuario);
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    public String getUsu() {
        return usu;
    }

    public void setUsu(String usu) {
        this.usu = usu;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ListaProduc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCarrito;
    private javax.swing.JButton jbCerrarS;
    private javax.swing.JButton jbSesionV;
    private javax.swing.JComboBox<String> jcbCategoria;
    private javax.swing.JTextField jtfBuscador;
    private javax.swing.JTextField jtfPrecioMax;
    private javax.swing.JTextField jtfPrecioMin;
    // End of variables declaration//GEN-END:variables
}
