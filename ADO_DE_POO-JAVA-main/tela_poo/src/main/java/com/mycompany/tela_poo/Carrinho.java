package com.mycompany.tela_poo;

/**
 *
 * @author renan.mssouza
 */
public class Carrinho {
    
    private Produto itens[];
    private int contador = 0;

    public Carrinho(int tamanho) {
        if(tamanho <= 0 || tamanho > 5 ){
            System.out.println("Tamanho não valido");
        }
        this.itens = new Produto [tamanho];
    }
    
    public void incluirItemCarrinho (Produto produto,int posicao){
        itens[contador++] = produto; 
    }
    
    public void exibirCarrinho(){
        for (int i = 0; i < contador; i++) { 
        System.out.println(itens[i]);
        }
    }
    
    public double fecharCompra(){
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += itens[i].getPreco();
        }
        return total;
    }

    public Produto[] getItens() {
        return itens;
    }

    public int getContador() {
        return contador;
    }
    
    

    @Override
    public String toString() {
        return "Carrinho{" + "itens=" + itens + ", contador=" + contador + '}';
    }

   
    
    
    
}
