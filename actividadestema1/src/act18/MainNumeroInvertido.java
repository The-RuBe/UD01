package act18;

import java.util.Scanner;

public class MainNumeroInvertido {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número de dos cifras: ");
		int num = sc.nextInt();

		NumeroInvertido numeroInvertido = new NumeroInvertido(num);
		numeroInvertido.invertirNumero();

	}
}