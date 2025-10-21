package act3;

public class Calculadora {
	
	//Atributos
	private double numero1;
	private double numero2;
	
	//Constructor
	public Calculadora(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	//Método para sumar, restar, multiplicar y dividir los dos números mostrando los resultados por pantalla
	public void getNumero1() {
		System.out.println(numero1);
	}
	
	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}
	
	public void getNumero2() {
		System.out.println(numero2);
	}
	
	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}	
	
	public void mostrarOperaciones() {
		double suma = this.numero1 + this.numero2;
		double resta = this.numero1 - this.numero2;
		double multiplicacion = this.numero1 * this.numero2;
		double division = this.numero1 / this.numero2;
		
		System.out.printf("La suma de los dos dígitos es: %.2f \n", suma);
		System.out.printf("La resta del primer dígito menos el segundo: %.2f \n", resta);
		System.out.printf("La multiplicación de los dos dígitos es: %.2f \n", multiplicacion);
		System.out.printf("La división del primer digito entre el segundo es: %.2f", division);
	}
}