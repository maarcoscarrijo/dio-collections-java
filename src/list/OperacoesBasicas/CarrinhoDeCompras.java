package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    public void removerItem(String nameItem) {
        Iterator<Item> iterator = itens.iterator();
        boolean itemRemovido = false;
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getNameItem().equalsIgnoreCase(nameItem)) {
                iterator.remove();
                System.out.printf("Item '%s' removido do carrinho.%n", nameItem);
                itemRemovido = true;
                break;
            }
        }
        if (!itemRemovido) {
            System.out.printf("Item '%s' não encontrado no carrinho.%n", nameItem);
        }
    }

    public double calcularValorTotal() {
        return this.itens.stream().mapToDouble(Item::getTotal).sum();
    }

    public void exibirItens() {
        if (itens.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("Itens no carrinho:");
            for (Item item : itens) {
                System.out.println(item);
            }
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionando itens
        carrinho.adicionarItem(new Item("Headset", 150.99, 1));
        carrinho.adicionarItem(new Item("Keyboard", 450.90, 1));
        carrinho.adicionarItem(new Item("Mouse", 120.01, 1));
        carrinho.adicionarItem(new Item("Mouse DPI", 500.01, 1));

        // Carrinho antes de remover qualquer item
        carrinho.exibirItens();
        double total = carrinho.calcularValorTotal();
        System.out.printf("Valor total do carrinho: R$%.2f%n", total);

        // Removendo um item
        carrinho.removerItem("Mouse DPI");

        // Carrinho após remover item
        System.out.println("\nCarrinho atual");
        carrinho.exibirItens();
        total = carrinho.calcularValorTotal();
        System.out.printf("Valor total do carrinho: R$%.2f%n", total);
    }
}