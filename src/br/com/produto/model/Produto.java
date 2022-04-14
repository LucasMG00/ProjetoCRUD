package br.com.produto.model;

public class Produto {

    private String id;
    private String nome;
    private String valor;
    private String quantidade;

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getValor() {
        return valor;
    }

    public String getQuantidade() {
        return quantidade;
    }
}
