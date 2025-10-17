package actividadestema1;

public class Intercambio {
	//Atributos
	private int a;
	private int b;
	
	//Constructor
	public Intercambio(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	//Método que intercambia valores
	public void intercambiar() {
		int c = a;
		a = b;
		b = c;
		
		System.out.println("Después del intercambio:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}