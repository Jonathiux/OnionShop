package Logic;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Producto {
    String categoria, nombre, locacion, descripcion;
    int IDProducto, cantidad;
    double precio;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIDProducto() {
        return IDProducto;
    }

    public void setIDProducto(int IDProducto) {
        this.IDProducto = IDProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String ProbarConexion(){
        String mensaje="";
        Conexion conexion = new Conexion();
            if(conexion.conectar()==null){
                mensaje="No se ha podido conectar a la BD";
            }else{
                mensaje="Conexion a la BD establecida";
            }
        
        return mensaje;
    }
    
    public Producto ConsultarPorPrecio(){

        int i=0;
        
        Conexion conexion = new Conexion();
        if (conexion.conectar()==null){
        }else{
            String consultaSQL = "Select * from productos where precio>=? and precio<=?";
            try{
                PreparedStatement ps = conexion.getConex().prepareStatement(consultaSQL);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                i++;
                }
                Producto[] pr = new Producto[i];
                
                conexion.desconectar();
            }catch(SQLException ex){
                
            }
            }
        return pr;
    }
    
    public DefaultTableModel ConsultarPorLocacion(){
        DefaultTableModel modelo = new DefaultTableModel();
        Conexion conexion = new Conexion();
        if (conexion.conectar()==null){
        }else{
            String consultaSQL = "Select * from productos where ubicacion=?";
            try{
                PreparedStatement ps = conexion.getConex().prepareStatement(consultaSQL);
                ResultSet rs = ps.executeQuery();
                String[] tituloColumna = {"Nombre", "Categoria", "Locacion", "Precio"};
                modelo.setColumnIdentifiers(tituloColumna);
                while(rs.next()){
                    Vector fila = new Vector();
                    fila.addElement(rs.getString("Nombre"));
                    fila.addElement(rs.getString("Categoria"));
                    fila.addElement(rs.getString("Ubicacion"));
                    fila.addElement(rs.getString("Precio"));
                }
                conexion.desconectar();
            }catch(SQLException ex){
                
            }
            }
        return modelo;
    }
    
    public DefaultTableModel ConsultarPorNombre(){
        DefaultTableModel modelo = new DefaultTableModel();
        Conexion conexion = new Conexion();
        if (conexion.conectar()==null){
        }else{
            String consultaSQL = "Select * from productos where nombre=?";
            try{
                PreparedStatement ps = conexion.getConex().prepareStatement(consultaSQL);
                ResultSet rs = ps.executeQuery();
                String[] tituloColumna = {"Nombre", "Categoria", "Locacion", "Precio"};
                modelo.setColumnIdentifiers(tituloColumna);
                while(rs.next()){
                    Vector fila = new Vector();
                    fila.addElement(rs.getString("Nombre"));
                    fila.addElement(rs.getString("Categoria"));
                    fila.addElement(rs.getString("Ubicacion"));
                    fila.addElement(rs.getString("Precio"));
                }
                conexion.desconectar();
            }catch(SQLException ex){
                
            }
            }
        return modelo;
    }
    
    public DefaultTableModel ConsultarTodo(){
        DefaultTableModel modelo = new DefaultTableModel();
        Conexion conexion = new Conexion();
        if (conexion.conectar()==null){
        }else{
            String consultaSQL = "Select * from productos";
            try{
                PreparedStatement ps = conexion.getConex().prepareStatement(consultaSQL);
                ResultSet rs = ps.executeQuery();
                String[] tituloColumna = {"Nombre", "Categoria", "Locacion", "Precio"};
                modelo.setColumnIdentifiers(tituloColumna);
                while(rs.next()){
                    Vector fila = new Vector();
                    fila.addElement(rs.getString("Nombre"));
                    fila.addElement(rs.getString("Categoria"));
                    fila.addElement(rs.getString("Ubicacion"));
                    fila.addElement(rs.getString("Precio"));
                }
                conexion.desconectar();
            }catch(SQLException ex){
                
            }
            }
        return modelo;
    }
}
