package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> palavrasDicionario;

    public Dicionario() {
        this.palavrasDicionario = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, String definicao) {
        palavrasDicionario.put(palavra, definicao);

    }

    public void removerPalavra(String palavra) {
        if (!palavrasDicionario.isEmpty()) {
            palavrasDicionario.remove(palavra);
        } else {
            System.out.println("A listá está vazia!");
        }

    }

    public void exibirPalavra() {
        if (!palavrasDicionario.isEmpty()) {
            System.out.println(palavrasDicionario);
        } else {
            System.out.println("A lista está vazia!");
        }

    }

    public String pesquisarPorPalavra(String palavra) {
        String palavraPesquisada = null;
        if (!palavrasDicionario.isEmpty()) {
            palavraPesquisada = palavrasDicionario.get(palavra);
        } else {
            System.out.println("A lista não possuí palavras!");
        } return palavraPesquisada;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavras("Teste 1", "Definição 1");
        dicionario.adicionarPalavras("Teste 2", "Definição 2");
        dicionario.adicionarPalavras("Teste 3", "Definição 3");
        dicionario.adicionarPalavras("Teste 4", "Definição 4");
        dicionario.adicionarPalavras("Teste 5", "Definição 5");

        dicionario.exibirPalavra();
        dicionario.removerPalavra("Teste 3");
        dicionario.exibirPalavra();

        System.out.println("A definição é: " + dicionario.pesquisarPorPalavra("Teste 5"));
    }

}
