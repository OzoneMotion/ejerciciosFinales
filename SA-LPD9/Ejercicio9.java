package ejerciciosFinales;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio9 {
	
	public static void main(String[] args) {
        HashMap<String, String> diccionario = crearDiccionario();
        Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese una palabra en español: ");
		String eng = sc.nextLine();
		String traduccion = diccionario.get(eng);

		
		if (traduccion != null) {
		    System.out.println("Traducción: " + traduccion);
		} else {
		    System.out.println("Lo siento, la palabra no está en el diccionario.");
		}

        sc.close();
    }

    public static HashMap<String, String> crearDiccionario() {
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("Hola", "Hello");
        diccionario.put("Amor", "Love");
        diccionario.put("Manzana", "Apple");
        diccionario.put("Silla", "Chair");
        diccionario.put("Llave", "Key");
        diccionario.put("Montaña", "Mountain");
        diccionario.put("Estrella", "Star");
        diccionario.put("Cielo", "Sky");
        diccionario.put("Piedra", "Stone");
        diccionario.put("Río", "River");
        diccionario.put("Reloj", "Clock");
        diccionario.put("Flor", "Flower");
        diccionario.put("Vaso", "Glass");
        diccionario.put("Cuchillo", "Knife");
        diccionario.put("Pelota", "Ball");
        diccionario.put("Sombrero", "Hat");
        diccionario.put("Camino", "Path");
        diccionario.put("Ojo", "Eye");
        diccionario.put("Diente", "Tooth");
        diccionario.put("Pluma", "Feather");
        diccionario.put("Cuerda", "Rope");
        diccionario.put("Musica", "Music");
        
        return diccionario;
    }

}
