package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContatos(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContatos(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
           numeroPorNome = agendaContatoMap.get(nome);
        } return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContatos("Diego", 123456);
        agendaContatos.adicionarContatos("Diego Kanamori", 11111111);
        agendaContatos.adicionarContatos("Diego MK", 654987);
        agendaContatos.adicionarContatos("Diego Silva", 1231234);

        agendaContatos.exibirContatos();
        agendaContatos.removerContatos("Diego Silva");

        agendaContatos.exibirContatos();

        agendaContatos.removerContatos("Diego Silva");
        agendaContatos.exibirContatos();

        System.out.println("Número do contato: " + agendaContatos.pesquisarPorNome("Diego"));
    }


}
