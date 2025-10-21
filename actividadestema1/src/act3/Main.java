package act3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer dígito: ");
		double numero1 = sc.nextDouble();
		
		System.out.println("Introduce el segundo dígito: ");
		double numero2 = sc.nextDouble();
		
		Calculadora c1 = new Calculadora(numero1, numero2);
		c1.mostrarOperaciones();
		
		sc.close();
	}

}