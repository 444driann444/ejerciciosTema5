package ejerciciostema5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


//alegria jirafa humo hipoteca vinculo ambicion tocino ensayo lente plato pizarra turismo montana reloj jarra pierna caoba lince balcon musica plato alivio cieno bulto querer ano chispa vino cable piloto zafiro jaula queso sombra arana hielo hacha encia gafas colina radio fallo jarabe pez menta almena abeto llanto huevo barco pluma faro gorra hoja azote espejo silla yate huella nieve amparo circulo vuelo jamon rey duque chico plato cuadro pato lanza yerno mango zanja piel viento barra cueva hombro nube anillo limite reina viaje cesto valle uva bravo puno plano bosque rata suerte esquina nariz jazmin purpura llama foco nexo doble ruta oro horno carcel toque limon balon silueta pupila exceso silla sena timo encaje plato gancho balsa ola trece lodo rama grasa vaina marco narro foto chino calle arbol giro caja bomba mesa cuna capa pina numero grito leon cielo rana bache zorro zona olmo angel plato junta falda musica ola alga broma papa parra buho prisa bravo nino buho zumba cuadra hacha seda plomo pasion brote cruz mazo jardin juez purpura luna quiso jarra duna eco gente magia sueno dedo llama grano rueda jirafa cuadra panza vaso mecha silla lomo mascara gente bache raza barca medico uva cruz peso jirafa calvo duque broma red lazo plato sombra plato calvo beso traqueotomia radio halcon llanto foro pajaro caer dia queso oro escoba chico plato rata fama jarra duna alegria jirafa humo hipoteca vinculo ambicion tocino ensayo lente plato pizarra turismo montana reloj jarra pierna caoba lince balcon musica plato alivio cieno bulto querer ano chispa vino cable piloto zafiro jaula queso sombra arana hielo hacha encia gafas colina radio fallo jarabe pez menta almena abeto llanto huevo barco pluma faro gorra hoja azote espejo silla yate huella nieve amparo circulo vuelo jamon rey duque chico plato cuadro pato lanza yerno mango zanja piel viento barra cueva hombro nube anillo limite reina viaje cesto valle uva bravo puno plano bosque rata suerte esquina nariz jazmin purpura llama foco nexo doble ruta oro horno carcel toque limon balon silueta pupila exceso silla sena timo encaje plato gancho balsa ola trece lodo rama grasa vaina marco narro foto chino calle arbol giro caja bomba mesa cuna capa pina numero grito leon cielo rana bache zorro zona olmo angel plato junta falda musica ola alga broma papa parra buho prisa bravo nino buho zumba cuadra hacha seda plomo pasion brote cruz mazo jardin juez purpura luna quiso jarra duna eco gente magia sueno dedo llama grano rueda jirafa cuadra panza vaso mecha silla lomo mascara gente bache raza barca medico uva cruz peso jirafa calvo duque broma red lazo plato sombra plato calvo beso traqueotomia radio halcon llanto foro pajaro caer dia queso oro escoba chico plato rata fama jarra duna
public class ejercicio21PDF {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el texto");
		String texto = teclado.nextLine();
		texto = texto.replace(" ", "");
		char letrastexto [] = texto.toCharArray();
		
		
		Map<Character, Integer> mapa = new HashMap<Character, Integer>();
		
		for (char letra : letrastexto) {
			
			if (mapa.containsKey(letra)) {
				int contador = mapa.get(letra) + 1;
				mapa.put(letra, contador);
			}else {
				mapa.put(letra, 1);
			
		}
		
	}
		System.out.println(mapa);

}
}
