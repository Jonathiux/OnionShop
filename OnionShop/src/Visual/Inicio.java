package Visual;

import Logic.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Inicio extends javax.swing.JFrame {
    
    private Usuario usuario;
    
    public Inicio() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        Imagenes();
    }
    
    private void Imagenes(){        
        ImageIcon logo = new ImageIcon(getClass().getResource("/Imagenes/LogoMin.jpg"));
        jLLogo.setIcon(new ImageIcon(logo.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
    }
    
    private void panelProducto(Producto p){
        
        GridBagConstraints gridBagConstraints;
        JPanel jPanelNuevo;
        JLabel jLabel;
        
        //panel producto
        jPanelNuevo = new JPanel();
        jPanelNuevo.setName(Integer.toString(p.getIDProducto()));
        jPanelNuevo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelNuevo.setLayout(new java.awt.GridBagLayout());
        panelDetallado(jPanelNuevo,Inicio.this);

        //label Imagen
        jLabel = new JLabel();
        ImageIcon imagen;
        if(p.getImagen()==null){
            imagen = new ImageIcon(getClass().getResource("/Imagenes/productoSinImagen.jpg"));
        }else{
            imagen = new ImageIcon(p.getImagen());
        }
        jLabel.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(190, 190, Image.SCALE_SMOOTH)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        jPanelNuevo.add(jLabel, gridBagConstraints);
        
        //label Nombre
        jLabel = new JLabel();
        jLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel.setText(p.getNombre());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 0, 10);
        jPanelNuevo.add(jLabel, gridBagConstraints);

        //label Precio
        jLabel = new JLabel();
        jLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel.setText(Double.toString(p.getPrecio()));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 10, 10);
        jPanelNuevo.add(jLabel, gridBagConstraints);
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = gridx(ListaProduc.getComponents().length);
        gridBagConstraints.gridy = gridy(ListaProduc.getComponents().length);
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        ListaProduc.add(jPanelNuevo, gridBagConstraints);
    }
    
    private void panelDetallado (JPanel panel,JFrame frame){
        MouseListener oyenteClick = new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                Producto producto = new Producto();
                producto.setIDProducto(Integer.parseInt(panel.getName()));
                producto.consultarPorId();
                VistaProducto vista = new VistaProducto(producto,usuario);
                vista.setVisible(true);
                frame.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        panel.addMouseListener(oyenteClick);
    }
    
    private void crearPanel(Usuario usuario){
        if(usuario == null){
            System.out.println("Usuario vacio");
        }else{
            ListaProduc.removeAll();
            
            Producto[] producto = usuario.datosproductos();
            //System.out.println(producto.length);
            for(Producto p:producto){
                if(p!=null){
                    panelProducto(p);
                }else{
                    System.out.println("El producto esta vacio");
                }
            }
            this.setVisible(true);
        }
    }
    
    private int gridx(int totales){
        int res = totales%4 ;
        //System.out.println("Componentes en juego: "+totales+"\nColumna: "+res);
        return res;
    }
    
    private int gridy(int totales){
        double res = (totales/4);
        int resp = (int)res;
        //System.out.println("Fila: "+resp);
        return resp;
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jbSesionV = new javax.swing.JButton();
        jbCerrarS = new javax.swing.JButton();
        jLLogo = new javax.swing.JLabel();
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
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 255, 102));
        jPanel4.setPreferredSize(new java.awt.Dimension(1053, 1095));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jbSesionV.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbSesionV.setText("Sesión Vendedor");
        jbSesionV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSesionVActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(jbSesionV, gridBagConstraints);

        jbCerrarS.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jbCerrarS.setText("Cerrar sesión");
        jbCerrarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarSActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        jPanel3.add(jbCerrarS, gridBagConstraints);

        jLLogo.setPreferredSize(new java.awt.Dimension(100, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(jLLogo, gridBagConstraints);

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
        jtfBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBuscadorActionPerformed(evt);
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
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jtfPrecioMin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtfPrecioMin.setText("Mínimo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel1.add(jtfPrecioMin, gridBagConstraints);

        jtfPrecioMax.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtfPrecioMax.setText("Máximo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        jPanel1.add(jtfPrecioMax, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Categorías:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jcbCategoria.setBackground(new java.awt.Color(204, 204, 255));
        jcbCategoria.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todo", "Electrodomésticos", "Consola y Videojuegos", "Ropa", "Deportes", "Hogar", "Jueguetería" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        jPanel1.add(jcbCategoria, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Precio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(jPanel1, gridBagConstraints);

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
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 954, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jbCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCarritoActionPerformed
        carritoCompras carrito = new carritoCompras();
        carrito.setVisible(true);
    }//GEN-LAST:event_jbCarritoActionPerformed

    private void jbCerrarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarSActionPerformed
        FLogin fl = new FLogin();
        this.setVisible(false);
        fl.setVisible(true);
    }//GEN-LAST:event_jbCerrarSActionPerformed

    private void jbSesionVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSesionVActionPerformed
        FVendedor fv = new FVendedor(this.usuario);
        fv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbSesionVActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        crearPanel(usuario);
    }//GEN-LAST:event_formWindowOpened

    private void jtfBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBuscadorActionPerformed
        Component[] comp = ListaProduc.getComponents();
        JOptionPane.showMessageDialog(null, "Ancho: "+comp[0].getWidth()+"\nLargo: "+comp[0].getHeight());
    }//GEN-LAST:event_jtfBuscadorActionPerformed
    
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ListaProduc;
    private javax.swing.JLabel jLLogo;
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
