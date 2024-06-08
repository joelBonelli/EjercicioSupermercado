
public class Bebida extends Producto{
	
	private double litros;
	
	
	

	public Bebida() {		
	}

	public Bebida(String nombre, double litros, double precio) {
		super(nombre, precio);
		this.litros = litros;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	@Override
	public String toString() {
		
		return "Nombre: " + this.getNombre() + " /// Litros: " + this.getLitros() + " /// Precio: $" + this.getPrecio();
	}
	
	

}
