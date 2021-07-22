package br.com.alura.mvc.mudi.dto;

import br.com.alura.mvc.mudi.model.Pedido;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class RequisicaoNovoPedido {

    @NotBlank
    @NotNull
    private String nomeProduto;
    @NotBlank
    @NotNull
    private String urlProduto;
    @NotBlank
    @NotNull
    private String urlImagem;
    @NotBlank
    @NotNull
    private String descricao;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Pedido toPedido() {
        Pedido pedido = new Pedido();
        pedido.setUrlImagem(urlImagem);
        pedido.setNomeProduto(nomeProduto);
        pedido.setDescricao(descricao);
        pedido.setUrlProduto(urlProduto);
        return pedido;
    }
}
