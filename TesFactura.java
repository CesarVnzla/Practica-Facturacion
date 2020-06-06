package EjercicioFacturacion;

public class TesFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double totalimporte;
		long totalprecio;
		
		a2_Television tv=new a2_Television(32,110,5000);
		
		a1_Factura fac1= new a1_Factura("Cesar",1252, tv, null,0,12);
		
		totalimporte=12/100; //la 
		// 12/100 = 0,12 + 1 = 1,12
		
		//totalprecio= (float) (tv.getPrecio()*(1+totalimporte));
		//precio = 50.000 * 1,12 = 56000
		
		System.out.println(totalimporte);
		System.out.println(tv.getPrecio());
		//System.out.println(totalprecio);
		
	//	fac1.CapturaDescuentotv(); estas si viste aqui no meda muchos 00
		//uelvelo a poner como estaba

	}
	
	

}
