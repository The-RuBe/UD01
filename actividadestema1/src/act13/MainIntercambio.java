package act13;

import java.util.Scanner;

public class MainIntercambio {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce a: ");
		int a = sc.nextInt();
		
		System.out.println("Introduce b: ");
		int b = sc.nextInt();

		Intercambio i1 = new Intercambio(a, b);
		
		i1.intercambiar();
		
	}

}