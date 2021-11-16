package co.edu.unbosque.model.persistence;

import java.io.Serializable;

public class RegPartidas implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String tipoPartida;
	private String jugador1;
	private String jugador2;
	private String juego;
	private double puntaje1;
	private double puntaje2;
	
	public RegPartidas(){
		tipoPartida = "";
		juego = "";
		jugador1 = "";
		jugador2 = "";
		puntaje1 = 0;
		puntaje2 = 0;
	}

	public String getTipoPartida() {
		return tipoPartida;
	}

	public void setTipoPartida(String tipoPartida) {
		this.tipoPartida = tipoPartida;
	}

	public String getJugador1() {
		return jugador1;
	}

	public void setJugador1(String jugador1) {
		this.jugador1 = jugador1;
	}

	public String getJugador2() {
		return jugador2;
	}

	public void setJugador2(String jugador2) {
		this.jugador2 = jugador2;
	}

	public double getPuntaje1() {
		return puntaje1;
	}

	public void setPuntaje1(double puntaje1) {
		this.puntaje1 = puntaje1;
	}

	public double getPuntaje2() {
		return puntaje2;
	}

	public void setPuntaje2(double puntaje2) {
		this.puntaje2 = puntaje2;
	}

	public String getJuego() {
		return juego;
	}

	public void setJuego(String juego) {
		this.juego = juego;
	}

	@Override
	public String toString() {
		return "tipoPartida=" + this.tipoPartida + "\njugador1=" + this.jugador1 +
				"\npuntaje1=" + this.puntaje1 +"\njugador2=" + this.jugador2+ 
				"\npuntaje2=" + this.puntaje2 + "\njuego=" + this.juego ;
	}
	
}
