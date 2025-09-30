package actividades;

import java.util.Scanner;

public class Act6 {

	public static void main(String[] args) {
		
		Scanner ventasmanzanas = new Scanner(System.in);
		
		System.out.println("Introduce las ventas en kg de manzanas");
		
		int numerom=ventasmanzanas.nextInt();
		
		Scanner ventasperas = new Scanner(System.in);
		
		System.out.println("Introduce las ventas en kg de peras");
		
		int numerop=ventasperas.nextInt();
		
		System.out.println("Los beneficios anuales son ",2.35*numerom+1.95*numerop);
			
	}

}
