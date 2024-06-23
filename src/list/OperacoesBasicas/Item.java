package list.OperacoesBasicas;

public class Item {
    private String nameItem;
    private double price;
    private int quantity;

    public Item(String nameItem, double price, int quantity) {
        this.nameItem = nameItem;
        this.price = price;
        this.quantity = quantity;
    }

    public String getNameItem() {
        return nameItem;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format("%s: %d x R$%.2f = R$%.2f", nameItem, quantity, price, getTotal());
    }
}