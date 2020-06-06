package EjercicioFacturacion;

public class a3_EquipoDeSonido extends a4_Aparato{
	
	int CantidadDeCDs;

	public a3_EquipoDeSonido() {
		
	}

	public a3_EquipoDeSonido(int cantidadDeCDs) {
		
		CantidadDeCDs = cantidadDeCDs;
	}

	public a3_EquipoDeSonido( int cantidadDeCDs, int voltaje, double precio) {
		
		super(voltaje, precio);
		// TODO Auto-generated constructor stub
		this.CantidadDeCDs=cantidadDeCDs;
	}

	public int getCantidadDeCDs() {
		return CantidadDeCDs;
	}
	
	
	
	
	
	
	

}
