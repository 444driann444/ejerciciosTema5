package examenesprueba;

import java.util.HashMap;
import java.util.Map;

public class Alumno {
	private String nif;
	private String Ciudad;
	private Map<String, Float> notas = new HashMap<String, Float>();
	
	public Alumno(String nif, String ciudad) {
		super();
		this.nif = nif;
		Ciudad = ciudad;
	}
	
	 
	public void anadirNota (String nombreAsig, float nota) {
		if(!notas.containsKey(nombreAsig)) {
			notas.put(nombreAsig, nota);
		}
		
	} 
	
	public float notaMediaAlumno () {
		float notaMedia = 0;
		
		return notaMedia;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public Map<String, Float> getNotas() {
		return notas;
	}

	public void setNotas(Map<String, Float> notas) {
		notas = notas;
	}

	@Override
	public String toString() {
		return "\n\t\tAlumno nif=" + nif + "\tCiudad=" + Ciudad + "\tNotas=" + notas ;
	}
	
	
	
}
