package br.com.rbeninca.mergulhandonospontinhos;

public class Letra {
    String carater;
    Letra prefixo; //Letra que antecede a letra atual com números
    int [] pontosCelas;

    public Letra(String carater, int[] pontosCelas) {
        this.carater = carater;
        this.pontosCelas = pontosCelas;
    }

public Letra(String carater, int[] pontosCelas, Letra prefixo) {
        this.carater = carater;
        this.pontosCelas = pontosCelas;
        this.prefixo = prefixo;
    }

    public String getCarater() {
        return carater;
    }

    public void setCarater(String carater) {
        this.carater = carater;
    }

    public int[] getPontosCelas() {
        return pontosCelas;
    }

    public void setPontosCelas(int[] pontosCelas) {
        this.pontosCelas = pontosCelas;
    }

    public Letra getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(Letra prefixo) {
        this.prefixo = prefixo;
    }

}
