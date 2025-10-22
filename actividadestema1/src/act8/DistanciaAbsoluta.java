package act8;

public class DistanciaAbsoluta {
	
	//Atributos
	private double num1;
	private double num2;
	
	//Constructor
	public DistanciaAbsoluta(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//Método para calcular y mostrar la distancia absoluta entre dos números
	public void setNum1() {
		System.out.println(this.num1);
	}
	
	public void getNum1() {
		this.num1 = num1;
	}
	
	public void setNum2() {
		System.out.println(this.num2);
	}
	
	public void getNum2() {
		this.num2 = num2;
	}
	
	public void mostrarDistancia() {
		//Falta la operación
		double num3 = this.num1 - this.num2;
		System.out.printf("Esta es la distancia entre los dos número: %.2f", num3);
	}
}