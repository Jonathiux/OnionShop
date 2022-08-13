/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.sql.*;
import java.time.LocalDate;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author cris
 */

public class Carrito {    
    String MetodoDeEnvio;
    int IdCarrito;
    int IdUsuario;
    int Idproducto;
    int Cantidad;
    public int getIdproducto() {
        return Idproducto;
    }

    public void setIdproducto(int Idproducto) {
        this.Idproducto = Idproducto;
    }
    

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }
    
    
    public String getMetodoDeEnvio() {
        return MetodoDeEnvio;
    }

    public void setMetodoDeEnvio(String MetodoDeEnvio) {
        this.MetodoDeEnvio = MetodoDeEnvio;
    }

    public int getIdCarrito() {
        return IdCarrito;
    }

    public void setIdCarrito(int IdCarrito) {
        this.IdCarrito = IdCarrito;
    }

    
    
    public void AgregarCarrito(){
        LocalDate  hoy = LocalDate.now();
        String fecha = Integer.toString(hoy.getYear())+"-"+Integer.toString(hoy.getMonthValue())+"-"+Integer.toString(hoy.getDayOfMonth());
        System.out.println(fecha);
        Conexion con=new Conexion();
        con.conectar();
        if(con.conectar()==null){
        System.out.println("no conecto");
         }else{
            // System.out.println("conecto");      
            String SQL = "insert into comprardor values (?)";
            String consultaSQL="insert into agregar_carrito values(?,?,?,?)";
            String consultaSQL1="insert into carrito values (?,?,?,?)";
            try{
                PreparedStatement ps2=con.getConex().prepareStatement(SQL);
                ps2.setInt(1, IdUsuario);
                PreparedStatement ps1=con.getConex().prepareStatement(consultaSQL1);
                ps1.setInt(1, IdCarrito);
                ps1.setInt(2, IdUsuario);
                ps1.setString(3, "null");
                ps1.setString(4, fecha);
                ps1.executeUpdate();
                PreparedStatement ps =con.getConex().prepareStatement(consultaSQL);   
                ps.setInt(1,IdCarrito);
                ps.setInt(3,IdUsuario);
                ps.setInt(2,Idproducto);
                ps.setInt(4,Cantidad);
                int filas = ps.executeUpdate();
                System.out.println(filas+" fila(s) modificadas");
            }catch(SQLException ex){
                System.out.println("error " + ex);
            }finally{
                con.desconectar();
            }
        
    }
    
}
    public DefaultTableModel consultarcarrito(){
        Conexion conexion = new Conexion();
        DefaultTableModel modelo = new DefaultTableModel();
        if(conexion.conectar()==null){
            System.out.println("No conecto");
        }else{
            String consultaSQL="select * from carrito where IdUsuario=?";
            try{
                PreparedStatement ps = conexion.getConex().prepareStatement(consultaSQL);
                ps.setInt(1, IdUsuario);
                System.out.println(IdUsuario);
                ResultSet rs= ps.executeQuery();
                String [] tituloColumna={"Nombre", "Cantidad", "Precio"};
                modelo.setColumnIdentifiers(tituloColumna);
                while(rs.next()){
                Vector fila = new Vector();
                fila.addElement(rs.getString("Nombre"));
                fila.addElement(rs.getInt("Cantidad"));
                fila.addElement(rs.getDouble("Precio"));
                modelo.addRow(fila);
                }
                conexion.desconectar();
            }catch(SQLException ex){
                
            }
        }
        return modelo;
    }
}