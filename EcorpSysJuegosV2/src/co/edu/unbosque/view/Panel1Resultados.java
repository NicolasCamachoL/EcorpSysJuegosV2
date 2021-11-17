package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class Panel1Resultados extends JDialog{
	
	private JTextArea txtnombre;
	private JTextArea txtedad;
	private JTextArea txtgenero;
	private JTextArea txtpuntaje;
	private JLabel labArchivo;
	
	private static final long serialVersionUID = 1L;
	
	public Panel1Resultados() {
		setTitle("Resultados Panel 1");
		setVisible(false);
		setBounds(400, 500, 400, 400);
		setLayout( new GridLayout(1,3) );
		setBackground(Color.BLACK);
		
		labArchivo = new JLabel("Resultado de Registros");
		labArchivo.setForeground(Color.BLACK);
		labArchivo.setBackground(Color.WHITE);
		
		txtnombre = new JTextArea();
		txtnombre.setForeground(Color.BLACK);
		txtnombre.setBackground(Color.WHITE);

		txtedad = new JTextArea();
		txtedad.setForeground(Color.BLACK);
		txtedad.setBackground(Color.WHITE);
		
		txtgenero = new JTextArea();
		txtgenero.setForeground(Color.BLACK);
		txtgenero.setBackground(Color.WHITE);
		
		txtpuntaje = new JTextArea();
		txtpuntaje.setForeground(Color.BLACK);
		txtpuntaje.setBackground(Color.WHITE);

		add(txtnombre);
		add(txtedad);
		add(txtgenero);
		add(txtpuntaje);
	}

	public JTextArea getTxtnombre() {
		return txtnombre;
	}

	public void setTxtnombre(JTextArea txtnombre) {
		this.txtnombre = txtnombre;
	}

	public JTextArea getTxtedad() {
		return txtedad;
	}

	public void setTxtedad(JTextArea txtedad) {
		this.txtedad = txtedad;
	}

	public JTextArea getTxtgenero() {
		return txtgenero;
	}

	public void setTxtgenero(JTextArea txtgenero) {
		this.txtgenero = txtgenero;
	}

	public JLabel getLabArchivo() {
		return labArchivo;
	}

	public void setLabArchivo(JLabel labArchivo) {
		this.labArchivo = labArchivo;
	}

	public JTextArea getTxtpuntaje() {
		return txtpuntaje;
	}

	public void setTxtpuntaje(JTextArea txtpuntaje) {
		this.txtpuntaje = txtpuntaje;
	}

}
