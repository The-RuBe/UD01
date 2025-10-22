package act8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer dígito: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Introduce el primer dígito: ");
		double num2 = sc.nextDouble();
		
		DistanciaAbsoluta da = new DistanciaAbsoluta(num1, num2);
		da.mostrarDistancia();
		
		sc.close();
	}

}
