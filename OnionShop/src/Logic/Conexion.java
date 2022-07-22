package Logic;

import java.sql.*;

public class Conexion {
private String ip="localhost:3306";
    private String db="onionTech";
    private String usuario="root";
    private String password="";
    private String url="jdbc:mysql://"+ip+"/"+db;
    private Connection conex;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Connection getConex() {
        return conex;
    }

    public void setConex(Connection conex) {
        this.conex = conex;
    }
    
    public Connection conectar(){
        try{
         Class.forName("com.mysql.jdbc.Driver");   
         conex=DriverManager.getConnection(url, usuario, password);
        }catch(ClassNotFoundException ex){
            System.out.println("Error no se encontro la clase");
        }catch(SQLException ex){
            System.out.println("Error al Conectar "+ex.getMessage());
        }
        return conex;
    }
    
    public void desconectar(){
        try{
            conex.close();
        }catch(SQLException ex){
            System.out.println("Error al desconectar");
        }
        
    }
}
