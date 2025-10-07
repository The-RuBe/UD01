package actividades;

public class CuentaCorriente {
		
		String dni;
		String nombreTitular;
		double saldo;
		
		CuentaCorriente(String dni, String nombreTitular) {
			this.dni = dni;
			this.nombreTitular = nombreTitular;
			this.saldo = 0.0;
		}
		
		void ingresarDinero(double cantidad) {
			this.saldo += cantidad;
	}
		
		void retirarDinero(double cantidad) {
			this.saldo -= cantidad;
		}
		
		void mostrarInfo() {
			System.out.println("DNI: " + this.dni);
			System.out.println("Titular: " + this.nombreTitular);
			System.out.printf("Saldo: %.2f € \n", this.saldo);
		}
}
