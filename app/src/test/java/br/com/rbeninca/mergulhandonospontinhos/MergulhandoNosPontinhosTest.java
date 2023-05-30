package br.com.rbeninca.mergulhandonospontinhos;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class MergulhandoNosPontinhosTest {
    @Test
    public void criaAlfabeto()
    {
        AlfabetoBraile alfabetoBraile = new AlfabetoBraile();
        alfabetoBraile.carregaAlfabetoCompletoAZ();
        assertEquals(26, alfabetoBraile.alfabetoBraile.size());
    }
}