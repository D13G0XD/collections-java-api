package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa removerTarefaSet = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    removerTarefaSet = t;
                    break;

                }
            }
        } tarefaSet.remove(removerTarefaSet);

    }

    public void exibirTarefas() {
        if (!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else {
            System.out.println("Não há tarefas na lista ainda!");
        }
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isConcluido()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentendes = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.isConcluido()) {
                tarefasPendentendes.add(t);
            }
        } return tarefasPendentendes;



    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluido(true);
            }
        }
    }
    public void marcarTarefaPendente(String descricao) {
        Tarefa marcarTarefaPendente = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                marcarTarefaPendente = t;
                break;
            }
        }
        if (marcarTarefaPendente != null) {
            if (marcarTarefaPendente.isConcluido()) {
                marcarTarefaPendente.setConcluido(false);
            }
        }
    }

    public void limparListaTarefas() {
        if (tarefaSet.isEmpty()) {
            System.out.println("A lista já está vazia");
        } else {
            tarefaSet.clear();
            System.out.println("A lista foi limpada!");
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();

        listaTarefa.exibirTarefas();
        listaTarefa.limparListaTarefas();

        listaTarefa.adicionarTarefa("Limpar casa");
        listaTarefa.adicionarTarefa("Limpar carro");
        listaTarefa.adicionarTarefa("Limpar banheiro");
        listaTarefa.adicionarTarefa("Limpar cozinha");

        System.out.println(listaTarefa.contarTarefas());
        listaTarefa.exibirTarefas();

        listaTarefa.marcarTarefaConcluida("Limpar casa");
        listaTarefa.marcarTarefaConcluida("Limpar cozinha");
        listaTarefa.obterTarefasConcluidas();
        System.out.println(listaTarefa.obterTarefasPendentes());
        System.out.println(listaTarefa.obterTarefasConcluidas());

        listaTarefa.marcarTarefaPendente("Limpar casa");
        System.out.println(listaTarefa.obterTarefasPendentes());
        System.out.println(listaTarefa.obterTarefasConcluidas());

        listaTarefa.limparListaTarefas();
        listaTarefa.exibirTarefas();






    }

}




