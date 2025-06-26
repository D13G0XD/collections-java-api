package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        this.palavraSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavraSet.isEmpty()) {
            if (palavraSet.contains(palavra)) {
                palavraSet.remove(palavra);
            } else {
                System.out.println("A palavra não existe no conjunto");
            }
        }

    }

    public void verificarPalavra(String palavra) {
        if (palavraSet.contains(palavra)) {
            System.out.println("A palavra está no conjunto!");
        } else {
            System.out.println("A palavra não está no conjunto");
        }
    }

    public void exibirPalavras() {
        System.out.println(palavraSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();
        palavras.adicionarPalavra("ABC");
        palavras.adicionarPalavra("DEF");
        palavras.adicionarPalavra("GHI");
        palavras.adicionarPalavra("JKL");
        palavras.adicionarPalavra("MNO");
        palavras.adicionarPalavra("PQR");

        palavras.verificarPalavra("ABC");
        palavras.verificarPalavra("MNO");

        palavras.removerPalavra("PQR");
        palavras.removerPalavra("GHI");

        palavras.verificarPalavra("PQR");
        palavras.exibirPalavras();
    }

}
