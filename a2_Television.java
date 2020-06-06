package EjercicioFacturacion;

public class a2_Television extends a4_Aparato{
	
	double tamano;

	public a2_Television(double tamano) {
		super();
		this.tamano = tamano;
	}

	public a2_Television(double tamano, int voltaje, double precio) {
		super(voltaje, precio);
		// TODO Auto-generated constructor stub
		this.tamano=tamano;
		
		
	}

	public double getTamano() {
		return tamano;
	}
	
	
	
	

}
