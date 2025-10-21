package act4;

public class Temperatura {
	
	//Atributos
	private double fahrenheit;
	
	//Constructor
	public Temperatura(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	
	//Método para convertir los grados Fahrenheit a Celsius y mostrar el resultado
	
	public void getFahrenheit() {
		System.out.println(this.fahrenheit);
	}
	
	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	
	public void mostrarCelsius() {
		double celsius = (this.fahrenheit - 32) / 1.8;

	System.out.printf("La temperatura en grados Celsius es: %.0f ºC", celsius);
	
	}
}