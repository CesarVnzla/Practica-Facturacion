package EjercicioFacturacion;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class FacturaTelevision extends JPanel {
	private JTextField DatosFactura;
	private JTextField DatosModelo;
	private JTextField DatosPulgadas;
	private JTextField DatosPrecio;
	private JTextField DatosFecha;
	private JTextField DatoImporte;
	private JTextField DatosVoltaje;

	/**
	 * Create the panel.
	 */
	public FacturaTelevision() {
		setLayout(null);
		
		JLabel lblFacturaTelevision = new JLabel("Factura Television");
		lblFacturaTelevision.setBounds(143, 5, 164, 22);
		lblFacturaTelevision.setFont(new Font("Tahoma", Font.BOLD, 18));
		add(lblFacturaTelevision);
		
		
		
		JLabel lblNroFactura = new JLabel("Nro Factura:");
		lblNroFactura.setBounds(30, 62, 72, 16);
		add(lblNroFactura);
		
		DatosFactura = new JTextField();
		DatosFactura.setBounds(114, 59, 94, 22);
		add(DatosFactura);
		DatosFactura.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(40, 97, 56, 16);
		add(lblModelo);
		
		DatosModelo = new JTextField();
		DatosModelo.setBounds(114, 94, 94, 22);
		add(DatosModelo);
		DatosModelo.setColumns(10);
		
		JLabel lblPulgadas = new JLabel("Pulgadas:");
		lblPulgadas.setBounds(40, 132, 56, 16);
		add(lblPulgadas);
		
		DatosPulgadas = new JTextField();
		DatosPulgadas.setBounds(114, 129, 94, 22);
		add(DatosPulgadas);
		DatosPulgadas.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(50, 167, 56, 16);
		add(lblPrecio);
		
		DatosPrecio = new JTextField();
		DatosPrecio.setBounds(114, 164, 94, 22);
		add(DatosPrecio);
		DatosPrecio.setColumns(10);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(253, 62, 56, 16);
		add(lblFecha);
		
		DatosFecha = new JTextField();
		DatosFecha.setBounds(309, 59, 72, 22);
		add(DatosFecha);
		DatosFecha.setColumns(10);
		
		JLabel lblImporte = new JLabel("Importe:");
		lblImporte.setBounds(270, 167, 56, 16);
		add(lblImporte);
		
		DatoImporte = new JTextField();
		DatoImporte.setBounds(322, 164, 36, 22);
		add(DatoImporte);
		DatoImporte.setColumns(10);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setBounds(178, 218, 97, 25);
		add(btnImprimir);
		
		JLabel lblNewLabel = new JLabel(" Voltaje: ");
		lblNewLabel.setBounds(250, 111, 57, 16);
		add(lblNewLabel);
		
		DatosVoltaje = new JTextField();
		DatosVoltaje.setBounds(310, 108, 72, 22);
		add(DatosVoltaje);
		DatosVoltaje.setColumns(10);
		
		
		
		btnImprimir.addActionListener( new gestiona() );
		
		

	}
	

		public  void resultadoO (){
		
		int fac=Integer.parseInt(DatosFactura.getText());
		double pul=Double.parseDouble(DatosPulgadas.getText());
		String mod=DatosModelo.getText();
		double pre= Double.parseDouble(DatosPrecio.getText());
		double im=Double.parseDouble(DatoImporte.getText());
		String fe=DatosFecha.getText();
		int vol=Integer.parseInt(DatosVoltaje.getText());
		
		a2_Television tv=new a2_Television(pul,vol,pre);
		
		a1_Factura fac1= new a1_Factura(mod,fac, tv, null,0,im);
		
		
		fac1.CapturaDescuentotv();
	
		
	}
	
	private class gestiona implements ActionListener{

		
		public void actionPerformed(ActionEvent arg0) {
			
			resultadoO();
			
		
			
		}
	
	}

	}


