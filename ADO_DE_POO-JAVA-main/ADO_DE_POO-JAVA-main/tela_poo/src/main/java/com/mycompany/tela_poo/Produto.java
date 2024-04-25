package com.mycompany.tela_poo;

public class Produto {
    private int codigo;
    private String descProduto;
    private double preco;
    private int quantidade;

    public Produto(int codigo, String descProduto, double preco, int quantidade) {
        this.codigo = codigo;
        this.descProduto = descProduto; 
        this.preco = preco;
        this.quantidade = quantidade;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public String getDescricao() {
        return descProduto;
    }
    
    
    

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void listarDados(){
        System.out.println("Codigo " + codigo + "Descrição " + descProduto + "Preço " + preco + "Quantidade " + quantidade);
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo: " + codigo + ", descProduto: " + descProduto + ", preco: " + preco + ", quantidade: " + quantidade + '}';
    }

    
    
    
    
    
}

