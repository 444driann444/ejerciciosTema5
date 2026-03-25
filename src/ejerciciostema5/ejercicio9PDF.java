package ejerciciostema5;

import java.util.ArrayList;
import java.util.List;

public class ejercicio9PDF {

	public static void main(String[] args) {
		
		 List<Tienda> tiendas = new ArrayList<Tienda>();
		 
		 for (int i = 1; i <= 20; i++) {
			 tiendas.add(new Tienda(i));
		 }
		 ordenardemenoramayor(tiendas);
		 System.out.println(tiendas);
		 System.out.println();
		 System.out.println("Tiendas eliminadas, las tiendas que se quedan son las que mas ganan: ");
		 eliminartiendas(tiendas);
		 System.out.println(tiendas);
		 
		
	}
	
	public static void ordenardemenoramayor(List<Tienda> tiendas) {
		for(int i = 0; i < tiendas.size(); i++ ) {
			int menosGanancias = i;
			for(int j = i; j < tiendas.size();j++) {
				if(tiendas.get(j).ganaciasTienda() < tiendas.get(menosGanancias).ganaciasTienda()) {
					menosGanancias = j;
				}
			}
			Tienda aux = tiendas.get(i);
			tiendas.set(i, tiendas.get(menosGanancias));
			tiendas.set(menosGanancias, aux);
		}
	}
	public static void eliminartiendas(List<Tienda> tiendas) {
		for (int i = 0; i < 10; i++) {
			tiendas.remove(0);
		}
	}
}
