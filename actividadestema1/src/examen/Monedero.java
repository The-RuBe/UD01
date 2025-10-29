package examen;

public class Monedero {

//Atributos

private int cincoEuros;

private int dosEuros;

private int unEuro;

private int cent50;

private int cent20;

//Constructor

public Monedero(int cincoEuros, int dosEuros, int unEuro, int cent50, int cent20) {

this.cincoEuros = cincoEuros;

this.dosEuros = dosEuros;

this.unEuro = unEuro;

this.cent50 = cent50;

this.cent20 = cent20;

}

//Método para calcular y mostrar el dinero total en euros y céntimos sin mostrar decimales

public void setCincoEuros() {

System.out.println(cincoEuros);

}

public void getCincoEuros(int cincoEuros) {

this.cincoEuros = cincoEuros;

}

public void setDosEuros() {

System.out.println(dosEuros);

}

public void getDosEuros(int dosEuros) {

this.dosEuros = dosEuros;

}

public void setUnEuro() {

System.out.println(unEuro);

}

public void getUnEuro(int unEuro) {

this.unEuro = unEuro;

}

public void setCent50() {

System.out.println(cent50);

}

public void getCent50(int cent50) {

this.cent50 = cent50;

}

public void setCent20() {

System.out.println(cent20);

}

public void getCent20(int cent20) {

this.cent20 = cent20;

}

public void calcularTotalEuros() {

int centimosTotales = this.cincoEuros * 500 + this.dosEuros * 200 + this.unEuro * 100 + this.cent50 * 50 + this.cent20 * 20;

int euros = centimosTotales / 100;

int centimos = centimosTotales % 100;

System.out.printf("Total: %d € y %d céntimos", euros, centimos);

}

}