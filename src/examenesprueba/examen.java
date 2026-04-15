package examenesprueba;

import java.util.Scanner;

public class examen {

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		Instituto instituto1 = new Instituto("Alonso de madrigal");
		do {
			
			System.out.println("0) Salir");
			System.out.println("1) Añadir Grupo ");
			System.out.println("2) Añadir Alumno");
			System.out.println("3) Añadir Nota");
			System.out.println("4) Imprimir informacion");
			System.out.println("5) Mostrar ciudades origenes");
			System.out.println("6) Mostrar nota media de cada alumno ");
			System.out.println("Elige una opcion");
			opcion = teclado.nextInt();
			teclado.nextLine();
			
			switch (opcion) {
			case 0:
				System.out.println("Hasta la proxima");
				break;
			case 1:
				System.out.println("Que nombre de grupo quieres");
				String nombreGrupo = teclado.nextLine();
				instituto1.anadirGrupo(nombreGrupo);
				break;
			case 2:
				System.out.println("Dime en que grupo quieres anadir el alumno");
				nombreGrupo = teclado.nextLine();
				Grupo grupoAnadir = instituto1.buscarGrupo(nombreGrupo);
				System.out.println("Dime un nie");
				String nie = teclado.nextLine();
				
				if (grupoAnadir.getAlumnos().size() >= 5) {
					System.out.println("No se puede añadir el alumno");
				}else {
					if (instituto1.buscarGrupo(nombreGrupo) != null) {
						if (grupoAnadir.buscarAlumno(nie) != null) {
							System.out.println("EL alumno con ese DNI ya esta registrado");
						}else {
							System.out.println("Dime su lugar de nacimiento");
							String lugarNacimiento = teclado.nextLine();
							grupoAnadir.anadirAlumno(nie, lugarNacimiento);
						}
					}else {
						System.out.println("El grupo no existe");
					}
				}
				break;
			case 3:
				System.out.println("Introduce el nie del alumno");
				nie = teclado.nextLine();
				Alumno alumno = instituto1.buscarAlumno(nie); 
				if(alumno != null) {
					System.out.println("Dime el nombre de la asignatura");
					String nombreAsig = teclado.nextLine();
					System.out.println("Dime la nota de la asignatura");
					float nota = teclado.nextFloat();
					if(alumno.getNotas().containsKey(nombreAsig)) {
						System.out.println("Ya le has asignado una nota a esa asignatura");
					}else {
						alumno.anadirNota(nombreAsig, nota);
					}
					
				}
				break;
			case 4:
				System.out.println(instituto1);
				break;
			case 5:
				instituto1.ciudadesAlumno();
				break;
			case 6:
				
				break;
			default:
				break;
			}
			
			
		}while(opcion != 0);
	}
}
