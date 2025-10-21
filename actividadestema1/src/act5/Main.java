package act5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce las respuestas correctas: ");
		int correctas = sc.nextInt();
		
		System.out.println("Introduce las respuestas incorrectas: ");
		int incorrectas = sc.nextInt();
		
		System.out.println("Introduce las respuestas en blanco: ");
		int blancas = sc.nextInt();
		
		EvaluacionTest et = new EvaluacionTest(correctas, incorrectas, blancas);
		et.calcularNotaFinal();
	}

}