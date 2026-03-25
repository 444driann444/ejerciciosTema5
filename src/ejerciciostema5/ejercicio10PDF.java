package ejerciciostema5;

import java.util.ArrayList;
import java.util.List;

public class ejercicio10PDF {

	public static void main(String[] args) {
		
		List<String>equipos = new ArrayList<String>();
		String equipo = "Real Madrid";
		String [] equipos1 = {"FC Barcelona","Aletico Madrid","Villareal FC","Real Betis Balompie","RC Celta de Vigo","Real Sociedad","Getafe FC","Athletico Bilbao","CA Osasuna","Girona FC","Rayo Vallecano","Valencia FC", "Sevilla","RCD Mallorca","Deportivo Alaves","Elche Fc","Levante UD", "Real Oviedo"};
		
		for(int i = 0;i< equipos1.length;i++) {
			equipos.add(equipos1[i]);
		}
		/* Nota : El 1 de Local es que ha ganado, si gana suma 3
		 Nota : El 2 de Visitante esque ha ganado, si gana suma 3
		 Nota : El 0 es que ha empatado*/
		System.out.println("Primera vuelta");
		int sumatorioPuntos = 0;

		for (int i = 0; i < equipos.size();i++) {
			
			int aleatorio = (int) (Math.random()*3);
		
			if(i % 2 == 0) {
				System.out.println(equipo + " - " + equipos.get(i) + " : " + aleatorio );
				if(aleatorio == 1) {
					sumatorioPuntos += 3;
				}else if(aleatorio == 0) {
					sumatorioPuntos++;
				}
			}else {
				System.out.println( equipos.get(i) + " - " + equipo  + " : " + aleatorio );
				if(aleatorio == 2) {
					sumatorioPuntos += 3;
				}else if(aleatorio == 0) {
					sumatorioPuntos++;
				}
			}
			
		}
		System.out.println("Tiene " + sumatorioPuntos );
		
		System.out.println();
		System.out.println("Segunda vuelta");
		for (int i = 0; i < equipos.size();i++) {
			
			int aleatorio = (int) (Math.random()*3);
		
			if(i % 2 == 0) {
				System.out.println(equipo + " - " + equipos.get(i) + " : " + aleatorio );
				if(aleatorio == 1) {
					sumatorioPuntos += 3;
				}else if(aleatorio == 0) {
					sumatorioPuntos++;
				}
			}else {
				System.out.println( equipos.get(i) + " - " + equipo  + " : " + aleatorio );
				if(aleatorio == 2) {
					sumatorioPuntos += 3;
				}else if(aleatorio == 0) {
					sumatorioPuntos++;
				}
			}			
		}
		System.out.println();
		System.out.println("Alfinal obtiene Tiene: " + sumatorioPuntos + " puntos" );
	}

}
