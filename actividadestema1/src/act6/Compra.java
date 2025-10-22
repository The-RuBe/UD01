package act6;

public class Compra {

	//Atributos
	private double total;
	
	//Constructor
	public Compra(double total) {
		this.total = total;
	}
	
	//Método para calcular y mostrar el total tras aplicar el descuento del 15%
	public void setTotal() {
		System.out.println(this.total);
	}
	
	public void getTotal() {
		this.total = total;
	}
	
	public void mostrarTotalConDescuento() {
		double totalDescuento = total * 0.75;
	
		System.out.printf("El total con descuento es: %.2f €", totalDescuento);
	}
	
}