
package Visual;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import Logic.Producto;
import Logic.Usuario;

public class FVendedor extends javax.swing.JFrame {
    public static Usuario vendedor;
    
    public FVendedor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    private void crearPanelesProductos(Usuario u){
        if(u == null){
            System.out.println("El objeto esta vacio");
        }
        jPListaProductos.removeAll();
        Producto[] producto = u.consultarProduFinales();
        java.awt.GridBagConstraints gridBagConstraints;
        JPanel PanelNuevo[] = new JPanel[producto.length];
        JLabel[] jLNombreProducto = new JLabel[producto.length];
        JLabel[] jLImg = new JLabel[producto.length];
        JLabel[] jLseparador = new JLabel[producto.length];
        JLabel[] jLcantidad = new JLabel[producto.length];
        JLabel[] jLprecio = new JLabel[producto.length];
        JLabel[] jLCategoria = new JLabel[producto.length];
        JLabel[] jLDireccion = new JLabel[producto.length];
        JLabel[] jLDescripcion = new JLabel[producto.length];
        JLabel[] jLCantidadAsig = new JLabel[producto.length];
        JLabel[] jLCategoriaAsig = new JLabel[producto.length];
        JLabel[] jLDireccionAsig = new JLabel[producto.length];
        JLabel[] jLPrecioAsig = new JLabel[producto.length];
        ImageIcon[] img = new ImageIcon[producto.length];
        JScrollPane[] scrollDesc = new JScrollPane[producto.length];
        JTextArea[] areaDesc = new JTextArea[producto.length];
        JButton[] jBActualizarProducto = new JButton[producto.length];
        JButton[] jBEliminarProducto = new JButton[producto.length];

        
        for(int i=0; i<producto.length; i++){
            
            //Creacion del panel
            PanelNuevo[i] = new JPanel();
            PanelNuevo[i].setPreferredSize(new Dimension(600,200));
            PanelNuevo[i].setMinimumSize(new Dimension(500,50));
            PanelNuevo[i].setLayout(new GridBagLayout());
            
            //Label nombre de producto
            jLNombreProducto[i] = new JLabel();
            jLNombreProducto[i].setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            jLNombreProducto[i].setMaximumSize(new java.awt.Dimension(50, 15));
            jLNombreProducto[i].setPreferredSize(new java.awt.Dimension(60, 15));
            jLNombreProducto[i].setText(producto[i].getNombre());
            jLNombreProducto[i].setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.gridheight = 5;
            gridBagConstraints.ipadx = 50;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
            gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
            PanelNuevo[i].add(jLNombreProducto[i], gridBagConstraints);
            
            //creacion de label con imgaen
            jLImg[i] = new JLabel();
            jLImg[i].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLImg[i].setPreferredSize(new Dimension(130,130));
            try {
                img[i] = new ImageIcon(getClass().getResource("/Imagenes/"+Integer.toString(producto[i].getIDProducto())+".jpg"));
                jLImg[i].setIcon(new ImageIcon(img[i].getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH)));
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.gridheight = 5;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
                gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
                PanelNuevo[i].add(jLImg[i], gridBagConstraints);
            } catch (Exception e) {
                //System.out.println("imagen "+i+" "+e);
            }
            
            //separador
            jLseparador[i] = new JLabel();
            jLseparador[i].setOpaque(true);
            jLseparador[i].setBackground(new java.awt.Color(0, 0, 0));
            jLseparador[i].setMinimumSize(new java.awt.Dimension(4, 50));
            jLseparador[i].setPreferredSize(new java.awt.Dimension(4, 100));
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 4;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.gridheight = 6;
            gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
            gridBagConstraints.weighty = 1.0;
            PanelNuevo[i].add(jLseparador[i], gridBagConstraints);
            
            //label cantidad
            jLcantidad[i] = new JLabel();
            jLcantidad[i].setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            jLcantidad[i].setText("Cantidad:");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 2;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.ipady = 10;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
            gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 10);
            PanelNuevo[i].add(jLcantidad[i], gridBagConstraints);
            
            //label precio
            jLprecio[i] = new JLabel();
            jLprecio[i].setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            jLprecio[i].setText("Precio:");
            jLprecio[i].setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 2;
            gridBagConstraints.gridy = 4;
            gridBagConstraints.ipady = 10;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
            PanelNuevo[i].add(jLprecio[i], gridBagConstraints);
            
            //label categoria
            jLCategoria[i] = new JLabel();
            jLCategoria[i].setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            jLCategoria[i].setText("Categoria:");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 2;
            gridBagConstraints.gridy = 2;
            gridBagConstraints.ipady = 10;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
            gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
            PanelNuevo[i].add(jLCategoria[i], gridBagConstraints);
            
            //label direccion
            jLDireccion[i] = new JLabel();
            jLDireccion[i].setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            jLDireccion[i].setText("Direccion:");
            jLDireccion[i].setVerticalAlignment(javax.swing.SwingConstants.TOP);
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 5;
            gridBagConstraints.gridy = 5;
            gridBagConstraints.ipady = 10;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
            gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
            PanelNuevo[i].add(jLDireccion[i], gridBagConstraints);
            
            //label descripcion
            jLDescripcion[i] = new JLabel(); 
            jLDescripcion[i].setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            jLDescripcion[i].setText("Descripcion:");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 5;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.ipady = 10;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
            gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 10);
            PanelNuevo[i].add(jLDescripcion[i], gridBagConstraints);
            
            //Scroll Area para la descripcion del producto
            scrollDesc[i] = new JScrollPane();
            scrollDesc[i].setPreferredSize(new java.awt.Dimension(100, 50));
            scrollDesc[i].setMaximumSize(new java.awt.Dimension(100, 50));
            //textArea de desc
            areaDesc[i] = new JTextArea();
            areaDesc[i].setLineWrap(true);
            areaDesc[i].setWrapStyleWord(true);
            areaDesc[i].setEditable(false);
            areaDesc[i].setText(producto[i].getDescripcion());
            areaDesc[i].setColumns(1);
            areaDesc[i].setRows(5);
            areaDesc[i].setMaximumSize(new java.awt.Dimension(100, 50));
            areaDesc[i].setPreferredSize(new java.awt.Dimension(100, 50));
            scrollDesc[i].setViewportView(areaDesc[i]);

            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 6;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.gridheight = 5;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 10);
            PanelNuevo[i].add(scrollDesc[i], gridBagConstraints);
            
            //cantidadAsig
            jLCantidadAsig[i] = new JLabel();
            jLCantidadAsig[i].setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            jLCantidadAsig[i].setText(Integer.toString(producto[i].getCantidad()));
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 3;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.ipady = 10;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
            gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 10);
            PanelNuevo[i].add(jLCantidadAsig[i], gridBagConstraints);
            
            //CategoriaAsig
            jLCategoriaAsig[i] = new JLabel();
            jLCategoriaAsig[i].setFont(new java.awt.Font("Tahoma", 0, 14));
            jLCategoriaAsig[i].setText(producto[i].getCategoria());
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 3;
            gridBagConstraints.gridy = 2;
            gridBagConstraints.ipady = 10;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
            gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
            PanelNuevo[i].add(jLCategoriaAsig[i], gridBagConstraints);
            
            //DireccionAsig
            jLDireccionAsig[i] = new JLabel();
            jLDireccionAsig[i].setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            jLDireccionAsig[i].setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            jLDireccionAsig[i].setText(producto[i].getLocacion());
            jLDireccionAsig[i].setVerticalAlignment(javax.swing.SwingConstants.TOP);
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 6;
            gridBagConstraints.gridy = 5;
            gridBagConstraints.ipadx = 30;
            gridBagConstraints.ipady = 10;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
            gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
            PanelNuevo[i].add(jLDireccionAsig[i], gridBagConstraints);
            
            //PrecioAsig
            jLPrecioAsig[i] = new JLabel();
            jLPrecioAsig[i].setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            jLPrecioAsig[i].setText("$"+Double.toString(producto[i].getPrecio()));
            jLPrecioAsig[i].setVerticalAlignment(javax.swing.SwingConstants.TOP);
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 2;
            gridBagConstraints.gridy = 5;
            gridBagConstraints.gridwidth = 2;
            gridBagConstraints.ipady = 10;
            gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
            PanelNuevo[i].add(jLPrecioAsig[i], gridBagConstraints);
            
            //Boton Actualizar Producto
            jBActualizarProducto[i] = new JButton(); 
            jBActualizarProducto[i].setText("Actualizar producto");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 5;
            PanelNuevo[i].add(jBActualizarProducto[i], gridBagConstraints);
            
            //Boton Eliminar Producto
            jBEliminarProducto[i] = new JButton();
            jBEliminarProducto[i].setText("Eliminar Producto");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 5;
            gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
            PanelNuevo[i].add(jBEliminarProducto[i], gridBagConstraints);

            //agrehar el panel de Producto al panel de la lista
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = i;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
            jPListaProductos.add(PanelNuevo[i], gridBagConstraints);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jB_productoNuevo = new javax.swing.JButton();
        jB_eliminarTodo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPListaProductos = new javax.swing.JPanel();
        jPNotificaciones = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 700));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setMaximumSize(new java.awt.Dimension(9999, 9999));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 700));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ventas Publicadas");

        jLNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLNombre.setText("Hola de nuevo....");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLNombre)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jB_productoNuevo.setText("Producto nuevo");
        jB_productoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_productoNuevoActionPerformed(evt);
            }
        });

        jB_eliminarTodo.setText("Eliminar Todos Los productos");
        jB_eliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_eliminarTodoActionPerformed(evt);
            }
        });

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jPListaProductos.setBackground(new java.awt.Color(204, 204, 255));
        jPListaProductos.setLayout(new java.awt.GridBagLayout());
        jScrollPane2.setViewportView(jPListaProductos);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.85;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(jScrollPane2, gridBagConstraints);

        jPNotificaciones.setBackground(new java.awt.Color(255, 51, 51));
        jPNotificaciones.setAlignmentX(5.0F);
        jPNotificaciones.setAlignmentY(5.0F);
        jPNotificaciones.setPreferredSize(new java.awt.Dimension(150, 300));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NOTIFICACIONES");

        javax.swing.GroupLayout jPNotificacionesLayout = new javax.swing.GroupLayout(jPNotificaciones);
        jPNotificaciones.setLayout(jPNotificacionesLayout);
        jPNotificacionesLayout.setHorizontalGroup(
            jPNotificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPNotificacionesLayout.setVerticalGroup(
            jPNotificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPNotificacionesLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 506, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.15;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(jPNotificaciones, gridBagConstraints);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jB_productoNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_eliminarTodo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_productoNuevo)
                    .addComponent(jB_eliminarTodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

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

    private void jB_productoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_productoNuevoActionPerformed
        NewProduct vProduct = new NewProduct();
        vProduct.setVisible(true);
    }//GEN-LAST:event_jB_productoNuevoActionPerformed

    private void jB_eliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_eliminarTodoActionPerformed
        jPListaProductos.removeAll();
        JOptionPane.showConfirmDialog(null, "Deseas eliminar todo?");
    }//GEN-LAST:event_jB_eliminarTodoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        crearPanelesProductos(vendedor);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        crearPanelesProductos(vendedor);
    }//GEN-LAST:event_formWindowActivated

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        crearPanelesProductos(vendedor);
    }//GEN-LAST:event_formWindowGainedFocus

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        crearPanelesProductos(vendedor);
    }//GEN-LAST:event_formFocusGained

     
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FVendedor().setVisible(true);
            }
        });
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_eliminarTodo;
    private javax.swing.JButton jB_productoNuevo;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPListaProductos;
    private javax.swing.JPanel jPNotificaciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
