package ejerciciostema5;

public class operacioneje2PDF <T>{

	private T elemento1;
	private T elemento2;
	

	public operacioneje2PDF(T elemento1, T elemento2) {
		super();
		this.elemento1 = elemento1;
		this.elemento2 = elemento2;
	}
	
	
	
	public T getElemento1() {
		return elemento1;
	}



	public void setElemento1(T elemento1) {
		this.elemento1 = elemento1;
	}



	public T getElemento2() {
		return elemento2;
	}



	public void setElemento2(T elemento2) {
		this.elemento2 = elemento2;
	}

	

	@Override
	public String toString() {
		return "operacioneje2PDF [elemento1=" + elemento1 + ", elemento2=" + elemento2 + "]";
	}



	public  <T> T suma () {
		T suma = null;
		if (elemento1 instanceof Integer) {
			Integer sumaEnteros = (Integer) elemento1 + (Integer) elemento2;
			suma = (T) sumaEnteros;
		}else if (elemento1 instanceof Float ) {
			Float sumaFloats  = (Float) elemento1 + (Float) elemento2;
			suma = (T) sumaFloats;
		}else if (elemento1 instanceof Character ) {
			Character sumaCarcateres  =  (char) ((Character) elemento1 + (Character) elemento2);
			suma = (T) sumaCarcateres;
	}
		return suma;
	}
	public <T> T resta () {
		T resta = null;
		if (elemento1 instanceof Integer) {
			Integer restaEnteros = (Integer) elemento1 - (Integer) elemento2;
			resta = (T) restaEnteros;
		}else if (elemento1 instanceof Float ) {
			Float restaFloats  = (Float) elemento1 - (Float) elemento2;
			resta = (T) restaFloats;
		}else if (elemento1 instanceof Character ) {
			Character restaFloats  =  (char) ((Character) elemento1 - (Character) elemento2);
			resta = (T) restaFloats;
	}
		return resta;
	}
	public  <T> T multiplicacion () {
		T multiplicacion = null;
		if (elemento1 instanceof Integer) {
			Integer multiEnteros = (Integer) elemento1 * (Integer) elemento2;
			multiplicacion = (T) multiEnteros;
		}else if (elemento1 instanceof Float ) {
			Float multiFloats  = (Float) elemento1 * (Float) elemento2;
			multiplicacion = (T) multiFloats;
		}else if (elemento1 instanceof Character ) {
			Character multiCaracteres  =  (char) ((Character) elemento1 * (Character) elemento2);
			multiplicacion = (T) multiCaracteres;
	}
		return multiplicacion;
	}
	public <T> T division () {
		T division = null;
		if (elemento1 instanceof Integer) {
			Integer diviEnteros = (Integer) elemento1 / (Integer) elemento2;
			division = (T) diviEnteros;
		}else if (elemento1 instanceof Float ) {
			Float diviFloats  = (Float) elemento1 / (Float) elemento2;
			division = (T) diviFloats;
		}else if (elemento1 instanceof Character ) {
			Character diviCaracteres  =  (char) ((Character) elemento1 / (Character) elemento2);
			division = (T) diviCaracteres;
	}
		return division;
	}
	
}
