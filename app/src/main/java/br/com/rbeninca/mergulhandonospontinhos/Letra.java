package br.com.rbeninca.mergulhandonospontinhos;

public class Letra {
    String carater;
    // enum cela braile 1 a 6
    int [] pontosCelas;

    public Letra(String carater, int[] pontosCelas) {
        this.carater = carater;
        this.pontosCelas = pontosCelas;
    }
}
