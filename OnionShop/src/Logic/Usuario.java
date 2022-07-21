
package Logic;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class Usuario {
    private int idUsuario, telefono;
    private String nombre, apellidos, direccion,nombUsuario,contraseña,fechana;

    public String getFechana() {
        return fechana;
    }

    public void setFechana(String fechana) {
        this.fechana = fechana;
    }

    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombUsuario() {
        return nombUsuario;
    }

    public void setNombUsuario(String nombUsuario) {
        this.nombUsuario = nombUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public String RegistrarUsuario(){
        String mensaje ="";
        Conexion conexion = new Conexion();
        if(conexion.conectar()==null){
            mensaje="No se ha podido conectar";
        }else{
            String consultaSQL ="insert into usuario (?,?,?,?,?,?)";
            try{
                PreparedStatement ps = conexion.getConex().prepareStatement(consultaSQL);
                ps.setString(1, nombre);
                ps.setString(2, apellidos);
                ps.setString(3, direccion);
                ps.setInt(4, telefono);
                ps.setString(5, nombUsuario);
                ps.setString(6, contraseña);
                ps.executeUpdate();
                mensaje="Usuario registrado";
                conexion.desconectar();
            }catch(SQLException ex){
                mensaje="Error al registrar" +ex.getMessage();
            }
        }
        return mensaje;
    }
    
    public String Login(){
        String mensaje="";
        Conexion conexion = new Conexion();
        if(conexion.conectar()==null){
            mensaje="No se ha podido conectar";
        }else{
            String consultaSQL = "select nombUsuario, contraseña, nombre from usuario where usuario=?";
            try{
                PreparedStatement ps = conexion.getConex().prepareStatement(consultaSQL);
                ResultSet rs = ps.executeQuery();
                ps.setString(1, nombUsuario);
                if((nombUsuario.equals(rs.getString("nombUsuario"))) && (contraseña.equals(rs.getString("contraseña")))){
                    
                }else{
                    mensaje="Usuario o contraseña Inconrrectos";
                }
                conexion.desconectar();
            }catch(SQLException ex){
                mensaje="Usuario no encontrado, registrese";
            }
        }
        return mensaje;
    }
    
    private int totalProductos(){
        int totalProducts=0;
        Conexion conex = new Conexion();
        if(conex.conectar()!=null){
            String consultaSQL = "select idproducto from vendedor_producto where idusuario=?";
            try{
               PreparedStatement ps = conex.getConex().prepareStatement(consultaSQL);
                ps.setInt(1, idUsuario);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    totalProducts++;
                }
                conex.desconectar(); 
            } catch(SQLException ex){
            
            }
        }
        return totalProducts;
    }
    
    public Producto[] consultarProduFinales(){
        Conexion conex = new Conexion();
        Producto idsProductos[] = new Producto[totalProductos()];
        if(conex.conectar()==null){
        } else{
            String consultaSQL = "select * from vendedor_producto as v_p inner join producto as p on v_p.idProducto = p.idproducto where v_p.idusuario=?";
            try{
                PreparedStatement ps = conex.getConex().prepareStatement(consultaSQL);
                ps.setInt(1, idUsuario);
                ResultSet rs = ps.executeQuery();
                int i =0;
                while(rs.next()){
                    int idproducto = (rs.getInt("idproducto"));
                    int cantidad = (rs.getInt("cantidad"));
                    String nombre = (rs.getString("nombre"));
                    String categoria = (rs.getString("categoria"));
                    String descripcion = (rs.getString("descripcion"));
                    String ubicacion = (rs.getString("ubicacion"));
                    double precio = (rs.getDouble("precio"));
                    idsProductos[i] = new Producto();
                    idsProductos[i].setIDProducto(cantidad);
                    idsProductos[i].setNombre(nombre);
                    idsProductos[i].setCategoria(categoria);
                    idsProductos[i].setDescripcion(descripcion);
                    idsProductos[i].setLocacion(ubicacion);
                    idsProductos[i].setPrecio(precio);
                    idsProductos[i].setIDProducto(idproducto);
                    i++;
                }
                conex.desconectar();
            } catch(SQLException ex) {
                System.out.println("Error al intentar consultar " + ex.getMessage()); 
            }
        }
        return idsProductos;
    }
}
