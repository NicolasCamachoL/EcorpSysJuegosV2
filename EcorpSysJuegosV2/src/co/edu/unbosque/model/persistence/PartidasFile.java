package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.PartidaDTO;

public class PartidasFile {
	private String ruta = "\\data\\partidas.dat";//guarda en directorio predeterminado del usuario (i.e. C:\\data\\partidas.dat).

	private String nombreArchivoPartida="partidas.dat";
	private File f;
			
	
	public String escribirArchivoPartida(ArrayList<PartidaDTO> rgpartida) {
		String mensaje="Archivo Generado Exitosamente!";
		f = new File(ruta);
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta));
			out.writeObject(rgpartida);
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
	
	public ArrayList<PartidaDTO> leerArchivoPartida() {
		ObjectInputStream in;
		ArrayList<PartidaDTO> rgpartida = null;
		try {
			in = new ObjectInputStream(new FileInputStream(ruta));
	        rgpartida = (ArrayList<PartidaDTO>)in.readObject();
	        in.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return rgpartida;
	}


	public String getNombreArchivoPartida() {
		return nombreArchivoPartida;
	}


	public void setNombreArchivoPartida(String nombreArchivoPartida) {
		this.nombreArchivoPartida = nombreArchivoPartida;
	}
	
}