package co.edu.unbosque.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.unbosque.controller.Controller;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
public class Panel1 extends  JDialog {

	private static final long serialVersionUID = 1L;


	private final JPanel contentPanel = new JPanel();
	private JTextField textNombre;
	private JTextField textEdad;
	private JTextField textGenero;
	private JTextField textPuntaje;
	private JButton butVolver;
	private JButton escrButton;
	private JButton leerButton;

	public static final String LEER1 = "Leer1";
	public static final String ESCRIBIR1 = "Escribir1";
	public static final String VOLVER1 = "Volver1";

	
	public Panel1(Controller control) {
		getContentPane().setBackground(Color.BLACK);
		
		setTitle("Panel Jugador");
		setVisible(false);
		setBounds(400, 150, 331, 289);
		getContentPane().setLayout(null);
		contentPanel.setBackground(Color.BLACK);
		contentPanel.setBounds(0, 0, 315, 250);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JLabel lblNombre = new JLabel("Nombre");
			lblNombre.setForeground(Color.WHITE);
			lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			lblNombre.setBounds(10, 27, 86, 14);
			contentPanel.add(lblNombre);
		}
		{
			textNombre = new JTextField();
			textNombre.setBounds(75, 25, 86, 20);
			contentPanel.add(textNombre);
			textNombre.setColumns(10);
		}
		{
			JLabel lblEdad = new JLabel("Edad");
			lblEdad.setForeground(Color.WHITE);
			lblEdad.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			lblEdad.setBounds(10, 62, 70, 14);
			contentPanel.add(lblEdad);
		}
		{
			textEdad = new JTextField();
			textEdad.setBounds(75, 60, 86, 20);
			contentPanel.add(textEdad);
			textEdad.setColumns(10);
		}
		{
			JLabel lblGenero = new JLabel("Genero");
			lblGenero.setForeground(Color.WHITE);
			lblGenero.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			lblGenero.setBounds(10, 105, 70, 14);
			contentPanel.add(lblGenero);
		}
		{
			textGenero = new JTextField();
			textGenero.setBounds(75, 103, 86, 20);
			contentPanel.add(textGenero);
			textGenero.setColumns(10);
		}
		{
			JLabel lblPuntaje = new JLabel("Puntaje");
			lblPuntaje.setForeground(Color.WHITE);
			lblPuntaje.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			lblPuntaje.setBounds(10, 158, 70, 14);
			contentPanel.add(lblPuntaje);
		}
		{
			textPuntaje = new JTextField();
			textPuntaje.setBounds(75, 156, 86, 20);
			contentPanel.add(textPuntaje);
			textPuntaje.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 210, 315, 40);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			{
				leerButton = new JButton("Leer");
				leerButton.setActionCommand(LEER1);
				buttonPane.add(leerButton);
				getRootPane().setDefaultButton(leerButton);
			}
			{
				escrButton = new JButton("Escribir");
				escrButton.setActionCommand(ESCRIBIR1);
				buttonPane.add(escrButton);
				getRootPane().setDefaultButton(escrButton);
			}
			{
				butVolver = new JButton("Volver");
				butVolver.setActionCommand(VOLVER1);
				buttonPane.add(butVolver);
				getRootPane().setDefaultButton(butVolver);
			}
		}
	}

	public static String getLeer1() {
		return LEER1;
	}

	public static String getEscribir1() {
		return ESCRIBIR1;
	}
	
	public static String getVolver1() {
		return VOLVER1;
	}

	public JButton getButVolver() {
		return butVolver;
	}


	public void setButVolver(JButton butVolver) {
		this.butVolver = butVolver;
	}


	public JButton getEscrButton() {
		return escrButton;
	}


	public void setEscrButton(JButton escrButton) {
		this.escrButton = escrButton;
	}


	public JButton getLeerButton() {
		return leerButton;
	}


	public void setLeerButton(JButton leerButton) {
		this.leerButton = leerButton;
	}

	public JTextField getTextNombre() {
		return textNombre;
	}

	public void setTextNombre(JTextField textNombre) {
		this.textNombre = textNombre;
	}

	public JTextField getTextEdad() {
		return textEdad;
	}

	public void setTextEdad(JTextField textEdad) {
		this.textEdad = textEdad;
	}

	public JTextField getTextGenero() {
		return textGenero;
	}

	public void setTextGenero(JTextField textGenero) {
		this.textGenero = textGenero;
	}

	public JTextField getTextPuntaje() {
		return textPuntaje;
	}

	public void setTextPuntaje(JTextField textPuntaje) {
		this.textPuntaje = textPuntaje;
	}
	

}

