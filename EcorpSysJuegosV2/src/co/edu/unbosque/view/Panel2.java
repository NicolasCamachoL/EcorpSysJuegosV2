package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import co.edu.unbosque.controller.Controller;

import java.awt.Color;
import java.awt.Font;

public class Panel2 extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JButton btnEscribir;//Escribir
	private JButton btnLeer;//Leer
	private JButton btnVolver;//Volver
	
	private JLabel lblnombreJuego;//Nombre del Juego
	private JLabel lbltipoJuego;//Tipo de Juego
	private JTextField textnombreJuego;
	private JTextField texttipoJuego;
	
	public static final String ESCRIBIR2 = "Escribir";
	public static final String LEER2 = "Leer";
	public static final String VOLVER2 = "Volver";

	public Panel2(Controller control) {
		setForeground(Color.WHITE);
		setVisible(false);
		setBackground(Color.BLACK);
		setLayout(null);
		
		btnEscribir = new JButton("Escribir");
		btnEscribir.setBounds(190, 226, 89, 23);
		btnEscribir.setActionCommand(ESCRIBIR2);
		add(btnEscribir);
		
		btnLeer = new JButton("Leer");
		btnLeer.setBounds(20, 226, 89, 23);
		btnLeer.setActionCommand(LEER2);
		add(btnLeer);
		
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(105, 280, 89, 23);
		btnVolver.setActionCommand(VOLVER2);
		add(btnVolver);
		
		lblnombreJuego = new JLabel("Nombre del juego ");
		lblnombreJuego.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblnombreJuego.setForeground(Color.WHITE);
		lblnombreJuego.setBounds(10, 50, 124, 20);
		add(lblnombreJuego);
		
		lbltipoJuego = new JLabel("Tipo de juego");
		lbltipoJuego.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lbltipoJuego.setForeground(Color.WHITE);
		lbltipoJuego.setBounds(10, 100, 89, 20);
		add(lbltipoJuego);
	
		textnombreJuego = new JTextField();
		textnombreJuego.setBounds(120, 50, 86, 20);
		add(textnombreJuego);
		textnombreJuego.setColumns(10);
		
		texttipoJuego = new JTextField();
		texttipoJuego.setBounds(120, 100, 86, 20);
		add(texttipoJuego);
		texttipoJuego.setColumns(10);
		
	}
	
	public static String getVolver2() {
		return VOLVER2;
	}
	
	public static String getLeer2() {
		return LEER2;
	}
	
	public static String getEscribir2() {
		return ESCRIBIR2;
	}
	
	public JButton getBtnEscribir() {
		return btnEscribir;
	}
	
	public void setBtnEscribir(JButton btnEscribir) {
		this.btnEscribir = btnEscribir;
	}

	public JButton getBtnLeer() {
		return btnLeer;
	}
	
	public void setBtnLeer(JButton btnLeer) {
		this.btnLeer = btnLeer;
	}
	
	public JButton getBtnVolver() {
		return btnVolver;
	}
	
	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}
	
	public JLabel getLblnombreJuego() {
		return lblnombreJuego;
	}
	
	public void setLblnombreJuego(JLabel lblnombreJuego) {
		this.lblnombreJuego = lblnombreJuego;
	}
	
	public JLabel getLbltipoJuego() {
		return lbltipoJuego;
	}
	
	public void setLbltipoJuego(JLabel lbltipoJuego) {
		this.lbltipoJuego = lbltipoJuego;
	}
	
	public JTextField getTextnombreJuego() {
		return textnombreJuego;
	}
	
	public void setTextnombreJuego(JTextField textnombreJuego) {
		this.textnombreJuego = textnombreJuego;
	}
	
	public JTextField getTexttipoJuego() {
		return texttipoJuego;
	}
	
	public void setTexttipoJuego(JTextField texttipoJuego) {
		this.texttipoJuego = texttipoJuego;
	}
	
}
