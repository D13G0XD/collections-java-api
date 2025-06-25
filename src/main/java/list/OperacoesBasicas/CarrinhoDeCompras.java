package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItems(String nome, double preco, int quantidade) {
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> removerItem = new ArrayList<>();
        for (Item item: carrinhoDeCompras) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                removerItem.add(item);
            }
        } carrinhoDeCompras.removeAll(removerItem);

    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        if (!carrinhoDeCompras.isEmpty()) {

            for (Item i : carrinhoDeCompras) {
                double valorItem = i.getQuantidade() * i.getPreco();
                valorTotal += valorItem;
            }



        }
        return  valorTotal;
    }


    public void exibirItems() {
        System.out.println(carrinhoDeCompras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItems("Pão", 12.99, 3);
        carrinhoDeCompras.adicionarItems("Manteiga", 7.50, 3);
        carrinhoDeCompras.removerItem("Manteiga");

        System.out.println("Itens:");
        carrinhoDeCompras.exibirItems();
        System.out.println(carrinhoDeCompras.calcularValorTotal());;

    }

}


