package ejercicio2;

public class Movil extends Producto {

	private String marca;
	private String modelo;
	private double porcentajeGanancia;
	
	public Movil(double precioBase, int cantidad, String nombre,boolean vendido, String marca, String modelo, double porcentajeGanancia) {
		super(precioBase, cantidad, nombre, vendido);
		this.marca = marca;
		this.modelo = modelo;
		this.porcentajeGanancia=porcentajeGanancia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Movil [marca=" + marca + ", modelo=" + modelo + ", getPrecioBase()=" + getPrecioBase()
				+ ", getCantidad()=" + getCantidad() + ", getNombre()=" + getNombre() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
//	El precio de venta al público de un móvil se calcula como el precio base más el porcentaje de ganancia
//	del vendedor (pasado desde fuera como parámetro)
	@Override
	public double calcularPvp() {
		return super.calcularPvp()+(super.calcularPvp()*porcentajeGanancia/100);
		
	}



	
	
	
	
}
