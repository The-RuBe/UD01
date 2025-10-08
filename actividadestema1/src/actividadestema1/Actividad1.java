package actividadestema1;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		
		// Crea una clase denominada Rectangulo con los atributos base y altura. Escribe un programa que solicite al usuario la base y la altura de un rectángulo, cree un objeto de la clase y calcule, mediante métodos, su perímetro y su área. Muestra ambos resultados por pantalla.

Scanner sc = new Scanner(System.in);

System.out.println("Indica la base del rectángulo");
double base = sc.nextDouble();

System.out.println("Indica la altura del rectángulo");
double altura = sc.nextDouble();

Rectangulo r1 = new Rectangulo(base,altura);
r1.calculaPerimetroArea();
	}

}
