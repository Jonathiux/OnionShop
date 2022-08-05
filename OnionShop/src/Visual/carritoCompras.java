package Visual;

import Logic.Ventana;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author redex
 */
public class carritoCompras extends javax.swing.JFrame {
    String producto []={"sabritas","cocacola","sopa","chicles","tequila","xbox","playstation","tv","celular","monitor"};
    double precios []={12,10,15,2,200,6000,8000,7000,2500,3000,};            
    double precio=0;
    int cantidad=0;
    DefaultTableModel MODELO=new DefaultTableModel();
    ArrayList<Ventana> listaVentas=new ArrayList<>();

    /**
     * Creates new form carritoCompras
     */
    public carritoCompras() {
        initComponents();
        this.setTitle("CARRITO DE COMPRAS");
        
     
        
        DefaultComboBoxModel comboMode1=new DefaultComboBoxModel(producto);
        cboProducto.setModel(comboMode1);
        MODELO.addColumn("DESCRIBCION");
        MODELO.addColumn("PRECIO U.");
        MODELO.addColumn("CANTIDAD");
        MODELO.addColumn("IMPORTE");
        
        
      
        

        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField2 = new javax.swing.JTextField();
        jSlider1 = new javax.swing.JSlider();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblImporte = new javax.swing.JLabel();
        cboProducto = new javax.swing.JComboBox<>();
        cpnCantidad = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblIVA = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        jCheckBox1.setText("jCheckBox1");

        jLabel6.setText("jLabel6");

        jTextField2.setText("jTextField2");

        jScrollPane4.setViewportView(jTree1);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("carrito");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("producto");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("cantidad");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("precio");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("importe");

        lblPrecio.setText("0.00 MX");

        lblImporte.setText("0.00 MX");

        cboProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProductoActionPerformed(evt);
            }
        });

        cpnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        cpnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cpnCantidadStateChanged(evt);
            }
        });

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DESCRIBCION", "PRECIO U.", "CANTIDAD", "IMPORTE"
            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        jLabel8.setText("subtotal");

        jLabel9.setText("total");

        lblSubtotal.setText("0.00 MX");

        lblTotal.setText("0.00 MX");

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar.setText("agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblIVA.setForeground(new java.awt.Color(204, 204, 255));
        lblIVA.setText("0.00 mx");

        jButton1.setText("eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("proceso de pago");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIVA)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTotal))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(lblSubtotal)))
                        .addGap(297, 297, 297)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(44, 44, 44)
                                .addComponent(cboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(48, 48, 48)
                                .addComponent(cpnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(lblImporte)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPrecio)
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecio)
                            .addComponent(jLabel4)
                            .addComponent(cboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblImporte)
                            .addComponent(jLabel5)
                            .addComponent(cpnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIVA)
                            .addComponent(jLabel7))
                        .addGap(12, 12, 12)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblSubtotal))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lblTotal))))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductoActionPerformed
     calcularprecio();
    }//GEN-LAST:event_cboProductoActionPerformed

    private void cpnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cpnCantidadStateChanged
    calcularprecio();
    }//GEN-LAST:event_cpnCantidadStateChanged

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Ventana venta=new Ventana();
        venta.setIdProductos(cboProducto.getSelectedIndex());
        venta.setDescripcion(cboProducto.getSelectedItem().toString());
        venta.setPrecio(precio);
        venta.setCantidad(cantidad);
        venta.setImporte(precio*cantidad);
        if(buscarventas(venta)){
            
        }
        listaVentas.add(venta);
        actualizarTabla();
        
        borraventa();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if (tblProductos.getSelectedRow() == -1  )
          return;
      MODELO.removeRow(tblProductos.getSelectedRow());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       MODELO.getDataVector().removeAllElements();
       tblProductos.updateUI();
               
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       ProcesoDePago  newframe = new ProcesoDePago();
       
       newframe.setVisible(true);
       
       this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
 
    
    
    
    public boolean buscarventas(Ventana nueva){
        for (Ventana v : listaVentas){
            int nuevaCantidad=v.getCantidad()+nueva.getCantidad();
            v.setCantidad(nuevaCantidad);
            v.setImporte(v.getPrecio()*nuevaCantidad);
            return true;    
        }
        return false;
        
    }
 public void borraventa(){
    precio=0;
    cantidad=1;
    cboProducto.setSelectedIndex(0);
    cpnCantidad.setValue(1);
    calcularprecio(); 

}
 
 public void calcularprecio() {
    precio=precios[cboProducto.getSelectedIndex()];
    cantidad=Integer.parseInt(cpnCantidad.getValue().toString());
   lblPrecio.setText(aMoneda(precio));
   lblImporte.setText(aMoneda(precio*cantidad));
    
 }
 
  public String aMoneda(double precio){
        return "$"+Math.round(precio*100.0)/100.0+"MX";
   
    }
  
   public void actualizarTabla(){
        while (MODELO.getRowCount()>0){
            MODELO.removeRow(0);
        }
        double subtotal=0;
        for (Ventana v : listaVentas) {
            Object x []=new Object [4];
            x [0] = v.getDescripcion();
            x [1] = aMoneda(v.getPrecio());
            x [2] = v.getCantidad();
            x [3] = aMoneda(v.getImporte());
            subtotal+=v.getImporte();
              MODELO.addRow(x);
                  
        }
        
        double iva=subtotal*0.16;
        double total=subtotal+iva;
        lblSubtotal.setText(aMoneda(subtotal));
        lblIVA.setText(aMoneda(iva));
        lblTotal.setText(aMoneda(total));
        tblProductos.setModel(MODELO);
        
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
            java.util.logging.Logger.getLogger(carritoCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(carritoCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(carritoCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(carritoCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new carritoCompras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboProducto;
    private javax.swing.JSpinner cpnCantidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel lblIVA;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables

    private void verdatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
