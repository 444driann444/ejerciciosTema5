package ejerciciostema5;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

	private int id;
	private List<Producto> productos = new ArrayList<Producto>();
	private final static String[] nombresProductos = {"Camisetas", "Camisas", "Gorros", "Bufandas", "Pantalones", "Zapatillas", "Guantes", "Cinturones", "Chaquetones", "Calcetines"};
	private final static float[] preciosProductos = {20, 25, 10, 10, 30,75, 8, 12, 100, 5};

	
	public Tienda(int id) {
		this.id = id;
		
		for(int i = 0; i < nombresProductos.length;i++) {
			int aleat = (int) ((Math.random() * 75) + 25);
			productos.add(new Producto(nombresProductos[i], preciosProductos[i], aleat));
		
		}
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public List<Producto> getProductos() {
		return productos;
	}


	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public float ganaciasTienda() {
		
		int sumatorioGanancias = 0;
		for (int i = 0; i < productos.size(); i++) {
			sumatorioGanancias += (productos.get(i).getPrecio() * productos.get(i).getVentas());
		}
		return sumatorioGanancias;
	}



	@Override
	public String toString() {
		return "\t\nTienda [id=" + id + ", ganancias ( " + ganaciasTienda()+ " €) :, productos=" + productos + "]";
	}
	
	
	
	
}
