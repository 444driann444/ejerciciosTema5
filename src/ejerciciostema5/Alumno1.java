package ejerciciostema5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Alumno1 {
	private String nombreAlumno;
	private Map<String, Float> modulos = new HashMap<String, Float>();
	private final static String[] nombresModulos = {"Programacion","Bases de Datos","FOL","LMS","Optativa","SIF","EDD","Ingles"};
	
	public Alumno1(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
		
		for(int i = 0; i < nombresModulos.length; i++) {
			float nota = (float) (Math.random()*10);
			modulos.put(nombresModulos[i],nota);

		}
		
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public Map<String, Float> getModulos() {
		return modulos;
	}

	public void setModulos(Map<String, Float> modulos) {
		this.modulos = modulos;
	}

	@Override
	public String toString() {
		return "\n\t" +nombreAlumno + ":" + modulos + "]";
	}
}
