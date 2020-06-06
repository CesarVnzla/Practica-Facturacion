package EjercicioFacturacion;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class FacturaEQuipoDeSonido extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public FacturaEQuipoDeSonido() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Facturacion de Equipo de Sonido");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(47, 13, 295, 23);
		add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Modelo:");
		lblNombre.setBounds(47, 76, 56, 16);
		add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(101, 73, 91, 22);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblPulgadas = new JLabel("Cantidad de CD:");
		lblPulgadas.setBounds(0, 116, 93, 16);
		add(lblPulgadas);
		
		textField_1 = new JTextField();
		textField_1.setBounds(101, 113, 91, 22);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(253, 76, 56, 16);
		add(lblFecha);
		
		textField_2 = new JTextField();
		textField_2.setBounds(299, 73, 81, 22);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(47, 151, 43, 16);
		add(lblPrecio);
		
		textField_3 = new JTextField();
		textField_3.setBounds(101, 148, 91, 22);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblImporte = new JLabel("Importe:");
		lblImporte.setBounds(239, 151, 56, 16);
		add(lblImporte);
		
		textField_4 = new JTextField();
		textField_4.setBounds(299, 148, 43, 22);
		add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setForeground(Color.BLACK);
		btnImprimir.setBounds(169, 215, 97, 25);
		add(btnImprimir);

	}
}



