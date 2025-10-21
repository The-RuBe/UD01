package actividadestema1;

import java.util.Scanner;

public class MainViajeCiclista {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Introduce la hora de salida: ");
				int horaSalida = sc.nextInt();
				
				System.out.println("Introduce los minutos de salida: ");
				int minutoSalida = sc.nextInt();
				
				System.out.println("Introduce los segundos de salida: ");
				int segundoSalida = sc.nextInt();
				
				System.out.println("Introduce los segundos que tardaste en llegar: ");
				int tiempoTotalSegundos = sc.nextInt();
							
				ViajeCiclista vc = new ViajeCiclista(horaSalida, minutoSalida, segundoSalida, tiempoTotalSegundos);
				
				vc.mostrarHoraLlegada();
		}

	}