package br.com.lanchonete.models;

public class Item {
    private int quantidadeItem;
    private double totalValorItem;

    public Item(int quantidadeItem, double totalValorItem) {
        this.quantidadeItem = quantidadeItem;
        this.totalValorItem = totalValorItem;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public double getTotalValorItem() {
        return totalValorItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public void setTotalValorItem(double totalValorItem) {
        this.totalValorItem = totalValorItem;
    }
}
