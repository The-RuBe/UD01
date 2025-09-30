package actividades;

import java.util.Scanner;

public class Act1 {

	public static void main(String[] args) {
		
Scanner numero = new Scanner(System.in);

System.out.println("¿Cuál es tu edad?");

int edad = numero.nextInt();

System.out.printf("El año que vienes tendrás " + ++edad + " años");

	}

}