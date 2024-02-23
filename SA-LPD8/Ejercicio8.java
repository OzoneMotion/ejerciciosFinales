package ejerciciosFinales;

import java.util.Scanner;

public class Ejercicio8 {
	
	 public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        int[] sortedNumbers = new int[10];
	        int[] enteredNumbers = new int[10];
	        int indexForPrimes = 0, indexForNonPrimes = sortedNumbers.length - 1;

	        for (int k = 0; k < enteredNumbers.length; k++) {
	            System.out.print("Ingresa el número " + (k + 1) + ": ");
	            int input = Integer.valueOf(sc.nextLine());
	            enteredNumbers[k] = input;
	            if (isPrime(input)) {
	                sortedNumbers[indexForPrimes] = input;
	                indexForPrimes++;
	            } else {
	                sortedNumbers[indexForNonPrimes] = input;
	                indexForNonPrimes--;
	            }
	        }

	        printArray(enteredNumbers);
	        System.out.println();
	        printArray(sortedNumbers);

	        sc.close();
	    }

	    public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void printArray(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.println("pos[" + i + "] = " + array[i]);
	        }
	    }

}
