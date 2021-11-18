package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import co.edu.unbosque.model.*;
import co.edu.unbosque.model.persistence.*;
import co.edu.unbosque.view.View;
import java.util.Objects;
import java.io.File;


public class Controller implements ActionListener{

	
	
	private static JuegoDAO jdao;

	
	private View gui;
	private Mundo md;
	private ArrayList<PartidaDTO> rgspartida;
	private ArrayList<JugadorDTO> rgsjugador;
	private ArrayList<JuegoDTO> rgsjuego;
	private PartidaDAO rpdao;
	private PartidaDTO rgpartida;
	private JugadorDTO rgjugador;
	private JuegoDTO rgjuego;

	public Controller() {
		md = new Mundo();
		rpdao = new PartidaDAO();
		rgspartida = new ArrayList<PartidaDTO>();
		rgsjugador = new ArrayList<JugadorDTO>();
		rgsjuego = new ArrayList<JuegoDTO>();
		rgpartida = new PartidaDTO(null, null, null, null, 0, 0);
		rgjugador = new JugadorDTO(null, 0, null, 0);
		rgjuego = new JuegoDTO(null, null);
		gui = new View(this);
		gui.setVisible(true);

		
	}

	public void actionPerformed(ActionEvent evento) {
		String aux = "";
		String aux2 = "";
		String aux3 = "";
		String aux4 = "";
		double aux7 = 0.0;
		double aux8 = 0.0;
		int aux9;
	
//		///////////////PANEL 1//////////////////////////////////////////////////////
		
		if(evento.getActionCommand().equals(gui.getP4().JUGADORES)) {
			gui.getP1().setVisible(true);
			gui.getPr1().setVisible(true);
		}
		
		if(evento.getActionCommand().equals(gui.getP1().VOLVER1)){
			gui.getP1().setVisible(false);
			gui.getPr1().setVisible(false);
		}
		
		if(evento.getActionCommand().equals(gui.getP1().ESCRIBIR1)) {
			aux = gui.getP1().getTextNombre().getText();
			rgjugador.setNombre(aux);
			aux9 = Integer.parseInt(gui.getP1().getTextEdad().getText());
			rgjugador.setEdad(aux9);
			aux2 = gui.getP1().getTextGenero().getText();
			rgjugador.setGenero(aux2);
			aux7 = Double.parseDouble(gui.getP1().getTextPuntaje().getText());
			rgjugador.setPuntaje(aux7);
			
			md.getJF().escribirArchivoJugador(rgsjugador);
		}
		
		if(evento.getActionCommand().equals(gui.getP1().LEER1)) {
			md.getJF().leerArchivoJugador();
			System.out.println(rgsjugador);
			System.out.println(rgjugador);
			gui.imprimirJugador(rgsjugador);
			gui.imprimirJugador(rgjugador);
		}
		
//		///////////////PANEL 2//////////////////////////////////////////////////////

		if(evento.getActionCommand().equals(gui.getP4().JUEGOS)) {
			gui.getP2().setVisible(true);
			gui.getPr2().setVisible(true);
			gui.getP4().setVisible(false);
		
		}
		
		if(evento.getActionCommand().equals(gui.getP2().VOLVER2)){
			gui.getP2().setVisible(false);
			gui.getPr2().setVisible(false);
			gui.getP4().setVisible(true);

		}
		
		if(evento.getActionCommand().equals(gui.getP2().ESCRIBIR2)) {
			aux = gui.getP2().getTextnombreJuego().getText();
			rgjuego.setNombre(aux);
			aux2 = gui.getP2().getTexttipoJuego().getText();
			rgjuego.setTipo(aux2);

			md.getGF().escribirArchivoJuego(rgsjuego);
		}
		
		if(evento.getActionCommand().equals(gui.getP2().LEER2)) {
			md.getGF().leerArchivoJuego();
			System.out.println(rgsjuego);
			System.out.println(rgjuego);
			gui.imprimirJuego(rgsjuego);
			gui.imprimirJuego(rgjuego);
		}
		

		
//		///////////////PANEL 3//////////////////////////////////////////////////////
		
		if(evento.getActionCommand().equals(gui.getP4().PARTIDAS)) {
			gui.getP4().setVisible(false);
			gui.getP3().setVisible(true);
			gui.getP3().getTxtjuego().setText("");
			gui.getP3().getTxtjugador1().setText("");
			gui.getP3().getTxtjugador2().setText("");
			gui.getP3().getTxtpuntaje1().setText("");
			gui.getP3().getTxtpuntaje2().setText("");
			gui.getP3().getTxtTipoPartida().setText("");
			gui.getPr3().setVisible(true);
			
		}
		
		if(evento.getActionCommand().equals(gui.getP3().VOLVER3)){
			gui.getP3().setVisible(false);
			gui.getPr3().setVisible(false);
			gui.getP4().setVisible(true);
			gui.getP3().getTxtjuego().setText("");
			gui.getP3().getTxtjugador1().setText("");
			gui.getP3().getTxtjugador2().setText("");
			gui.getP3().getTxtpuntaje1().setText("");
			gui.getP3().getTxtpuntaje2().setText("");
			gui.getP3().getTxtTipoPartida().setText("");
			gui.setSize(600,400);
		}

		if(evento.getActionCommand().equals(gui.getP3().ESCRIBIR3)){
			aux = gui.getP3().getTxtjugador1().getText();
			rgpartida.setJugador1(aux);
			aux7 = Double.parseDouble(gui.getP3().getTxtpuntaje1().getText());
			rgpartida.setPuntaje1(aux7);
			aux2 = gui.getP3().getTxtjugador2().getText();
			rgpartida.setJugador2(aux2);
			aux8 =  Double.parseDouble(gui.getP3().getTxtpuntaje2().getText());
			rgpartida.setPuntaje2(aux8);
			aux3 = gui.getP3().getTxtjuego().getText();
			rgpartida.setJuego(aux3);
			aux4 = gui.getP3().getTxtTipoPartida().getText();
			rgpartida.setTipoPartida(aux4);
			
			md.getPF().escribirArchivoPartida(rgspartida);
			System.out.println(rgspartida);
		}
		
		if(evento.getActionCommand().equals(gui.getP3().LEER3)){
			md.getPF().leerArchivoPartida();
			System.out.println(rgspartida);
			System.out.println(rgpartida);
			gui.imprimirPartida(rgspartida);
			gui.imprimirPartida(rgpartida);
		}
	}
	
	
	public void buscarJuego() {
		String njuego = gui.pedirString("Ingrese el nombre del juego a buscar");
		JuegoDTO registro =jdao.buscarJuego(njuego);
		if (registro == null) {
			gui.mostrarMensaje("El Juego  no existe");
		}
		else {
			gui.imprimirJuego(registro);
		}	
	}
}	