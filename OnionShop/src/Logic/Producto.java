package Logic;

import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Producto {

    private String categoria, nombre, locacion, descripcion;
    private int IDProducto, cantidad, idUsuarioPert;

    public int getIdUsuarioPert() {
        return idUsuarioPert;
    }

    public void setIdUsuarioPert(int idUsuarioPert) {
        this.idUsuarioPert = idUsuarioPert;
    }
    private double precio;
    private byte[] Imagen;

    public byte[] getImagen() {
        return Imagen;
    }

    public void setImagen(byte[] Imagen) {
        this.Imagen = Imagen;
    }

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

    public String ProbarConexion() {
        String mensaje = "";
        Conexion conexion = new Conexion();
        if (conexion.conectar() == null) {
            mensaje = "No se ha podido conectar a la BD";
        } else {
            mensaje = "Conexion a la BD establecida";
        }

        return mensaje;
    }

    public DefaultTableModel ConsultarPorLocacion() {
        DefaultTableModel modelo = new DefaultTableModel();
        Conexion conexion = new Conexion();
        if (conexion.conectar() == null) {
        } else {
            String consultaSQL = "Select * from productos where ubicacion=?";
            try {
                PreparedStatement ps = conexion.getConex().prepareStatement(consultaSQL);
                ResultSet rs = ps.executeQuery();
                String[] tituloColumna = {"Nombre", "Categoria", "Locacion", "Precio"};
                modelo.setColumnIdentifiers(tituloColumna);
                while (rs.next()) {
                    Vector fila = new Vector();
                    fila.addElement(rs.getString("Nombre"));
                    fila.addElement(rs.getString("Categoria"));
                    fila.addElement(rs.getString("Ubicacion"));
                    fila.addElement(rs.getString("Precio"));
                }
                conexion.desconectar();
            } catch (SQLException ex) {

            }
        }
        return modelo;
    }

    public DefaultTableModel ConsultarPorNombre() {
        DefaultTableModel modelo = new DefaultTableModel();
        Conexion conexion = new Conexion();
        if (conexion.conectar() == null) {
        } else {
            String consultaSQL = "Select * from productos where nombre=?";
            try {
                PreparedStatement ps = conexion.getConex().prepareStatement(consultaSQL);
                ResultSet rs = ps.executeQuery();
                String[] tituloColumna = {"Nombre", "Categoria", "Locacion", "Precio"};
                modelo.setColumnIdentifiers(tituloColumna);
                while (rs.next()) {
                    Vector fila = new Vector();
                    fila.addElement(rs.getString("Nombre"));
                    fila.addElement(rs.getString("Categoria"));
                    fila.addElement(rs.getString("Ubicacion"));
                    fila.addElement(rs.getString("Precio"));
                }
                conexion.desconectar();
            } catch (SQLException ex) {

            }
        }
        return modelo;
    }

    public DefaultTableModel ConsultarTodo() {
        DefaultTableModel modelo = new DefaultTableModel();
        Conexion conexion = new Conexion();
        if (conexion.conectar() == null) {
        } else {
            String consultaSQL = "Select * from productos";
            try {
                PreparedStatement ps = conexion.getConex().prepareStatement(consultaSQL);
                ResultSet rs = ps.executeQuery();
                String[] tituloColumna = {"Nombre", "Categoria", "Locacion", "Precio"};
                modelo.setColumnIdentifiers(tituloColumna);
                while (rs.next()) {
                    Vector fila = new Vector();
                    fila.addElement(rs.getString("Nombre"));
                    fila.addElement(rs.getString("Categoria"));
                    fila.addElement(rs.getString("Ubicacion"));
                    fila.addElement(rs.getString("Precio"));
                }
                conexion.desconectar();
            } catch (SQLException ex) {

            }
        }
        return modelo;
    }

    private int idProducto() {
        Producto[] p = new Usuario().datosproductos();
        boolean band = false;
        int idProd;
        do {
            idProd = (int) Math.round(Math.random() * 1000);
            for (Producto p1 : p) {
                if (p1.getIDProducto() == idProd) {
                    band = true;
                }
            }
        } while (band);
        return idProd;
    }

    public boolean agregarProducto(Usuario v) {

        Conexion conex = new Conexion();
        conex.conectar();
        String consultaSQL = "Insert into producto values(?,?,?,?,?,?,?,?)";
        String consulta2 = "insert into vendedor_producto values(?,?)";
        try {
            int id = idProducto();

            PreparedStatement ps = conex.getConex().prepareStatement(consultaSQL);
            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setString(3, categoria);
            ps.setString(4, descripcion);
            ps.setString(5, locacion);
            ps.setInt(6, cantidad);
            ps.setDouble(7, precio);
            ps.setBytes(8, Imagen);
            int fila = ps.executeUpdate();

            PreparedStatement ps1 = conex.getConex().prepareStatement(consulta2);
            ps1.setInt(1, v.getIdUsuario());
            ps1.setInt(2, id);
            int filas2 = ps1.executeUpdate();

            if (fila > 0) {
                //System.out.println(fila + " fila(s) afectada(s)");
                if (filas2 > 0) {
                    //System.out.println(fila + " fila(s) afectada(s)");
                    return true;
                }
                System.out.println("Solo se guarda la primera tabla");
                return false;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("Error al intentar insertar " + ex.getMessage());
            return false;
        } finally {
            conex.desconectar();
        }
    }

    public boolean actualizarProducto() {

        Conexion conex = new Conexion();
        conex.conectar();
        String consultaSQL = "update producto set nombre=?,categoria=?,Descripcion=?,ubicacion=?,Cantidad=?,Precio=?,img=? where idproducto=?";
        try {
            PreparedStatement ps = conex.getConex().prepareStatement(consultaSQL);
            ps.setString(1, nombre);
            ps.setString(2, categoria);
            ps.setString(3, descripcion);
            ps.setString(4, locacion);
            ps.setInt(5, cantidad);
            ps.setDouble(6, precio);
            ps.setBytes(7, Imagen);
            ps.setInt(8, IDProducto);
            int fila = ps.executeUpdate();

            if (fila > 0) {
                System.out.println(fila + " fila(s) afectada(s)");
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("Error al intentar actualizar " + ex.getMessage());
            return false;
        } finally {
            conex.desconectar();
        }
    }

    public boolean consultarPorId() {

        Conexion conexion = new Conexion();
        conexion.conectar();
        String consultaSQL = "Select * from producto where idProducto=?";
        try {
            PreparedStatement ps = conexion.getConex().prepareStatement(consultaSQL);
            ps.setInt(1, IDProducto);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nombre = rs.getString("nombre");
                categoria = rs.getString("Categoria");
                descripcion = rs.getString("descripcion");
                locacion = rs.getString("ubicacion");
                cantidad = rs.getInt("cantidad");
                precio = rs.getInt("Precio");
                Imagen = rs.getBytes("img");

            }
            return true;
        } catch (SQLException ex) {
            System.out.println("Error al consultar" + ex);
            return false;
        } finally {
            conexion.desconectar();
        }

    }

    public boolean eliminarProducto() {
        Conexion conex = new Conexion();
        conex.conectar();

        try {
            String consultaSQL1 = "delete from vendedor_producto where idproducto=?";
            String consultaSQL = "Delete from producto where idproducto = ?";
            PreparedStatement ps1 = conex.getConex().prepareStatement(consultaSQL1);
            ps1.setInt(1, IDProducto);
            int fila1 = ps1.executeUpdate();
            PreparedStatement ps = conex.getConex().prepareStatement(consultaSQL);
            ps.setInt(1, IDProducto);
            int fila = ps.executeUpdate();
            if (fila1 > 0 & fila > 0) {
                System.out.println(fila1 + " fila(s) afectadas");
                System.out.println(fila + " fila(s) afectadas");
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            System.out.println("Error al intentar eliminar" + ex.getMessage());
            return false;
        } finally {
            conex.desconectar();
        }
    }

    public ArrayList<Producto> productos() {
        ArrayList<Producto> productos = new ArrayList();
        Producto producto;
        Conexion conex = new Conexion();
        if (conex.conectar() != null) {
            String consultaSQL = "";
            consultaSQL = "select * from producto as p inner join vendedor_producto as v_p on p.idproducto = v_p.idproducto";

            try {
                PreparedStatement ps = conex.getConex().prepareStatement(consultaSQL);

                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    producto = new Producto();
                    producto.setIDProducto(rs.getInt("idproducto"));
                    producto.setCantidad(rs.getInt("cantidad"));
                    producto.setNombre(rs.getString("nombre"));
                    producto.setCategoria(rs.getString("categoria"));
                    producto.setDescripcion(rs.getString("descripcion"));
                    producto.setLocacion(rs.getString("ubicacion"));
                    producto.setPrecio(rs.getDouble("precio"));
                    producto.setImagen(rs.getBytes("img"));
                    producto.setIdUsuarioPert(rs.getInt("idUsuario"));

                    productos.add(producto);
                }
                conex.desconectar();
            } catch (SQLException ex) {

            }
        }
        return productos;
    }
}
