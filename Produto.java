/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Amanda
 */
//Crie uma classe que exibe informações sobre um produto, como nome, código e preço. Use sobrecarga para exibir diferentes conjuntos de informações.
public class Produto {
    private String nome;
    private String descricao;
    private String categoria;
    private double cd;
    private double preco;
    
    public Produto(String nome, double cd, double preco, String descricao, String categoria){
        this.nome = nome;
        this.cd = cd;
        this.preco = preco;
        this.descricao = descricao;
        this.categoria = categoria;
    }
    public void Informacoes(){
        System.out.println("Nome" + nome);
        System.out.println("Codigo" + cd);
        System.out.println("Preço" + preco);
        System.out.println("Descrição:" + descricao);
        System.out.println("Categoria" + categoria);
        
    }
    public void Informacoes(boolean exibirpreco ){
        System.out.println("Nome" + nome);
        System.out.println("Codigo" + cd);
        if(exibirpreco){
            System.out.println("Preço $" + preco);
        }
        System.out.println("Descrição" + descricao);
        System.out.println("Categoria" + categoria);
    }
    
    public static void main(String[] args){
        Produto produto = new Produto("Livro:Cidade de ossos", 2346, 20.00,"livro de fantasia terror","livros de  lazer");
        
        produto.Informacoes();
        System.out.println();
        
        produto.Informacoes(false);
        System.out.println();
        
        produto.Informacoes(true);
        System.out.println();
    }
    
    
}
