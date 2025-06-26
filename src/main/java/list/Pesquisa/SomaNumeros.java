package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numero;

    public SomaNumeros() {
        this.numero = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {

        this.numero.add(numero);

    }

    public int calcularSoma() {

        int soma = 0;
        for (Integer numeros : numero) {
            soma += numeros;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        //MIN_VALUE é uma constante, na validação retorna o maior número comparado à essa constante
        int maiorNumero = Integer.MIN_VALUE;
        if (!numero.isEmpty()) {
            for (Integer numeros : numero) {
                if (numeros >= maiorNumero) {
                    maiorNumero = numeros;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {

        //MAX_VALUE é uma constante, na validação retorna o menor número comparado à essa constante
        int menorNumero = Integer.MAX_VALUE;
        if (!numero.isEmpty()) {
            for (Integer numeros : numero) {
                if (numeros <= menorNumero) {
                    menorNumero = numeros;
                }
            }
        } return menorNumero;

    }

    public void exibirNumeros () {
        if (!numero.isEmpty()) {

            System.out.println(this.numero);

        } else {
            System.out.println("Não há elementos na lista");
        }

    }

    //testando métodos
    public static void main(String[] args) {

        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(20);
        numeros.adicionarNumero(9);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(12);
        numeros.adicionarNumero(21);

        System.out.println(numeros.calcularSoma());
        System.out.println(numeros.encontrarMaiorNumero());
        System.out.println(numeros.encontrarMenorNumero());

        numeros.exibirNumeros();

    }

}
