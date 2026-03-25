package ejerciciostema5;

public class Modulo {
	private String nombre;
	private float nota;
	
	public Modulo(String nombre, float nota) {
		this.nombre = nombre;
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return  "\n\t\t" +nombre + " : " + nota;
	}
}
