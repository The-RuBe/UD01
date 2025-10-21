package actividadestema1;

public class ViajeCiclista {

	//Atributos
	private int horaSalida;
	private int minutoSalida;
	private int segundoSalida;
	private int tiempoTotalSegundos;
	
	//Constructor
	public ViajeCiclista(int horaSalida, int minutoSalida, int segundoSalida, int tiempoTotalSegundos) {
		this.horaSalida = horaSalida;
		this.minutoSalida = minutoSalida;
		this.segundoSalida = segundoSalida;
		this.tiempoTotalSegundos = tiempoTotalSegundos;
	}
	
	public void getHoraSalida() {
		System.out.println(horaSalida);
	}
	
	public void setHoraSalida() {
		this.horaSalida = horaSalida;
	}
	
	public void getMinutoSalida() {
		System.out.println(minutoSalida);
	}
	
	public void setMinutoSalida() {
		this.minutoSalida = minutoSalida;
	}
	
	public void getSegundoSalida() {
		System.out.println(segundoSalida);
	}
	
	public void setSegundoSalida() {
		this.segundoSalida = segundoSalida;
	}	
	
	//Método para calcular y mostrar la hora de llegada sumando el tiempo al de salida
	public void mostrarHoraLlegada() {
		int segundosLlegada = this.horaSalida * 3600 + this.minutoSalida * 60 + this.segundoSalida + this.tiempoTotalSegundos;
		
		int segundos = segundosLlegada % 60;
		int minutos = (segundosLlegada / 60) % 60;
		int horas = (segundosLlegada / 3600) % 24;
		
		System.out.println("Llega a las " + horas + " h, " + minutos + " minutos y " + segundos + " segundos" );
	}
}
