package act7;

import java.util.Scanner;

public class MainNotaAlgoritmos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la nota del primer parcial: ");
			double p1 = sc.nextDouble();
			
			System.out.println("Introduce la nota del segundo parcial: ");
			double p2 = sc.nextDouble();
			
			System.out.println("Introduce la nota del tercer parcial: ");
			double p3 = sc.nextDouble();
			
			System.out.println("Introduce la nota del examen final: ");
			double ef = sc.nextDouble();
			
			System.out.println("Introduce la nota del trabajo final: ");
			double tf = sc.nextDouble();
			
			NotaAlgoritmos na1 = new NotaAlgoritmos(p1, p2, p3, ef, tf);
			
			na1.calcularNotaFinal();
	}

}