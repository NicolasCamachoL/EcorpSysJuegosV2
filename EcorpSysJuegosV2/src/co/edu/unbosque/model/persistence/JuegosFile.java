package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.JuegoDTO;


public class JuegosFile {
	
	private String ruta = "\\data\\juegos.dat";//guarda en directorio predeterminado del usuario (i.e. C:\\data\\juegos.dat).

	private String nombreArchivoJuego="juegos.dat";
	private File f;
			
	
	public String escribirArchivoJuego(ArrayList<JuegoDTO> rgjuego) {
		String mensaje="Archivo Generado Exitosamente!";
		f = new File(ruta);
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta));
			out.writeObject(rgjuego);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			mensaje = "Archivo no encontrado";
		} catch (IOException e) {
			e.printStackTrace();
			mensaje = "Error de IO";
		}
		return mensaje;
	}
	
	public ArrayList<JuegoDTO> leerArchivoJuego() {
		f.getAbsoluteFile();
		ObjectInputStream in;
		ArrayList<JuegoDTO> rgjuego = null;
		try {
			in = new ObjectInputStream(new FileInputStream(ruta));
			rgjuego = (ArrayList<JuegoDTO>)in.readObject();
	        in.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return rgjuego;
	}

	public String getNombreArchivoJuego() {
		return nombreArchivoJuego;
	}

	public void setNombreArchivoJuego(String nombreArchivoJuego) {
		this.nombreArchivoJuego = nombreArchivoJuego;
	}

}