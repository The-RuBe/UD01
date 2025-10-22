package act6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el precio total de tu compra: ");
		double total = sc.nextDouble();
		
		Compra c = new Compra(total);
		c.mostrarTotalConDescuento();
	}

}