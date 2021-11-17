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
	
	public void agregarPartida(JuegoDTO jurgs) {
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
