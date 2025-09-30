package96 actividades;

import java.util.Scanner;

public class Act5 {
	
	public static void main(String[] args) {
	
Scanner edad = new Scanner(System.in);
		
		System.out.println("Indica tu edad");
		
		int num=edad.nextInt();
		
		boolean edadLaboral=(num>=16 && num<67);
		
		System.out.printf("%b",edadLaboral);
	
	}
}