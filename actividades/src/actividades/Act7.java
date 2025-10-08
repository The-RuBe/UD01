package actividades;

import java.util.Scanner;

public class Act7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu DNI:");
		String dni = sc.next();
		
		System.out.println("Dime tu nombre:");
		String nombre = sc.next();
		
		CuentaCorriente cc1 = new CuentaCorriente(dni, nombre);
		cc1.mostrarInfo();
		
		System.out.println("¿Cuanto quieres ingresar? (Si no quieres ingresar, pon un 0)");
		double ingreso = sc.nextDouble();
		cc1.ingresarDinero(ingreso);
		cc1.mostrarInfo();
		
		System.out.println("¿Cuanto quieres retirar? (Si no quieres retirar, pon un 0)");
		double retiro = sc.nextDouble();
		cc1.retirarDinero(retiro);
		cc1.mostrarInfo();
	}

}
