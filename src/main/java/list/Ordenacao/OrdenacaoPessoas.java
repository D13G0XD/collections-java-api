package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoasList;

    public OrdenacaoPessoas() {
        this.pessoasList = new ArrayList<>();

    }
    public void adicionarPessoas(String nome, int idade, double altura) {

        pessoasList.add(new Pessoa(nome, idade, altura));

    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenarPessoas = new OrdenacaoPessoas();
        ordenarPessoas.adicionarPessoas("Nome 1", 20, 1.56);
        ordenarPessoas.adicionarPessoas("Nome 2", 30, 1.80);
        ordenarPessoas.adicionarPessoas("Nome 3", 25, 1.70);
        ordenarPessoas.adicionarPessoas("Nome 4", 17, 1.56);

        System.out.println(ordenarPessoas.ordenarPorIdade());
        System.out.println(ordenarPessoas.ordenarPorAltura());


    }
}
