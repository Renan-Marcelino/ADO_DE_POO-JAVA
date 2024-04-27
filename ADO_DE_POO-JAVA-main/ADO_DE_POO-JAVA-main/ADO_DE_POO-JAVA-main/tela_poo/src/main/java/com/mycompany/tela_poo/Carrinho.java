package com.mycompany.tela_poo;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author renan.mssouza
 */
public class Carrinho {

    private Produto itens[];
    private int contador = 0;

    public Carrinho(int tamanho) {
        if (tamanho <= 0 || tamanho > 5) {
            System.out.println("Tamanho não valido");
        }
        this.itens = new Produto[tamanho];
    }

    public void incluirItemCarrinho(Produto produto, int posicao) {
        itens[contador++] = produto;

    }

    public void exibirCarrinho(DefaultTableModel model) {
        for (int i = 0; i < contador; i++) {
            Produto produto = itens[i];
            Object[] rowData = {
                produto.getCodigo(),
                produto.getDescricao(),
                produto.getPreco(),
                produto.getQuantidade()
            };
            model.addRow(rowData);
        }
    }

    public double fecharCompra() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += itens[i].getPreco();
        }
        return total;
    }

    public void removerItem(int index) {
        if (index >= 0 && index < contador) {
            // Mover todos os itens após o item removido uma posição para trás
            for (int i = index; i < contador - 1; i++) {
                itens[i] = itens[i + 1];
            }
            // Decrementar o contador de itens
            contador--;
        }
    }

    public Produto[] getItens() {
        return itens;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void setItens(Produto[] itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Carrinho{" + "itens=" + itens + ", contador=" + contador + '}';
    }

}
