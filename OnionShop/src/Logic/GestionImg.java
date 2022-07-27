
package Logic;
import java.io.*;
public class GestionImg implements Serializable{
    private byte[] foto;

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    
    
    
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;
    
    /*Abrir Imagen*/
    public byte[] AbrirImagen(File archivo){
        byte[] bytesImg = new byte[1024*100];
        try {
            entrada = new FileInputStream(archivo);
            entrada.read(bytesImg);
        } catch (IOException ex){
            
        }
        return bytesImg;
    }
    
    /*Guardar Imagen*/
    public String guardarImagen(byte[] bytesImg,int id){
        //System.out.println("Recibiendo bytes "+bytesImg);
        String respuesta = null;
        String img = "src/Imagenes/"+id+".jpg";
        try {
            salida = new FileOutputStream(img);
            salida.write(bytesImg);
            salida.close();
            respuesta = "La imagen ha sido guardada con exito...";
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return respuesta;
    }
}
