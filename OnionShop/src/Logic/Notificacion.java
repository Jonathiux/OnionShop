
package Logic;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Notificacion {
    private String objeto,descripcion;
    private int Idusuario, visto;

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getVisto() {
        return visto;
    }

    public void setVisto(int visto) {
        this.visto = visto;
    }

    public int getIdusuario() {
        return Idusuario;
    }

    public void setIdusuario(int Idusuario) {
        this.Idusuario = Idusuario;
    }
    
    public ArrayList<Notificacion> consltarPorId(){
        ArrayList<Notificacion> notificaciones = new ArrayList();
        Notificacion notificacion;
        Conexion conex = new Conexion();
        conex.conectar();
        try {
            String consultaSQL = "select * from notificaciones where idusuario = ?";
            PreparedStatement ps = conex.getConex().prepareStatement(consultaSQL);
            ps.setInt(1, Idusuario);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                notificacion = new Notificacion();
                notificacion.objeto = rs.getString("objeto");
                notificacion.descripcion = rs.getString("descripcion");
                notificacion.visto = rs.getInt("visto");
                
                notificaciones.add(notificacion);
            }
        } catch (Exception e) {
            System.out.println("Error "+e);
        }finally{
            conex.desconectar();
        }
        return notificaciones;
    }
}
