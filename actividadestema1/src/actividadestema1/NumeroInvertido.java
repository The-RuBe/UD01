package actividadestema1;

public class NumeroInvertido {
    //Atributo
	private int numero;

	//Constructor
    public NumeroInvertido(int numero) {
        this.numero = numero;
    }

    // Método que invierte el número
    public void invertirNumero() {
        // Extraemos las cifras
        int decenas = numero / 10;
        int unidades = numero % 10;

        //Invertimos
        int invertido = (unidades * 10) + decenas;

        //Mostramos el resultado
        System.out.println("Número invertido: " + invertido);
    }
}