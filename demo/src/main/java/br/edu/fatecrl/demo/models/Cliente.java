package br.edu.fatecrl.demo.models;

public class Cliente {
    private String Nome;
    private String Pedido;
    private double Valor;

    public Cliente(String nome, String pedido, double valor) {
        Nome = nome;
        Pedido = pedido;
        Valor = valor;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getPedido() {
        return Pedido;
    }

    public void setPedido(String pedido) {
        Pedido = pedido;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        Valor = valor;
    }
}
