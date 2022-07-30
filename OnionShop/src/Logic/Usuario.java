
package Logic;

import java.sql.*;

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
                ps.setString(5, fechana);
                ps.setInt(6, telefono);
                ps.setString(7, nombUsuario);
                ps.setString(8, contraseña);
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
            String consultaSQL = "select nombreUsuario, contrasena, idusuario from usuario where nombreusuario=?";
            try{
                PreparedStatement ps = conexion.getConex().prepareStatement(consultaSQL);
                ps.setString(1, nombUsuario);
                ResultSet rs = ps.executeQuery();
                if(rs.first()){
                    contraseña2 = rs.getString("contrasena");
                }
                if(contraseña.equals(contraseña2)){
                    System.out.println("Coinciden");
                    idUsuario = rs.getInt("IDUsuario");
                }else{
                    mensaje="Usuario o contraseña Inconrrectos";
                    System.out.println(contraseña+" "+contraseña2);
                }
                /*if((nombUsuario.equals(rs.getString("nombreUsuario"))) && (contraseña.equals(rs.getString("contrasena")))){
                    
                }else{
                    mensaje="Usuario o contraseña Inconrrectos";
                }*/
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
            String consultaSQL = "select p.idproducto from producto p join vendedor_producto vp on p.idproducto=vp.idproducto where vp.idusuario<>?";
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
        return total;
        }
    
    public Producto[] datosproductos(){
        Conexion conexion = new Conexion();
        Producto productos[]= new Producto[tproductos()];
            if(conexion.conectar()==null){
                System.out.println("No se ha podido conectar");
            }else{
                String consultaSQL = "select p.* from producto p join vendedor_producto vp on p.idproducto=vp.idproducto where vp.idusuario<>?";
                try{
                PreparedStatement ps = conexion.getConex().prepareStatement(consultaSQL);
                ps.setInt(1, idUsuario);
                ResultSet rs = ps.executeQuery();
                int a=0;
                while(rs.next()){
                    int idproducto = rs.getInt("idproducto");
                    int cantidad = rs.getInt("cantidad");
                    double precio = rs.getDouble("precio");
                    String nombre = rs.getString("nombre");
                    String categoria = rs.getString("categoria");
                    String ubicacion = rs.getString("ubicacion");
                    String descripcion = rs.getString("descripcion");
                    productos[a]=new Producto();
                    productos[a].setNombre(nombre);
                    productos[a].setIDProducto(idproducto);
                    productos[a].setCategoria(categoria);
                    productos[a].setCantidad(cantidad);
                    productos[a].setPrecio(precio);
                    productos[a].setLocacion(ubicacion);
                    productos[a].setDescripcion(descripcion);
                    a++;
                }
                conexion.desconectar();
                }catch(SQLException ex){
                    
                }
            }
            
            return productos;
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
                    idsProductos[i].setCantidad(cantidad);
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
    
    public boolean eliminarProductos() {
        Producto[] p = consultarProduFinales();
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
}
