package Logic;

import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GestionImg {

    private String ruta;
    private File archivo;
    private byte[] imagen;

    public byte[] getImagen() {
        return convertirbinario();
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getRuta() {
        return ruta;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    private byte[] convertirbinario(){
        FileInputStream entrada;
        byte[] img = new byte[(int) archivo.length()];
        try{
            entrada = new FileInputStream(archivo);
            entrada.read(img);
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
        return img;
    }

    public boolean abrirImagen() {

        JFileChooser escoger = new JFileChooser();
        escoger.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("+.png", "png");
        FileNameExtensionFilter filtro2 = new FileNameExtensionFilter("+.jpg", "jpg");

        escoger.setFileFilter(filtro);
        escoger.setFileFilter(filtro2);

        int seleccion = escoger.showOpenDialog(escoger);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            archivo = escoger.getSelectedFile();
            this.ruta = archivo.getAbsolutePath();
            return true;
        } else{
            return false;
        }
        
    }
}
