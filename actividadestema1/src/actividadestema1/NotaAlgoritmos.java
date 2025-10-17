package actividadestema1;

public class NotaAlgoritmos {
	//Atributos
	private double p1;
	private double p2;
	private double p3;
	private double ef;
	private double tf;
	
	//Constructor
	public NotaAlgoritmos( double p1, double p2, double p3, double ef, double tf) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.ef = ef;
		this.tf = tf;
	}
	
	//Método que calcula la nota final
	public void calcularNotaFinal() {
		double n1 = (p1 + p2 + p3)/3;
		double n2 = n1 * 0.55;
		double n3 = ef * 0.3;
		double n4 = tf * 0.15;
		double n5 = n4 + n3 + n2;
		
		System.out.printf("La nota final es: %.2f", n5);
	}
}