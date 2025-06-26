package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numeroLista;

    public OrdenacaoNumeros() {
        this.numeroLista = new ArrayList<>();
    }


    public void adicionarNumero(int numeroLista) {
        this.numeroLista.add(numeroLista);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numeroAscendente = new ArrayList<>(this.numeroLista);
        if (!numeroLista.isEmpty()) {
            Collections.sort(numeroAscendente);
        } return numeroAscendente;
    }

    public List<Integer> ordernarDescendente() {
        List<Integer> numeroAscendente = new ArrayList<>(numeroLista);
            if (!numeroLista.isEmpty()) {
                numeroAscendente.sort(Collections.reverseOrder());
            } return numeroAscendente;
    }

    public void exibirNumeros() {
        if (!numeroLista.isEmpty()) {
            System.out.println(this.numeroLista);
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(12);
        numeros.adicionarNumero(41);
        numeros.adicionarNumero(112);
        numeros.adicionarNumero(15);
        numeros.adicionarNumero(112);

        numeros.exibirNumeros();
        System.out.println(numeros.ordenarAscendente());
        System.out.println(numeros.ordernarDescendente());
    }

}
