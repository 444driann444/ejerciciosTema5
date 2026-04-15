package examenesprueba;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Instituto {
	private String nombre;
	private List<Grupo> grupos;
	
	public Instituto(String nombre) {
		super();
		this.nombre = nombre;
		this.grupos = new ArrayList<Grupo>();
	}
	
	public void anadirGrupo(String nombreGrupo) {
		if(buscarGrupo(nombreGrupo) != null) {
			System.out.println("Error ya esta el grupo anadido");
			return;
		}else {
			Grupo grupo = new Grupo(nombreGrupo);
			grupos.add(grupo);
			System.out.println("Se ha añadido correctamente");
		}
		
	}
	
	public Grupo buscarGrupo(String nombre) {
		for (Grupo grupo : grupos) {
			if (grupo.getNombre().equals(nombre)) {
				return grupo;
			}
		}
		return null;
	}
	public Alumno buscarAlumno (String nif) {
		for (Grupo grupo1 : grupos) {
			Alumno alumnoBuscado = grupo1.buscarAlumno(nif);
			if(alumnoBuscado != null) {
				return alumnoBuscado;
			}
		}
		return null;
	}
	public Set<String> ciudadesAlumno (){
		Set<String> nombreCiudades = new HashSet<String>();
		for (Grupo grupo1 : grupos) {
			for(Alumno alumno :grupo1.getAlumnos()) {
				nombreCiudades.add(alumno.getCiudad());
			}
		}
		System.out.println(nombreCiudades);
		return nombreCiudades;
	}

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Grupo> getGrupos() {
		return grupos;
	}
	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
	@Override
	public String toString() {
		return "Instituto nombre=" + nombre + ", grupos=" + grupos;
	}
	
	
}
