package ejerciciostema5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//alegria jirafa humo hipoteca vinculo ambicion tocino ensayo lente plato pizarra turismo montana reloj jarra pierna caoba lince balcon musica plato alivio cieno bulto querer ano chispa vino cable piloto zafiro jaula queso sombra arana hielo hacha encia gafas colina radio fallo jarabe pez menta almena abeto llanto huevo barco pluma faro gorra hoja azote espejo silla yate huella nieve amparo circulo vuelo jamon rey duque chico plato cuadro pato lanza yerno mango zanja piel viento barra cueva hombro nube anillo limite reina viaje cesto valle uva bravo puno plano bosque rata suerte esquina nariz jazmin purpura llama foco nexo doble ruta oro horno carcel toque limon balon silueta pupila exceso silla sena timo encaje plato gancho balsa ola trece lodo rama grasa vaina marco narro foto chino calle arbol giro caja bomba mesa cuna capa pina numero grito leon cielo rana bache zorro zona olmo angel plato junta falda musica ola alga broma papa parra buho prisa bravo nino buho zumba cuadra hacha seda plomo pasion brote cruz mazo jardin juez purpura luna quiso jarra duna eco gente magia sueno dedo llama grano rueda jirafa cuadra panza vaso mecha silla lomo mascara gente bache raza barca medico uva cruz peso jirafa calvo duque broma red lazo plato sombra plato calvo beso traqueotomia radio halcon llanto foro pajaro caer dia queso oro escoba chico plato rata fama jarra duna alegria jirafa humo hipoteca vinculo ambicion tocino ensayo lente plato pizarra turismo montana reloj jarra pierna caoba lince balcon musica plato alivio cieno bulto querer ano chispa vino cable piloto zafiro jaula queso sombra arana hielo hacha encia gafas colina radio fallo jarabe pez menta almena abeto llanto huevo barco pluma faro gorra hoja azote espejo silla yate huella nieve amparo circulo vuelo jamon rey duque chico plato cuadro pato lanza yerno mango zanja piel viento barra cueva hombro nube anillo limite reina viaje cesto valle uva bravo puno plano bosque rata suerte esquina nariz jazmin purpura llama foco nexo doble ruta oro horno carcel toque limon balon silueta pupila exceso silla sena timo encaje plato gancho balsa ola trece lodo rama grasa vaina marco narro foto chino calle arbol giro caja bomba mesa cuna capa pina numero grito leon cielo rana bache zorro zona olmo angel plato junta falda musica ola alga broma papa parra buho prisa bravo nino buho zumba cuadra hacha seda plomo pasion brote cruz mazo jardin juez purpura luna quiso jarra duna eco gente magia sueno dedo llama grano rueda jirafa cuadra panza vaso mecha silla lomo mascara gente bache raza barca medico uva cruz peso jirafa calvo duque broma red lazo plato sombra plato calvo beso traqueotomia radio halcon llanto foro pajaro caer dia queso oro escoba chico plato rata fama jarra duna
public class ejercicio20PDF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el texto");
		String texto = teclado.nextLine();
		String[] palabras = texto.split(" ");
		
		Map<String, Integer> mapa = new HashMap<String, Integer>();
		
		for(String palabra : palabras) {
			if(mapa.containsKey(palabra)) {
				int contador = mapa.get(palabra) + 1;
				mapa.put(palabra, contador);
			}else {
				mapa.put(palabra, 1);				
			}		
		}
		
		System.out.println(mapa);		
	}

}
