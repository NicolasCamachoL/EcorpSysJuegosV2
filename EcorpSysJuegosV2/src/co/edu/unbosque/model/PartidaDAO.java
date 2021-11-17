package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.PartidasFile;

public class PartidaDAO {
	
	private ArrayList<PartidaDTO> prtds;
	private PartidasFile archivoPartida;
	
	public PartidaDAO() {
		prtds = new ArrayList<PartidaDTO>();
		archivoPartida = new PartidasFile();
	}
	
	public void agregarPartida(PartidaDTO parts) {
		prtds = archivoPartida.leerArchivoPartida();
		prtds.add(parts);
		archivoPartida.escribirArchivoPartida(prtds);
	}

	public ArrayList<PartidaDTO> getPrtds() {
		return prtds;
	}

	public void setPrtds(ArrayList<PartidaDTO> prtds) {
		this.prtds = prtds;
	}
}
