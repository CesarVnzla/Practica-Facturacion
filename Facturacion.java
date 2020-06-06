package EjercicioFacturacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Facturacion extends JFrame implements ActionListener{

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Facturacion frame = new Facturacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Facturacion() {
		
		setTitle("Facturacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 300, 473, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		contentPane.add(tv);
		
		
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		btnTelevision = new JButton("Television");
		panel.add(btnTelevision);
		
		btnEquipoDeSonido = new JButton("Equipo de Sonido");
		panel.add(btnEquipoDeSonido);
		
		btnTelevision.addActionListener(this);
		btnEquipoDeSonido.addActionListener(this);
		
		tv.setVisible(true);
		equipo.setVisible(false);
		
		DeshabilitarBotones();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object evt= e.getSource();
		
		if(evt.equals(btnTelevision)) {
			
			equipo.setVisible(false);
			tv.setVisible(true);
			
			contentPane.add(tv);
			
			contentPane.validate();
			
			DeshabilitarBotones();

		}else if (evt.equals(btnEquipoDeSonido)) {
			
			equipo.setVisible(true);
			tv.setVisible(false);
			
			contentPane.add(equipo);
			
			contentPane.validate();
			
			DeshabilitarBotones();
			
		}
		
		
		
	}
	
	public void DeshabilitarBotones() {
		
		if(tv.isVisible()) {
			
			btnTelevision.setEnabled(false);
			btnEquipoDeSonido.setEnabled(true);
			
		}else if(equipo.isVisible()) {
			
			btnTelevision.setEnabled(true);
			btnEquipoDeSonido.setEnabled(false);
			
		}
		
	}
	
	private JButton btnTelevision;
	private JButton btnEquipoDeSonido;
	
	private JPanel contentPane;
	
	FacturaTelevision tv=new FacturaTelevision();
	FacturaEQuipoDeSonido equipo=new FacturaEQuipoDeSonido();
	

}

	 class FacturacionDeEquipos{
		 
		 private String modelo;
		 private String pulgadas;
		 private double precio;
		 private double importe;
		 private String fecha;
		 
		public FacturacionDeEquipos(String modelo, String pulgadas, double precio, double importe, String fecha) {
			
			this.modelo = modelo;
			this.pulgadas = pulgadas;
			this.precio = precio;
			this.importe = importe;
			this.fecha=fecha;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getPulgadas() {
			return pulgadas;
		}

		public void setPulgadas(String pulgadas) {
			this.pulgadas = pulgadas;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public double getImporte() {
			return importe;
		}

		public void setImporte(double importe) {
			this.importe = importe;
		}

		public String getFecha() {
			return fecha;
		}

		public void setFecha(String fecha) {
			this.fecha = fecha;
		}

	
		
		
		
		 
		
		
		
	}
