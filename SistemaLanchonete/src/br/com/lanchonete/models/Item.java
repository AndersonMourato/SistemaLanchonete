package br.com.lanchonete.models;

public class Item {
    private int quantidadeItem;
    private double totalValorItem;

    private Produto produto;

    public Item(int quantidadeItem, double totalValorItem, Produto produto) {
        this.quantidadeItem = quantidadeItem;
        this.totalValorItem = totalValorItem;
        this.produto = produto;
    }

    public Item() {
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
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
