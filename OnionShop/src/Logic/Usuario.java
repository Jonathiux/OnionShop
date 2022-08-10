
package Logic;

import java.sql.*;
import java.util.ArrayList;

public class Usuario {
    private int idUsuario;
    long telefono;
    private String nombre, apellidos, direccion,nombUsuario,contraseña,tipo_usuario;

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
    private Date fechana;

    public Date getFechana() {
        return fechana;
    }

    public void setFechana(Date fechana) {
        this.fechana = fechana;
    }

    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
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
            String consultaSQL1 ="select IDusuario from usuario";
            String consultaSQL ="insert into usuario values(?,?,?,?,?,?,?,?)";
            try{
                PreparedStatement ps2 = conexion.getConex().prepareStatement(consultaSQL1);
                ResultSet rs = ps2.executeQuery();
                if(rs.last()){
                idUsuario = rs.getRow();
                idUsuario = idUsuario+1;
                PreparedStatement ps = conexion.getConex().prepareStatement(consultaSQL);
                ps.setInt(1, idUsuario);
                ps.setString(2, nombre);
                ps.setString(3, apellidos);
                ps.setString(4, direccion);
                ps.setDate(5, fechana);
                ps.setLong(6, telefono);
                ps.setString(7, nombUsuario);
                ps.setString(8, contraseña);
                ps.setString(9, "Usuario");
                ps.executeUpdate();
                mensaje="Usuario registrado";
                System.out.println(nombre + apellidos + direccion + fechana + telefono + nombUsuario + contraseña);
                conexion.desconectar();
                }else{
                }
            }catch(SQLException ex){
                mensaje="Error al registrar" +ex.getMessage();
                System.out.println(mensaje);
                System.out.println(nombre + apellidos + direccion + fechana + telefono + nombUsuario + contraseña);
            }
            
        }
        return mensaje;
    }
    
    public String Login(){
        String mensaje="";
        String contraseña2 = "";
        Conexion conexion = new Conexion();
        if(conexion.conectar()==null){
            mensaje="No se ha podido conectar";
        }else{
            String consultaSQL = "select * from usuario where nombreusuario=?";
            try{
                PreparedStatement ps = conexion.getConex().prepareStatement(consultaSQL);
                ps.setString(1, nombUsuario);
                ResultSet rs = ps.executeQuery();
                if(rs.first()){
                    contraseña2 = rs.getString("contrasena");
                }
                if(contraseña.equals(contraseña2)){
                    //System.out.println("Coinciden");
                    idUsuario = rs.getInt("IDUsuario");
                    telefono = rs.getLong("telefono");
                    nombre = rs.getString("nombre");
                    apellidos = rs.getString("Apellidos");
                    direccion = rs.getString("direccion");
                    nombUsuario= rs.getString("nombreusuario");
                    contraseña = rs.getString("contrasena");
                    fechana = rs.getDate("fechanac");
                    tipo_usuario = rs.getString("tipoUsuario");
                }else{
                    mensaje="Usuario o contraseña Inconrrectos";
                    //System.out.println(contraseña+" "+contraseña2); 
                }
                conexion.desconectar();
            }catch(SQLException ex){
                mensaje="Usuario no encontrado, registrese";
                System.out.println(ex);
            }
        }
        return mensaje;
    }
    
    private int tproductos (){
        int total=0;    
        Conexion conexion = new Conexion();
        if(conexion.conectar()==null){
            System.out.println("No se ha podido conectar");
        }else{
            String consultaSQL = "select p.idproducto from producto as p inner join vendedor_producto as v_p on p.idproducto=v_p.idproducto where v_p.idusuario<>?";
            try{
               PreparedStatement ps = conexion.getConex().prepareStatement(consultaSQL);
               ps.setInt(1, idUsuario);
               ResultSet rs = ps.executeQuery();
               while(rs.next()){
                   total++;
               }
               conexion.desconectar();
            }catch(SQLException ex){
            }
        }
        //System.out.println(total);
        return total;
    }
    
    public ArrayList<Producto> datosproductos(){
        Conexion conexion = new Conexion();
        ArrayList<Producto> productos = new ArrayList();
        Producto producto;
            if(conexion.conectar()==null){
                System.out.println("No se ha podido conectar");
            }else{
                String consultaSQL = "select p.* from producto as p inner join vendedor_producto as v_p on p.idproducto=v_p.idproducto where v_p.idusuario<>?";

                try{
                PreparedStatement ps = conexion.getConex().prepareStatement(consultaSQL);
                ps.setInt(1, idUsuario);
                ResultSet rs = ps.executeQuery();
                int a=0;
                while(rs.next()){
                    producto = new Producto();
                    int idproducto = rs.getInt("idproducto");
                    int cantidad = rs.getInt("cantidad");
                    double precio = rs.getDouble("precio");
                    String nombre = rs.getString("nombre");
                    String categoria = rs.getString("categoria");
                    String ubicacion = rs.getString("ubicacion");
                    String descripcion = rs.getString("descripcion");
                    byte[] imagen = rs.getBytes("img");
                    
                    producto.setNombre(nombre);
                    producto.setIDProducto(idproducto);
                    producto.setCategoria(categoria);
                    producto.setCantidad(cantidad);
                    producto.setPrecio(precio);
                    producto.setLocacion(ubicacion);
                    producto.setDescripcion(descripcion);
                    producto.setImagen(imagen);
                    productos.add(producto);
                }
                conexion.desconectar();
                }catch(SQLException ex){
                    System.out.println("error "+ex);
                }
            }
            return productos;
    }
    
    public ArrayList<Producto> productos(){
        ArrayList<Producto> productos = new ArrayList();
        Producto producto;
        Conexion conex = new Conexion();
        if(conex.conectar()!=null){
            String consultaSQL = "";
            consultaSQL = "select * from producto as p inner join vendedor_producto as v_p on p.idproducto = v_p.idproducto where idusuario=?";
            
            try{
               PreparedStatement ps = conex.getConex().prepareStatement(consultaSQL);
                ps.setInt(1, idUsuario);
                
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    producto = new Producto();
                    producto.setIDProducto(rs.getInt("idproducto"));
                    producto.setCantidad(rs.getInt("cantidad"));
                    producto.setNombre(rs.getString("nombre"));
                    producto.setCategoria(rs.getString("categoria"));
                    producto.setDescripcion(rs.getString("descripcion"));
                    producto.setLocacion(rs.getString("ubicacion"));
                    producto.setPrecio(rs.getDouble("precio"));
                    producto.setImagen(rs.getBytes("img"));
                    
                    productos.add(producto);
                }
                conex.desconectar(); 
            } catch(SQLException ex){
                
            }
        }
        return productos;
    }
    
    public boolean eliminarProductos() {
        ArrayList<Producto> p = productos();
        Conexion conex = new Conexion();
        conex.conectar();
        try{
            String consultaSQL1 = "delete from vendedor_producto where idusuario=?";
            PreparedStatement ps1 = conex.getConex().prepareStatement(consultaSQL1);
            ps1.setInt(1, idUsuario);
            int fila1 = ps1.executeUpdate();
            int filas = 0;
            for (Producto p1 : p) {

                    String consultaSQL = "delete from producto where idproducto=?";
                    PreparedStatement ps = conex.getConex().prepareStatement(consultaSQL);
                    ps.setInt(1, p1.getIDProducto());
                    ps.executeUpdate();
                    filas += ps.executeUpdate();
            }
            if(fila1>0){
                System.out.println(fila1+" fila(s) afectadas");
                if(filas>0){
                    System.out.println(filas+" fila(s) afectadas");
                    return true;
                }
                System.out.println("Solo una tabla fue afectada");
                return false;
            }else{
                return false;
            }
        }catch(SQLException ex){
            System.out.println("Error "+ex);
            return false;
        }finally{
            conex.desconectar();
        }
    }
    public boolean comprobarVendedor(){
        Conexion conex = new Conexion();
        conex.conectar();
        try {
            String ConsultaSQL = "select * from vendedor where idusuario=?";
            PreparedStatement ps = conex.getConex().prepareStatement(ConsultaSQL);
            ps.setInt(1, idUsuario);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }finally{
            conex.desconectar();
        }
    }
    
    public boolean convertirVendedor(){
        Conexion conex = new Conexion();
        conex.conectar();
        try{
            String ConsultaSQL = "insert into vendedor values(?)";
            PreparedStatement ps = conex.getConex().prepareStatement(ConsultaSQL);
            ps.setInt(1, idUsuario);
            int fila = ps.executeUpdate();
            if(fila>0){
                return true;
            }else{
                return false;
            }
        }catch(SQLException ex){
            System.out.println("Error "+ ex);
            return false;
        }finally{
            conex.desconectar();
        }
    }
}
