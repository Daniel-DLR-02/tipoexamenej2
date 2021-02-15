package ejercicio2;

public class EspadaLaser extends Producto {
	
	private String tipo;
	private double porcentajeGanancias;
	private double precioTipoDoble;

	public EspadaLaser(double precioBase, int cantidad, String nombre,boolean vendido, String tipo,double porcentajeGanancias,double precioTipoDoble) {
		super(precioBase, cantidad, nombre,vendido);
		this.tipo = tipo;
		this.porcentajeGanancias=porcentajeGanancias;
		this.precioTipoDoble=precioTipoDoble;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "EspadaLaser [tipo=" + tipo + ", getPrecioBase()=" + getPrecioBase() + ", getCantidad()=" + getCantidad()
				+ ", getNombre()=" + getNombre() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	@Override
	public double calcularPvp() {
		String nombre="Doble";
		if(tipo.equals(nombre))
			return super.calcularPvp()+(porcentajeGanancias*super.calcularPvp()/100)+precioTipoDoble;
		else
			return super.calcularPvp()+(porcentajeGanancias*super.calcularPvp()/100);
		
	}
	
	

	
}
