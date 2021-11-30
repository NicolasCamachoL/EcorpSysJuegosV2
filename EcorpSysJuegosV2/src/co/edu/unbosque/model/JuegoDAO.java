package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.JuegosFile;

public class JuegoDAO {
	
	private ArrayList<JuegoDTO> jgdto;
	private JuegosFile archivoJuego;
	
	public JuegoDAO() {
		jgdto = new ArrayList<JuegoDTO>();
		archivoJuego = new JuegosFile();
	}

	public JuegoDTO buscarJuego(String nombre) {
		jgdto = archivoJuego.leerArchivoJuego();
		for(JuegoDTO jgts : jgdto) {
			if(jgts.getNombre().equals(nombre)) {
				return jgts;
			}
		}
		return null;
	}
	
	
	

	public void agregarJuego(JuegoDTO jurgs) {
		jgdto = archivoJuego.leerArchivoJuego();
		jgdto.add(jurgs);
		
		archivoJuego.escribirArchivoJuego(jgdto);
	}
	


	
	public JuegosFile getArchivoJuego() {
		return archivoJuego;
	}

	public void setArchivoJuego(JuegosFile archivoJuego) {
		this.archivoJuego = archivoJuego;
	}
	
}
