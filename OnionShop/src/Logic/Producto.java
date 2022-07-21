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
    
    /*public Producto ConsultarPorPrecio(){

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
    }*/
    
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
    
    private int idProducto(){
        Producto[] p = new Usuario().consultarProduFinales();
        boolean band = false;
        int idProd;
        do{
            idProd = (int) Math.round(Math.random()*1000);
            for (Producto p1 : p) {
                if (p1.getIDProducto()== idProd) {
                    band = true;
                }
            }
        } while(band);
        //JOptionPane.showMessageDialog(null, idProd);
        return idProd;   
    }
    
    public String agregarProducto(Usuario v){
        String mensaje="";
        Conexion conex = new Conexion();
        if(conex.conectar() == null){
            mensaje = "Mensaje no se pudo conectar a la Base de datos";
        }else{
            String consultaSQL = "Insert into producto values(?,?,?,?,?,?,?)";
            String consulta2 = "insert into vendedor_producto values(?,?)";
            try{
                int id = idProducto();
                PreparedStatement ps = conex.getConex().prepareStatement(consultaSQL);
                ps.setInt(1, id);
                ps.setString(2,nombre);
                ps.setString(3,categoria);
                ps.setString(4,descripcion);
                ps.setString(5,locacion);
                ps.setInt(6,cantidad);
                ps.setDouble(7,precio);
                int fila = ps.executeUpdate();
                mensaje = fila + " fila(s) afectada(s)"; 
                
                PreparedStatement ps2 = conex.getConex().prepareStatement(consulta2);
                ps2.setInt(1, v.getIdUsuario());
                ps2.setInt(2, id);
                int filas2 = ps2.executeUpdate();
                //JOptionPane.showMessageDialog(null, filas2 + "fila(s) afectada(s)"); 
            }catch(SQLException ex){
                mensaje = "Error al intentar insertar " + ex.getMessage(); 
            }
        }
        return mensaje;
    }
}
