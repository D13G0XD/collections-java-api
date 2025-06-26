package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadosSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;

            }
        } convidadosSet.remove(convidadoParaRemover);

    }

    public int contarConvidado() {
        return convidadosSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();
        System.out.println("Existem " + convidados.contarConvidado() + " convidado(s) dentro do set de Convidados");

        convidados.adicionarConvidado("Convidado 1", 123);
        convidados.adicionarConvidado("Convidado 2", 456);
        convidados.adicionarConvidado("Convidado 3", 456);
        convidados.adicionarConvidado("Convidado 4", 789);

        System.out.println("Foram adicionados " + convidados.contarConvidado() + " convidados dentro do set de Convidados");

        convidados.removerConvidado(456);
        System.out.println("Existem " + convidados.contarConvidado() + " convidados dentro do set de Convidados");
        convidados.exibirConvidados();
    }

}
