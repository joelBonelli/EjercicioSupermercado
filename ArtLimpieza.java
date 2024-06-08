
public class ArtLimpieza extends Producto{

	private String contenido;
	
	public ArtLimpieza() {
	}

	public ArtLimpieza(String nombre, String contenido, double precio) {
		super(nombre, precio);
		this.contenido = contenido;
	}

	
	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "Nombre: " + this.getNombre() + " /// Contenido: " + this.getContenido() + " /// Precio: $" + this.getPrecio();
	}

}
