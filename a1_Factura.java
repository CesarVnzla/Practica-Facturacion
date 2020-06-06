package EjercicioFacturacion;

public class a1_Factura {
	
	int numero;
	String nombre;
	a2_Television tv;
	a3_EquipoDeSonido equipo;
	double descuento;
	double importe;
	double totalImporte;
	double totalPagar;
	double PrecioImporte;
	double PrecioMimporte;

	
	
	public a1_Factura() {
		
	}


	public a1_Factura(String nombre, int numero, a2_Television tv, a3_EquipoDeSonido equipo, double descuento, double importe) {
		super();
		this.importe=importe;
		this.nombre=nombre;
		this.numero = numero;
		this.tv = tv;
		this.equipo = equipo;
		this.descuento = descuento;
	}
	
	void CapturaDescuentotv() {
		
		
		totalImporte=(importe/100); 
		
	
		PrecioImporte=tv.getPrecio()*totalImporte;
		
		
		
		PrecioMimporte=tv.getPrecio()+PrecioImporte;
		
		
		
		if(tv.getTamano()<=42) {
			
			descuento=PrecioMimporte*0.20;
			
			totalPagar=tv.getPrecio()-descuento;
			
		}else {
			
			descuento=0;
			
			totalPagar=PrecioMimporte;
		}
		
		
		
		
		
		System.out.println("Numero de Factura: " + numero);
		System.out.println("Marcar del tv: " + nombre);
		System.out.println("Tamaño: " + tv.getTamano());
		System.out.println("Voltaje: " + tv.getVoltaje());
		System.out.println("Precio: " + tv.getPrecio());
		System.out.println("Importe: " + importe +"%");
		System.out.println("Total + IVA: " + PrecioMimporte);
		System.out.println("Tiene un descuento de: " + descuento);
		System.out.println("Total a Pagar: " + totalPagar);
		
		
	}
	
	void CapturaDescuentoEquipo() {
		
		if(equipo.getVoltaje()<220) {
			
			descuento=equipo.getPrecio()*(1-0.20);
		}else {
			
			descuento=equipo.getPrecio();
		}
		
		
	}
	

	
	

}
