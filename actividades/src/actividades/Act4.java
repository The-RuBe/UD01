package actividades;

import java.util.Scanner;

public class Act4 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Itroduce un numero");
		
		int num=sc.nextInt();
		
		int resto=num%2;
		
		boolean mayor=(resto==0);
		
		System.out.printf("%b",mayor);
	
	}
}