import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Producto>listaProductos = new ArrayList<>();
		cargarProducto(listaProductos);
		
		for (Producto producto : listaProductos) {
			System.out.println(producto);
		}
		System.out.println("=================================================================");
		
		Producto masCaro = Collections.max(listaProductos);
		Producto masBarato = Collections.min(listaProductos);
		
		System.out.println("Producto más caro: " + masCaro.getNombre());
		System.out.println("Producto más barato: " + masBarato.getNombre());

	}
	
	public static ArrayList<Producto> cargarProducto(ArrayList<Producto> p){
		p.add(new Bebida("Coca-Cola Zero", 1.5, 20));
		p.add(new Bebida("Coca-Cola", 1.5, 18));
		p.add(new ArtLimpieza("Shampoo Sedal", "500ml", 19));
		p.add(new Fruta("Frutillas", 64, "kilo"));
		
		return p;
	}
	

}
