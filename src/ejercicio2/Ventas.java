package ejercicio2;

public class Ventas {
	
	public void mostrarAvisoEspada(Producto p1) {
		if(p1 instanceof EspadaLaser)
			System.out.println("¡Cuidadín al sacarla de la bolsa, que hace pupa!");
	}
	
	public double calcularTotalRecaudado(Producto [] listaProductos) {
		
		double total=0;
		
		for(int i=0;i<listaProductos.length;i++) {
			
			total += calcularPrecioProducto(listaProductos[i]);
			
		}
		
		return total;
	}
	
	public double calcularPrecioProducto(Producto p) {
		return p.calcularPvp();
	}
	
	public int comprobarProductosVendidos(Producto [] listaProductos) {
		int contador=0;
		for(int i=0;i<listaProductos.length;i++) {
			if(listaProductos[i].isVendido())
				contador++;
		}
		return contador;
	}
	
	public double devolverVuelta(double dineroPagado,Producto p1) {
		
		double vuelta;
		vuelta=dineroPagado-(p1.getCantidad()*p1.calcularPvp());
		return vuelta;
	}
	
}
