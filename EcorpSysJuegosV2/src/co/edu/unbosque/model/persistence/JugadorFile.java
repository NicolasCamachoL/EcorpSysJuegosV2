package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.JugadorDTO;


public class JugadorFile {
	private String ruta = "\\data\\jugadores.dat";//guarda en directorio predeterminado del usuario (i.e. C:\\data\\jugadores.dat").

	private String nombreArchivoJugador="jugadores.dat";
	private File f;
			
	
	public String escribirArchivoJugador(ArrayList<JugadorDTO> rgjugador) {
		String mensaje="Archivo Generado Exitosamente!";
		f = new File(ruta);
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta));
			out.writeObject(rgjugador);
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
	
	public ArrayList<JugadorDTO> leerArchivoJugador() {
		ObjectInputStream in;
		ArrayList<JugadorDTO> rgjugador = null;
		try {
			in = new ObjectInputStream(new FileInputStream(ruta));
			rgjugador = (ArrayList<JugadorDTO>)in.readObject();
	        in.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return rgjugador;
	}

	public String getNombreArchivoJugador() {
		return nombreArchivoJugador;
	}

	public void setNombreArchivoJugador(String nombreArchivoJugador) {
		this.nombreArchivoJugador = nombreArchivoJugador;
	}

}