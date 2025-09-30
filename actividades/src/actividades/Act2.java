package actividades;

import java.util.Scanner;

public class Act2 {
	
	public static void main(String[] args) {
	
		Scanner nota = new Scanner(System.in);
			
	System.out.println("¿Cuál es la primera nota?");
			
	int numero1= nota.nextInt();
	
	System.out.println("¿Cuál es la segunda nota?");
			
	int numero2= nota.nextInt();
	
	Double media=(numero1+numero2)/2.0;
	
	System.out.printf("La media aritmética de las notas introducidas es %.3f", media);

	}
}