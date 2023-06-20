package br.com.rbeninca.mergulhandonospontinhos;


import java.util.ArrayList;

public class MergulhandoNosPontinhosManager {

    AlfabetoBraile alfabetoBraile;
    Letra letraAtual;
    ArrayList<Letra> letrasSorteadas;

    public MergulhandoNosPontinhosManager() {
        alfabetoBraile= new AlfabetoBraile();
        letrasSorteadas = new ArrayList<Letra>();
       // alfabetoBraile.carregaAlfabetoCompletoAZ();
        //alfabetoBraile.carregaTudo();



    }
    public Letra sorteiaLetra() {
        int posicao = (int) (Math.random() * alfabetoBraile.alfabetoBraile.size());
        letraAtual = alfabetoBraile.alfabetoBraile.get(posicao);
        return letraAtual;
    }

    public void iniciaJogo() {
        alfabetoBraile.carregaAlfabetoCompletoAZ();
        alfabetoBraile.carregaNumeros();

        letrasSorteadas.clear();
        sorteiaLetra();
        letrasSorteadas.add(letraAtual);
    }

    public Letra proximaLetra() {

        letrasSorteadas.add(letraAtual);
        return sorteiaLetra();
    }
    public Letra getLetraAtual() {
        return letraAtual;
    }
    public boolean veriticaRespota(String resposta) {
        return comparaBraileCela(letraAtual.getPontosCelas(), stringToCela(resposta));
    }


    public int[] stringToCela(String resposta) {
        //convert string to int[]
        int[] cela = new int[resposta.length()];
        for (int i = 0; i < resposta.length(); i++) {
            cela[i] = Integer.parseInt(resposta.substring(i, i + 1));
        }
        return cela;
    }
    public boolean comparaBraileCela(int[] celaA, int[] celaB) {
        //compara  o array de inteiros l.getPontosCelas  com letra.getPontosCelas
        int contem = 0;
        for (int a : celaA) {
            for (int b : celaB) {
                if (a == b) {
                    contem++;
                }
            }
        }
        if (celaA.length == contem && celaB.length == contem) {
            return true;
        } else {
            return false;
        }
    }
}
