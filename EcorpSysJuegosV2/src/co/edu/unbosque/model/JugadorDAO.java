package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.JugadorFile;

public class JugadorDAO {
	
	private ArrayList<JugadorDTO> jrtds;
	private JugadorFile archivoJuego;
	
	public JugadorDAO() {
		jrtds = new ArrayList<JugadorDTO>();
		archivoJuego = new JugadorFile();
	}
	
	public JugadorDTO buscarPartida(String nombre) {
		jrtds = archivoJuego.leerArchivoJugador();
		for(JugadorDTO jrts : jrtds) {
			if(jrts.getNombre().equals(nombre)) {
				return jrts;
			}
		}
		return null;
	}
	
	public void agregarPartida(JugadorDTO jrts) {
		jrtds = archivoJuego.leerArchivoJugador();
		jrtds.add(jrts);
		archivoJuego.escribirArchivoJugador(jrtds);
	}

	public ArrayList<JugadorDTO> getJrtds() {
		return jrtds;
	}

	public void setJrtds(ArrayList<JugadorDTO> jrtds) {
		this.jrtds = jrtds;
	}

	
}
