package actividades;

import java.util.Scanner;

public class Act3 {
	
	public static void main(String[] args) {
	
		Scanner edad = new Scanner(System.in);
		
		System.out.println("Indica tu edad");
		
		int num=edad.nextInt();
		
		boolean mayor=(num>=18);
		
		System.out.printf("%b",mayor);
	
	}
}