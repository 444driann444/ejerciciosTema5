package ejerciciostema5;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
	private String nombreAlumno;
	private List<Modulo> modulos = new ArrayList<Modulo>();
	private final static String[] nombresModulos = {"Programacion","Bases de Datos","FOL","LMS","Optativa","SIF","EDD","Ingles"};
	
	public Alumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
		
		for(int i = 0; i < nombresModulos.length; i++) {
			float nota = (float) (Math.random()*10);
			modulos.add(new Modulo(nombresModulos[i], nota));

		}
		
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public List<Modulo> getModulos() {
		return modulos;
	}

	public void setModulos(List<Modulo> modulos) {
		this.modulos = modulos;
	}

	@Override
	public String toString() {
		return "\n\t" +nombreAlumno + ":" + modulos + "]";
	}
}
