package act5;

public class EvaluacionTest {
	
	//Atributos
	private int correctas;
	private int incorrectas;
	private int blancas;
	
	//Constructor
	public EvaluacionTest(int correctas, int incorrectas, int blancas) {
		this.correctas = correctas;
		this.incorrectas = incorrectas;
		this.blancas = blancas;
	}
	
	//Método para calcular y mostrar la nota final del test
	public void setCorrectas() {
		System.out.println(this.correctas);
	}
	
	public void getCorrectas(int correctas) {
		this.correctas = correctas;
	}

	public void setIncorrectas() {
		System.out.println(this.incorrectas);
	}
	
	public void getIncorrectas(int incorrectas) {
		this.incorrectas = incorrectas;
	}
	
	public void setBlancas() {
		System.out.println(this.blancas);
	}
	
	public void getBlancas(int blancas) {
		this.blancas = blancas;
	}
	
	public void calcularNotaFinal() {
		int notaFinal = this.correctas * 5 + this.incorrectas * (-1);
	
		System.out.printf("Tu nota final es: %d puntos", notaFinal);
	}

}