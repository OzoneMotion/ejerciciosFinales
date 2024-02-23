package ejerciciosFinales;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		HashMap<String, String> diccionario = crearDiccionario();
	    HashMap<String, String> miniDiccionario = crearMiniDiccionario(diccionario);

	    Scanner sc = new Scanner(System.in);
	    int aciertos = 0;
        int incorrectas = 0;

        System.out.println("A continuación se muestran las palabras seleccionadas, escribe su traducción al inglés");
        System.out.println("Recuerda iniciar la palabra con mayúscula y escribir una por una, de acuerdo al orden dispuesto.");
        for (String palabraEsp : miniDiccionario.keySet()) {
            System.out.println(palabraEsp);
        }

        for (int i = 0; i < miniDiccionario.size(); i++) {
            System.out.print("Traducción en inglés de la palabra: ");
            String input = sc.nextLine();

            if (miniDiccionario.containsValue(input)) {
                aciertos++;
	            } else {
                incorrectas++;
	            }
        	}

        System.out.println("Tuviste " + aciertos + " aciertos.");
        System.out.println("Tuviste " + incorrectas + " incorrectos.");

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

    public static HashMap<String, String> crearMiniDiccionario (HashMap<String, String> diccionario) {
        HashMap<String, String> diccionarioAleatorio = new HashMap<>();
        List<String> llaves = new ArrayList<>(diccionario.keySet());
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int aleatorio = random.nextInt(llaves.size());
            String palabraEsp = llaves.remove(aleatorio);
            String palabraIng = diccionario.remove(palabraEsp);
            diccionarioAleatorio.put(palabraEsp, palabraIng);
        }

        return diccionarioAleatorio;
    }

	    
			 
}

