package br.com.rbeninca.mergulhandonospontinhos;

import java.util.ArrayList;

public class AlfabetoBraile {
    ArrayList<Letra>  alfabetoBraile;
    AlfabetoBraile() {
        alfabetoBraile=carregaAlfabetoCompleto();
    }
    public   ArrayList<Letra>  carregaAlfabetoCompleto(){
                //Carrega letras Braile
                ArrayList<Letra>  alfabetoBraile = new ArrayList<Letra>();

                alfabetoBraile.add(new Letra("A", new int[]{1}));
                alfabetoBraile.add(new Letra("B", new int[]{1,2}));
                alfabetoBraile.add(new Letra("C", new int[]{1,4}));
                alfabetoBraile.add(new Letra("D", new int[]{1,4,5}));
                alfabetoBraile.add(new Letra("E", new int[]{1,5}));
                alfabetoBraile.add(new Letra("F", new int[]{1,2,4}));
                alfabetoBraile.add(new Letra("G", new int[]{1,2,4,5}));
                alfabetoBraile.add(new Letra("H", new int[]{1,2,5}));
                alfabetoBraile.add(new Letra("I", new int[]{2,4}));
                alfabetoBraile.add(new Letra("J", new int[]{2,4,5}));
                alfabetoBraile.add(new Letra("K", new int[]{1,3}));
                alfabetoBraile.add(new Letra("L", new int[]{1,2,3}));
                alfabetoBraile.add(new Letra("M", new int[]{1,3,4}));
                alfabetoBraile.add(new Letra("N", new int[]{1,3,4,5}));
                alfabetoBraile.add(new Letra("O", new int[]{1,3,5}));
                alfabetoBraile.add(new Letra("P", new int[]{1,2,3,4}));
                alfabetoBraile.add(new Letra("Q", new int[]{1,2,3,4,5}));
                alfabetoBraile.add(new Letra("R", new int[]{1,2,3,5}));
                alfabetoBraile.add(new Letra("S", new int[]{2,3,4}));
                alfabetoBraile.add(new Letra("T", new int[]{2,3,4,5}));
                alfabetoBraile.add(new Letra("U", new int[]{1,3,6}));
                alfabetoBraile.add(new Letra("V", new int[]{1,2,3,6}));
                alfabetoBraile.add(new Letra("W", new int[]{2,4,5,6}));
                alfabetoBraile.add(new Letra("X", new int[]{1,3,4,6}));
                alfabetoBraile.add(new Letra("Y", new int[]{1,3,4,5,6}));
                alfabetoBraile.add(new Letra("Z", new int[]{1,3,5,6}));

                return  alfabetoBraile;
    }
    public Letra getLetra(int i){
        //metodo para recuperar letra
        if ( i>0 && i<alfabetoBraile.size()){
            return  alfabetoBraile.get(i);
        }
        return  null;
    }
    public  Letra getLetra(String c){
        for (Letra l: alfabetoBraile) {
            if (l.getCarater()==c){
                return l;
            }
        }
        return null;
    }
    public boolean comparaBraile(Letra letra){
        Letra l=getLetra(letra.getCarater());
        //compara  o array de inteiros l.getPontosCelas  com letra.getPontosCelas
        int contem=0;
        for (int i: l.getPontosCelas()) {
            for (int j:letra.getPontosCelas()) {
                if (i==j){
                    contem++;
                }
            }
        }
        if (l.getPontosCelas().length==contem) {
            return true;
        }else{
            return  false;
        }
    }
    //função comapara se os elementos contidos em um array de inteiro também existem no outro.


}
/**alfabetoBraile.add(new Letra("a", new int[]{1},null));
           alfabetoBraile.add(new Letra("b", new int[]{1,2}));
           alfabetoBraile.add(new Letra("c", new int[]{1,4}));
           alfabetoBraile.add(new Letra("d", new int[]{1,4,5}));
           alfabetoBraile.add(new Letra("e", new int[]{1,5}));
           alfabetoBraile.add(new Letra("f", new int[]{1,2,4}));
           alfabetoBraile.add(new Letra("g", new int[]{1,2,4,5}));
           alfabetoBraile.add(new Letra("h", new int[]{1,2,5}));
           alfabetoBraile.add(new Letra("i", new int[]{2,4}));
           alfabetoBraile.add(new Letra("j", new int[]{2,4,5}));
           alfabetoBraile.add(new Letra("k", new int[]{1,3}));
           alfabetoBraile.add(new Letra("l", new int[]{1,2,3}));
           alfabetoBraile.add(new Letra("m", new int[]{1,3,4}));
           alfabetoBraile.add(new Letra("n", new int[]{1,3,4,5}));
           alfabetoBraile.add(new Letra("o", new int[]{1,3,5}));
           alfabetoBraile.add(new Letra("p", new int[]{1,2,3,4}));
           alfabetoBraile.add(new Letra("q", new int[]{1,2,3,4,5}));
           alfabetoBraile.add(new Letra("r", new int[]{1,2,3,5}));
           alfabetoBraile.add(new Letra("s", new int[]{2,3,4}));
           alfabetoBraile.add(new Letra("t", new int[]{2,3,4,5}));
           alfabetoBraile.add(new Letra("u", new int[]{1,3,6}));
           alfabetoBraile.add(new Letra("v", new int[]{1,2,3,6}));
           alfabetoBraile.add(new Letra("x", new int[]{1,3,4,6}));
           alfabetoBraile.add(new Letra("y", new int[]{1,3,4,5,6}));
           alfabetoBraile.add(new Letra("z", new int[]{1,3,5,6}));
           alfabetoBraile.add(new Letra("ç", new int[]{1,2,4,6}));
           alfabetoBraile.add(new Letra("á", new int[]{1,6}));
           alfabetoBraile.add(new Letra("é", new int[]{1,2,6}));
           alfabetoBraile.add(new Letra("í", new int[]{2,4,6}));
           alfabetoBraile.add(new Letra("ó", new int[]{1,3,6}));
           alfabetoBraile.add(new Letra("ú", new int[]{2,3,6}));
           alfabetoBraile.add(new Letra("â", new int[]{1,2,3,6}));
           alfabetoBraile.add(new Letra("ê", new int[]{1,3,4,6}));
           alfabetoBraile.add(new Letra("ô", new int[]{1,2,4,5,6}));
           alfabetoBraile.add(new Letra("ã", new int[]{1,2,3,4,6}));
           alfabetoBraile.add(new Letra("õ", new int[]{1,2,3,5,6}));
           alfabetoBraile.add(new Letra("à", new int[]{1,2,3,4,5,6}));
           alfabetoBraile.add(new Letra("ü", new int[]{1,2,3,5,6}));
           alfabetoBraile.add(new Letra("í", new int[]{2,4,6}));
           alfabetoBraile.add(new Letra("!", new int[]{2,3,4,6}));
           alfabetoBraile.add(new Letra("?", new int[]{2,3,4,5,6}));
           alfabetoBraile.add(new Letra(":", new int[]{2,3,5,6}));
           alfabetoBraile.add(new Letra(";", new int[]{2,3,4,5}));
           alfabetoBraile.add(new Letra(",", new int[]{2,3}));
           alfabetoBraile.add(new Letra(".", new int[]{2,3,5}));
           alfabetoBraile.add(new Letra("-", new int[]{3,6}));
           alfabetoBraile.add(new Letra("(", new int[]{2,3,4,5,6}));
           alfabetoBraile.add(new Letra(")", new int[]{2,3,4,5,6}));
           alfabetoBraile.add(new Letra(" ", new int[]{7}));
           alfabetoBraile.add(new Letra("0", new int[]{3,4,5,6}));
           alfabetoBraile.add(new Letra("1", new int[]{1,2}));
           alfabetoBraile.add(new Letra("2", new int[]{1,2,5}));
           alfabetoBraile.add(new Letra("3", new int[]{1,4}));
           alfabetoBraile.add(new Letra("4", new int[]{1,4,5}));
           alfabetoBraile.add(new Letra("5", new int[]{1,5}));
           alfabetoBraile.add(new Letra("6", new int[]{1,2,4}));
           alfabetoBraile.add(new Letra("7", new int[]{1,2,4,5}));
           alfabetoBraile.add(new Letra("8", new int[]{1,2,5}));
           alfabetoBraile.add(new Letra("9", new int[]{2,4}));
           alfabetoBraile.add(new Letra("0", new int[]{2,4,5}));
           alfabetoBraile.add(new Letra("A", new int[]{1}));
           alfabetoBraile.add(new Letra("B", new int[]{1,2}));
           alfabetoBraile.add(new Letra("C", new int[]{1,4}));
           alfabetoBraile.add(new Letra("D", new int[]{1,4,5}));
           alfabetoBraile.add(new Letra("E", new int[]{1,5}));
           alfabetoBraile.add(new Letra("F", new int[]{1,2,4}));
           alfabetoBraile.add(new Letra("G", new int[]{1,2,4,5}));
           alfabetoBraile.add(new Letra("H", new int[]{1,2,5}));
           alfabetoBraile.add(new Letra("I", new int[]{2,4}));
           alfabetoBraile.add(new Letra("J", new int[]{2,4,5}));
           alfabetoBraile.add(new Letra("K", new int[]{1,3}));
           alfabetoBraile.add(new Letra("L", new int[]{1,2,3}));
           alfabetoBraile.add(new Letra("M", new int[]{1,3,4}));
           alfabetoBraile.add(new Letra("N", new int[]{1,3,4,5}));
           alfabetoBraile.add(new Letra("O", new int[]{1,3,5}));
           alfabetoBraile.add(new Letra("P", new int[]{1,2,3,4}));
           alfabetoBraile.add(new Letra("Q", new int[]{1,2,3,4,5}));
           alfabetoBraile.add(new Letra("R", new int[]{1,2,3,5}));
           alfabetoBraile.add(new Letra("S", new int[]{2,3,4}));
           alfabetoBraile.add(new Letra("T", new int[]{2,3,4,5}));
           alfabetoBraile.add(new Letra("U", new int[]{1,3,6}));
           alfabetoBraile.add(new Letra("V", new int[]{1,2,3,6}));
           alfabetoBraile.add(new Letra("W", new int[]{2,4,5,6}));
           alfabetoBraile.add(new Letra("X", new int[]{1,3,4,6}));
           alfabetoBraile.add(new Letra("Y", new int[]{1,3,4,5,6}));
           alfabetoBraile.add(new Letra("Z", new int[]{1,3,5,6}));
           alfabetoBraile.add(new Letra("Ç", new int[]{1,2,3,4,6}));
           alfabetoBraile.add(new Letra("Á", new int[]{1,6}));
           alfabetoBraile.add(new Letra("É", new int[]{1,2,6}));
           alfabetoBraile.add(new Letra("Í", new int[]{2,4,6}));
           alfabetoBraile.add(new Letra("Ó", new int[]{1,3,6}));
           alfabetoBraile.add(new Letra("Ú", new int[]{2,3,4,6}));
           alfabetoBraile.add(new Letra("Ã", new int[]{1,2,3,6}));
           alfabetoBraile.add(new Letra("Õ", new int[]{1,3,4,6}));
           alfabetoBraile.add(new Letra("Â", new int[]{1,2,4,6}));
           alfabetoBraile.add(new Letra("Ê", new int[]{1,2,3,4,6}));
           alfabetoBraile.add(new Letra("Ô", new int[]{1,2,3,4,5,6}));
           alfabetoBraile.add(new Letra("À", new int[]{1,2,3,5,6}));
           alfabetoBraile.add(new Letra("Ü", new int[]{1,2,3,4,5,6}));
           alfabetoBraile.add(new Letra("!", new int[]{1,2,3,4,5}));
           alfabetoBraile.add(new Letra("?", new int[]{1,2,3,5,6}));
           alfabetoBraile.add(new Letra(".", new int[]{2,3,5,6}));
           alfabetoBraile.add(new Letra(",", new int[]{2,3,5}));
           */


