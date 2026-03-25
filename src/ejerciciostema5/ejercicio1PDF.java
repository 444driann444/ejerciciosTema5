package ejerciciostema5;

public class ejercicio1PDF {

	public static void main(String[] args) {
		
	
		System.out.println(suma(6, 7));
		System.out.println(resta(6, 7));
		System.out.println(multiplicacion(6, 7));
		System.out.println(division(12, 6));
	}
	
	public static <T> T suma (T a, T b) {
		T suma = null;
		if (a instanceof Integer) {
			Integer sumaEnteros = (Integer) a + (Integer) b;
			suma = (T) sumaEnteros;
		}else if (a instanceof Float ) {
			Float sumaFloats  = (Float) a + (Float) b;
			suma = (T) sumaFloats;
		}else if (a instanceof Character ) {
			Character sumaCarcateres  =  (char) ((Character) a + (Character) b);
			suma = (T) sumaCarcateres;
	}
		return suma;
	}
	public static <T> T resta (T a, T b) {
		T resta = null;
		if (a instanceof Integer) {
			Integer restaEnteros = (Integer) a - (Integer) b;
			resta = (T) restaEnteros;
		}else if (a instanceof Float ) {
			Float restaFloats  = (Float) a - (Float) b;
			resta = (T) restaFloats;
		}else if (a instanceof Character ) {
			Character restaFloats  =  (char) ((Character) a - (Character) b);
			resta = (T) restaFloats;
	}
		return resta;
	}
	public static <T> T multiplicacion (T a, T b) {
		T multiplicacion = null;
		if (a instanceof Integer) {
			Integer multiEnteros = (Integer) a * (Integer) b;
			multiplicacion = (T) multiEnteros;
		}else if (a instanceof Float ) {
			Float multiFloats  = (Float) a * (Float) b;
			multiplicacion = (T) multiFloats;
		}else if (a instanceof Character ) {
			Character multiCaracteres  =  (char) ((Character) a * (Character) b);
			multiplicacion = (T) multiCaracteres;
	}
		return multiplicacion;
	}
	public static <T> T division (T a, T b) {
		T division = null;
		if (a instanceof Integer) {
			Integer diviEnteros = (Integer) a / (Integer) b;
			division = (T) diviEnteros;
		}else if (a instanceof Float ) {
			Float diviFloats  = (Float) a / (Float) b;
			division = (T) diviFloats;
		}else if (a instanceof Character ) {
			Character diviCaracteres  =  (char) ((Character) a / (Character) b);
			division = (T) diviCaracteres;
	}
		return division;
	}
	

}
