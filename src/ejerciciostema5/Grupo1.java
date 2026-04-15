package ejerciciostema5;

import java.util.ArrayList;
import java.util.List;

public class Grupo1 {

	private String nombreGrupo;
	private List<Alumno> alumnos;
	// private String[] nombres = {"Luis"...};

	public Grupo1(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
		alumnos = new ArrayList<Alumno>();

		int aleatorio = (int) ((Math.random() * 5) + 15);
		
		for(int i = 0; i < aleatorio; i++) {
			alumnos.add(new Alumno(nombreGrupo + " " + i));
			//alumnos.add(new Alumno(nombres[i]));

		}
	}

	public String getNombreGrupo() {
		return nombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	@Override
	public String toString() {
		return "Grupo " + nombreGrupo + "\n" + alumnos;
	}
}
