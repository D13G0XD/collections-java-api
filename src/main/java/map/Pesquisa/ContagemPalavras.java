package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> contagemPalavras;

    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, Integer contagem) {
        contagemPalavras.put(palavra, contagem);
    }

    public void removerPalavras(String palavra){
        contagemPalavras.remove(palavra);
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for (int contagem : contagemPalavras.values()){
            contagemTotal += contagem;
        } return contagemTotal;
    }

    public void exibirContagemPalavrasDetalhado() {
        System.out.println(contagemPalavras);
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;

        for (Map.Entry<String, Integer> entry : contagemPalavras.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();

            }
        } return palavraMaisFrequente;

    }

    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();

        contagem.adicionarPalavras("Abacate", 2);
        contagem.adicionarPalavras("Melão", 4);
        contagem.adicionarPalavras("Laranja", 7);
        contagem.adicionarPalavras("Morango", 3);
        contagem.adicionarPalavras("Melancia", 9);
        contagem.exibirContagemPalavrasDetalhado();



        System.out.println("Existem no total: " + contagem.exibirContagemPalavras() + " palavras.");
        System.out.println("A palavra mais frequente é: " + contagem.encontrarPalavraMaisFrequente());

        contagem.removerPalavras("Abacate");
        contagem.exibirContagemPalavrasDetalhado();
        System.out.println("Existem no total: " + contagem.exibirContagemPalavras() + " palavras.");
    }




}
