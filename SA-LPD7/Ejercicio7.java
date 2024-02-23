package ejerciciosFinales;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {

	    public static void main(String[] args) {
	        System.out.println("Bienvenidx, ¿quieres saber cuántos minutos faltan para el grandioso fin de semana?\nIngresa los datos.");
	        int hora;
	        int minutos;
	        int minutosParaFinde;
	        Scanner sc = new Scanner(System.in);

	        do {
	            System.out.print("Escribe el día de la semana: ");
	            String diaSemana = sc.nextLine().toLowerCase();
	            System.out.print("Hora (0 a 24): ");
	            hora = Integer.valueOf(sc.nextLine());
	            System.out.print("Minutos (0-59): ");
	            minutos = Integer.valueOf(sc.nextLine());

	            minutosParaFinde = calcularMinutosParaFinde(diaSemana, hora, minutos);

	            if (hora > 24 || minutos > 59 || minutosParaFinde == -1) {
	                System.out.println("Datos no válidos. Vuelve a intentarlo.");
	            } else if (minutosParaFinde != -1) {
	                System.out.println("Datos introducidos:\n" + diaSemana + " " + hora + ":" + minutos);
	                System.out.println("Por lo tanto, faltan " + minutosParaFinde + " minutos para el fin de semana");
	            }

	        } while (hora > 24 || minutos > 59 || minutosParaFinde == -1);
	        sc.close();
	    }

	    public static int calcularMinutosParaFinde(String diaSemana, int hora, int minutos) {
	        int minutosRestantes = 0;
	        int diasAMinutos = 0;
	        ArrayList<String> semana = new ArrayList<>();
	        semana.add("viernes");
	        semana.add("jueves");
	        semana.add("miércoles");
	        semana.add("martes");
	        semana.add("lunes");

	        if (semana.contains(diaSemana)) {
	            int index = semana.indexOf(diaSemana);
	            diasAMinutos = index * 24 * 60;
	        } else {
	            return -1;
	        }

	        minutosRestantes = diasAMinutos + ((15 - hora) * 60 - minutos);

	        return minutosRestantes;
	    }
	}

