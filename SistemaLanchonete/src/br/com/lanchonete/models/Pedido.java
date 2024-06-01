package br.com.lanchonete.models;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String data;
    private double totalPedido;

    List<Item> itensPedido = new ArrayList<>();

    public Pedido(String data, double totalPedido, List<Item> itensPedido) {
        this.data = data;
        this.totalPedido = totalPedido;
        this.itensPedido = itensPedido;
    }

    public Pedido() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(double totalPedido) {
        this.totalPedido = totalPedido;
    }

    public List<Item> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<Item> itensPedido) {
        this.itensPedido = itensPedido;
    }
}
