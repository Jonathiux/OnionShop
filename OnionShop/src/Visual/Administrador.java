
package Visual;

import java.awt.*;
import javax.swing.*;
import Logic.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;


public class Administrador extends javax.swing.JFrame {
    
    private Usuario admin;
    private Producto producto = new Producto();
    
    public Administrador(Usuario admin) {
        this.admin = admin;
        fondo();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
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
        jBActualizarPanel = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        sesionComprador = new javax.swing.JMenuItem();
        cerrarSesion = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 700));
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
        jLabel1.setText("Todos los produtos en la base de datos");

        jLNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLNombre.setText("Hola de nuevo....Sr. Administrador");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
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

        jBActualizarPanel.setText("Actualizar Panel");
        jBActualizarPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarPanelActionPerformed(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBActualizarPanel))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_productoNuevo)
                    .addComponent(jB_eliminarTodo)
                    .addComponent(jBActualizarPanel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        barraMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        menu.setBorder(null);
        menu.setText("Menu");

        sesionComprador.setText("Usuarios");
        sesionComprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sesionCompradorActionPerformed(evt);
            }
        });
        menu.add(sesionComprador);

        cerrarSesion.setText("Cerrar Sesion");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        menu.add(cerrarSesion);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menu.add(salir);

        barraMenu.add(menu);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void fondo(){
            try{
                UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
            } catch(ClassNotFoundException ex){
            } catch(InstantiationException ex){
            } catch(IllegalAccessException ex){
            } catch(UnsupportedLookAndFeelException ex){
            }
            
        }
    
    protected void panelProducto(Producto p){
        
        java.awt.GridBagConstraints gridBagConstraints;
        JPanel panelNuevo;
        JLabel label = new JLabel();
        JScrollPane scrollPane = new JScrollPane();
        JTextArea areaText = new JTextArea();
        JButton boton = new JButton();
        Object[] panelescreados = jPListaProductos.getComponents();
        
        //panel de producto
        panelNuevo = new JPanel();
        panelNuevo.setName(Integer.toString(p.getIDProducto()));
        panelNuevo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelNuevo.setPreferredSize(new Dimension(600,200));
        panelNuevo.setMinimumSize(new Dimension(500,50));
        panelNuevo.setLayout(new GridBagLayout());

        //Label nombre de producto
        label = new JLabel();
        label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label.setText(p.getNombre());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panelNuevo.add(label, gridBagConstraints);

        //creacion de label con imgaen
        label = new JLabel();
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setPreferredSize(new Dimension(130,130));
        ImageIcon imagen;
        try {
            if(p.getImagen()==null){
                imagen = new ImageIcon(getClass().getResource("/Imagenes/productoSinImagen.jpg"));
            }else{
                imagen = new ImageIcon(p.getImagen());
            }
            label.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH)));
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.gridheight = 5;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
            gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
            panelNuevo.add(label, gridBagConstraints);
        } catch (Exception e) {
            System.out.println("Error "+e);
        }

        //separador
        label = new JLabel();
        label.setOpaque(true);
        label.setBackground(new java.awt.Color(0, 0, 0));
        label.setMaximumSize(new java.awt.Dimension(4, 200));
        label.setPreferredSize(new java.awt.Dimension(4, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 1.0;
        panelNuevo.add(label, gridBagConstraints);

        //label cantidad
        label = new JLabel();
        label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label.setText("Cantidad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 10);
        panelNuevo.add(label, gridBagConstraints);

        //label precio
        label = new JLabel();
        label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label.setText("Precio:");
        label.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        panelNuevo.add(label, gridBagConstraints);

        //label categoria
        label = new JLabel();
        label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label.setText("Categoria:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panelNuevo.add(label, gridBagConstraints);

        //label direccion
        label = new JLabel();
        label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label.setText("Direccion:");
        label.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panelNuevo.add(label, gridBagConstraints);

        //label descripcion
        label = new JLabel(); 
        label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label.setText("Descripcion:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 10);
        panelNuevo.add(label, gridBagConstraints);

        //Scroll Area para la descripcion del producto
        scrollPane = new JScrollPane();
        scrollPane.setPreferredSize(new java.awt.Dimension(100, 50));
        scrollPane.setMaximumSize(new java.awt.Dimension(100, 50));
        //textArea de desc
        areaText = new JTextArea();
        areaText.setLineWrap(true);
        areaText.setWrapStyleWord(true);
        areaText.setEditable(false);
        areaText.setText(p.getDescripcion());
        areaText.setColumns(1);
        areaText.setRows(5);
        areaText.setMaximumSize(new java.awt.Dimension(100, 50));
        areaText.setPreferredSize(new java.awt.Dimension(100, 50));
        scrollPane.setViewportView(areaText);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 10);
        panelNuevo.add(scrollPane, gridBagConstraints);

        //cantidadAsig
        label = new JLabel();
        label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label.setText(Integer.toString(p.getCantidad()));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 10);
        panelNuevo.add(label, gridBagConstraints);

        //CategoriaAsig
        label = new JLabel();
        label.setFont(new java.awt.Font("Tahoma", 0, 14));
        label.setText(p.getCategoria());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panelNuevo.add(label, gridBagConstraints);

        //DireccionAsig
        label = new JLabel();
        label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label.setText(p.getLocacion());
        label.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panelNuevo.add(label, gridBagConstraints);

        //PrecioAsig
        label = new JLabel();
        label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label.setText("$"+Double.toString(p.getPrecio()));
        label.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panelNuevo.add(label, gridBagConstraints);

        //Boton Actualizar Producto
        boton = new JButton(); 
        boton.setText("Actualizar producto");
        actualizarProducto(panelNuevo,boton);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        panelNuevo.add(boton, gridBagConstraints);

        //Boton Eliminar Producto
        boton = new JButton();
        boton.setText("Eliminar Producto");
        eliminacionPanel(panelNuevo, boton);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panelNuevo.add(boton, gridBagConstraints);

        //agregar el panel de Producto al panel de la lista
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = panelescreados.length + 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        jPListaProductos.add(panelNuevo, gridBagConstraints);
        
    }
    
    private void crearPanelesProductos() throws IOException{
        
            jPListaProductos.removeAll();
            ArrayList<Producto> pro = this.producto.productos();
            for (Producto p : pro) {
                panelProducto(p);
                //System.out.println("adsfdas");
            }
            this.setVisible(true);
        
    }
    
    private void eliminacionPanel(JPanel panel,JButton boton){
        ActionListener oyenteBoton = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Producto p = new Producto();
                p.setIDProducto(Integer.parseInt(panel.getName()));
                if(p.eliminarProducto()){
                    System.out.println("Producto eliminado correctamente...");
                    try {
                        jPListaProductos.removeAll();
                        crearPanelesProductos();
                    } catch (IOException ex) {
                        System.out.println("Error" + ex);
                    }
                }else{
                    System.out.println("Error al eliminar");
                }
            }
        };
        boton.addActionListener(oyenteBoton);
    }
    
    private void actualizarProducto(JPanel panel,JButton boton){
        Producto p =new Producto();
        
        ActionListener oyenteBoton = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //Component[] componente = new Component[50];
                //componente = panel.getComponents();
                p.setIDProducto(Integer.parseInt(panel.getName()));
                NewProduct np = new NewProduct(p,admin);
                np.jB_guardarProducto.setText("Actualizar Producto");
                np.setVisible(true);
            }
        };
        boton.addActionListener(oyenteBoton);
    }
    
    private void jB_productoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_productoNuevoActionPerformed
        NewProduct vProduct = new NewProduct(admin);
        vProduct.setVisible(true);
    }//GEN-LAST:event_jB_productoNuevoActionPerformed

    private void jB_eliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_eliminarTodoActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseas eliminar todo?");
        if(resp==0){
            if(admin.eliminarProductos()){
                System.out.println("Todos lo productos eliminados correctamente...");
                try {
                    crearPanelesProductos();
                } catch (IOException ex) {
                    System.out.println("Error "+ ex);
                }
            }else{
                System.out.println("Error al eliminar todos los productos...");
            }
        }
    }//GEN-LAST:event_jB_eliminarTodoActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        admin=null;
        FLogin login = new FLogin();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void sesionCompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sesionCompradorActionPerformed
        Inicio comprador1 = new Inicio();
        comprador1.setUsuario(this.admin);
        this.setVisible(false);
        comprador1.setVisible(true);
    }//GEN-LAST:event_sesionCompradorActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void jBActualizarPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarPanelActionPerformed
        
    }//GEN-LAST:event_jBActualizarPanelActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            crearPanelesProductos();
        } catch (IOException ex) {
            
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            crearPanelesProductos();
            this.setVisible(true);
        } catch (IOException ex) {
            
        }
    }//GEN-LAST:event_formWindowActivated

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador(new Usuario()).setVisible(true);
            }
        });
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem cerrarSesion;
    private javax.swing.JButton jBActualizarPanel;
    private javax.swing.JButton jB_eliminarTodo;
    private javax.swing.JButton jB_productoNuevo;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPListaProductos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem salir;
    private javax.swing.JMenuItem sesionComprador;
    // End of variables declaration//GEN-END:variables
}