package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Panel2Resultados extends JPanel{
	
	private JTextArea txtnombre;
	private JTextArea txtTipo;
	private JLabel labArchivo;
	private JTable tabTest;
	private JScrollPane scrollTest;
	private DefaultTableModel dtbTest;
	private static final long serialVersionUID = 1L;
	
	public Panel2Resultados() {
		setVisible(false);
		setLayout( new GridLayout(1,2) );
		setBackground(Color.BLACK);
		TitledBorder border = BorderFactory.createTitledBorder("Lectura Registros");
		border.setTitleColor(Color.WHITE);
		setBorder( border );
		labArchivo = new JLabel("Resultado de Registros");
//		
//		dtbTest = new DefaultTableModel(new String[] {"Nombre","Tipo"}, 0);
//		tabTest = new JTable(dtbTest);
//		tabTest.setEnabled(false);
//		tabTest.getTableHeader().setReorderingAllowed(false);
//		tabTest.getTableHeader().setResizingAllowed(false);
//		scrollTest = new JScrollPane(tabTest);
//		add(scrollTest);
		
		txtnombre = new JTextArea();
		txtnombre.setForeground(Color.BLACK);
		txtnombre.setBackground(Color.WHITE);
		add(txtnombre);

		txtTipo = new JTextArea();
		txtTipo.setForeground(Color.BLACK);
		txtTipo.setBackground(Color.WHITE);
		add(txtTipo);

	}

	public JTextArea getTxtnombre() {
		return txtnombre;
	}

	public void setTxtnombre(JTextArea txtnombre) {
		this.txtnombre = txtnombre;
	}

	public JTextArea getTxtTipo() {
		return txtTipo;
	}

	public void setTxtTipo(JTextArea txtTipo) {
		this.txtTipo = txtTipo;
	}

	public JLabel getLabArchivo() {
		return labArchivo;
	}

	public void setLabArchivo(JLabel labArchivo) {
		this.labArchivo = labArchivo;
	}
}