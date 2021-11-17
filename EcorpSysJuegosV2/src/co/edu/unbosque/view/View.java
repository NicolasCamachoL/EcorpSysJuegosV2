package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.util.ArrayList;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.JuegoDTO;
import co.edu.unbosque.model.JugadorDTO;
import co.edu.unbosque.model.PartidaDTO;


public class View extends JFrame{
	//Constante generada por Eclipse  
	private static final long serialVersionUID = 1L;
	
	private Panel1 p1;
	private Panel2 p2;
	private Panel3 p3;
	private Panel4 p4;
	private Panel3Resultados pr3;
	private Panel2Resultados pr2;
	private Panel1Resultados pr1;


	public View(Controller control) {
		setBackground(Color.BLACK);
		setSize(600,400);
		setResizable(false); 
		getContentPane().setLayout(null);
		setTitle("Sistema de Informacion de Juegos"); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); 
		setLayout(null);

		p1 = new Panel1(control);
		
		pr1 = new Panel1Resultados();
		
	    p2 = new Panel2(control);
	    p2.setBounds(0, 0, 300, 400);
	    getContentPane().add(p2);
	    
	    pr2 = new Panel2Resultados();
	    pr2.setBounds(300, 0, 286, 362);
	    getContentPane().add(pr2);

		p3 = new Panel3(control);
		p3.setBounds(0, 0, 584, 180);
		getContentPane().add(p3);

		pr3 = new Panel3Resultados();
		pr3.setBounds(0,180,584,180);
		getContentPane().add(pr3);
		
		p4 = new Panel4(control);
		p4.setBounds(0, 0, 584, 362);
		getContentPane().add(p4);
		
		p1.getButVolver().addActionListener(control);
		p1.getLeerButton().addActionListener(control);
		p1.getEscrButton().addActionListener(control);
		
		p2.getBtnVolver().addActionListener(control);
		p2.getBtnEscribir().addActionListener(control);
		p2.getBtnLeer().addActionListener(control);

		p3.getButEscribir().addActionListener(control);
	   	p3.getButLeer().addActionListener(control);
	   	p3.getButVolver().addActionListener(control);
			
		p4.getButjugadores().addActionListener(control);
	   	p4.getButjuegos().addActionListener(control);
    	p4.getButpartidas().addActionListener(control);
	}
	
	public void escribirMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "archivos binarios", JOptionPane.INFORMATION_MESSAGE);
	}

	public void imprimirPartida(ArrayList<PartidaDTO> prtds) {
		for(PartidaDTO rParts : prtds) {
			getPr3().getTxtjugador1().append(String.valueOf(rParts.getJugador1())+"\n");
			getPr3().getTxtpuntaje1().append(String.valueOf(rParts.getPuntaje1())+"\n");
			getPr3().getTxtjugador2().append(String.valueOf(rParts.getJugador2())+"\n");
			getPr3().getTxtpuntaje2().append(String.valueOf(rParts.getPuntaje2())+"\n");
			getPr3().getTxtJuego().append(String.valueOf(rParts.getJuego())+"\n");
			getPr3().getTxtTipoPartida().append(String.valueOf(rParts.getTipoPartida())+"\n");
		}
	}
	

	public void imprimirPartida(PartidaDTO prtds) {
		getPr3().getTxtjugador1().append(String.valueOf(prtds.getJugador1())+"\n");
		getPr3().getTxtpuntaje1().append(String.valueOf(prtds.getPuntaje1())+"\n");
		getPr3().getTxtjugador2().append(String.valueOf(prtds.getJugador2())+"\n");
		getPr3().getTxtpuntaje2().append(String.valueOf(prtds.getPuntaje2())+"\n");
		getPr3().getTxtJuego().append(String.valueOf(prtds.getJuego())+"\n");
		getPr3().getTxtTipoPartida().append(String.valueOf(prtds.getTipoPartida())+"\n");
	}
	
	public void imprimirJuego(ArrayList<JuegoDTO> jgdto) {
		for(JuegoDTO rJgrs : jgdto) {
			getPr2().getTxtnombre().append(String.valueOf(rJgrs.getNombre())+"\n");
			getPr2().getTxtTipo().append(String.valueOf(rJgrs.getTipo())+"\n");
		}
	}
	
	public void imprimirJuego(JuegoDTO jgdto) {
		getPr2().getTxtnombre().append(String.valueOf(jgdto.getNombre())+"\n");
		getPr2().getTxtTipo().append(String.valueOf(jgdto.getTipo())+"\n");
	}
	
	public void imprimirJugador(ArrayList<JugadorDTO> jrtds) {
		for(JugadorDTO rJarts : jrtds) {
			getPr1().getTxtnombre().append(String.valueOf(rJarts.getNombre())+"\n");
			getPr1().getTxtedad().append(String.valueOf(rJarts.getEdad())+"\n");
			getPr1().getTxtgenero().append(String.valueOf(rJarts.getGenero())+"\n");
			getPr1().getTxtpuntaje().append(String.valueOf(rJarts.getPuntaje())+"\n");
		}
	}
	
	public void imprimirJugador(JugadorDTO jrtds) {
		getPr1().getTxtnombre().append(String.valueOf(jrtds.getNombre())+"\n");
		getPr1().getTxtedad().append(String.valueOf(jrtds.getEdad())+"\n");
		getPr1().getTxtgenero().append(String.valueOf(jrtds.getGenero())+"\n");
		getPr1().getTxtpuntaje().append(String.valueOf(jrtds.getPuntaje())+"\n");
	}

	public Panel1 getP1() {
		return p1;
	}

	public void setP1(Panel1 p1) {
		this.p1 = p1;
	}

	public Panel2 getP2() {
		return p2;
	}

	public void setP2(Panel2 p2) {
		this.p2 = p2;
	}

	public Panel3 getP3() {
		return p3;
	}

	public void setP3(Panel3 p3) {
		this.p3 = p3;
	}

	public Panel4 getP4() {
		return p4;
	}

	public void setP4(Panel4 p4) {
		this.p4 = p4;
	}

	public Panel3Resultados getPr3() {
		return pr3;
	}

	public void setPr3(Panel3Resultados pr3) {
		this.pr3 = pr3;
	}

	public Panel2Resultados getPr2() {
		return pr2;
	}

	public void setPr2(Panel2Resultados pr2) {
		this.pr2 = pr2;
	}

	public Panel1Resultados getPr1() {
		return pr1;
	}

	public void setPr1(Panel1Resultados pr1) {
		this.pr1 = pr1;
	}
	
	
}