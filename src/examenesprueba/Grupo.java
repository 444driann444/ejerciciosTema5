package examenesprueba;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

	private String nombre;
	private List<Alumno> alumnos;
	
	public Grupo(String nombre) {
		super();
		this.nombre = nombre;
		alumnos = new ArrayList<Alumno>();
		

	}
	public void anadirAlumno (String nif, String ciudadNacimiento) {
		
		if (buscarAlumno(nif) != null) {
			System.out.println("No se puede añadir el alumno porque ya existe uno registrado con el");
			return;
		}
		Alumno alumno = new Alumno(nif, ciudadNacimiento);
		alumnos.add(alumno);
	}
	public Alumno buscarAlumno(String nie){
		for (Alumno alumno : alumnos) {
			if (alumno.getNif().equals(nie)) {
				System.out.println("El alumno con ese DNI ya existe");
				return alumno;
			}
		}
		return null;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	@Override
	public String toString() {
		return "\n\tGrupo [nombre=" + nombre + " : " + "  alumnos=" + alumnos ;
	}
	
	
}
