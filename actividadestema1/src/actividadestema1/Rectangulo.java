package actividadestema1;

public class Rectangulo {

	private double base;
	private double altura;
	
	public Rectangulo(double base,double altura){
		this.base = base;
		this.altura = altura;
	}

	public void getbase() {
		System.out.println(this.base);
	}
	
	public void setbase() {
		System.out.println(this.base);
	}
	
	public void getaltura() {
		System.out.println(this.altura);
	}
	
	public void setaltura() {
		System.out.println(this.altura);
	}
	public void calculaPerimetroArea() {
		double perimetro = (base+altura)*2;
		double area = base * altura;
		System.out.printf("El perímetro es %.2f", perimetro);
		System.out.printf(" y el área es %.2f", area);
	}
	
}