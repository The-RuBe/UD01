package examen;
import java.util.Scanner;

public class MainMonedero {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Introduce los billetes de 5 euros: ");

		int cincoEuros = sc.nextInt();
	
	System.out.println("Introduce las monedas de 2 euros: ");
	
		int dosEuros = sc.nextInt();
	
	System.out.println("Introduce las monedas de 1 euro: ");
	
		int unEuro = sc.nextInt();
	
	System.out.println("Introduce las monedas de 50 céntimos: ");
	
		int cent50 = sc.nextInt();
	
	System.out.println("Introduce las monedas de 20 céntimos: ");
	
		int cent20 = sc.nextInt();
	
	Monedero m = new Monedero(cincoEuros, dosEuros, unEuro, cent50, cent20);
	
		m.calcularTotalEuros();
	
	sc.close();

	}

}