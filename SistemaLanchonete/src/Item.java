public class Item {
    private int quantidadeProduto;
    private double totalValorItem;

    public Item() {
    }

    public Item(int quantidadeProduto, double totalValorItem) {
        this.quantidadeProduto = quantidadeProduto;
        this.totalValorItem = totalValorItem;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public double getTotalValorItem() {
        return totalValorItem;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public void setTotalValorItem(double totalValorItem) {
        this.totalValorItem = totalValorItem;
    }
}
