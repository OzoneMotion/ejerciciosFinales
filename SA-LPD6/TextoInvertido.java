package ejerciciosFinales;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un texto:");
        String input = sc.nextLine();
        String inputInvertido = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            inputInvertido += input.charAt(i);
        }

        System.out.println();
        System.out.println("Texto invertido");
        System.out.println(inputInvertido);

        sc.close();
    }
}