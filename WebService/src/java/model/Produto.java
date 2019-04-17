
package model;

import java.util.Date;

public class Produto {
    public int idProduto ;
    public String nomeProduto;
    public float precoProduto;
    public Marca marca;//tipo object
    public Categoria categoria;// object
    public Modelo modelo;//object
    public Date datCadastro;
    public String descricao;
    public boolean excluido;//
    
//---- Construtor
    public Produto(int idProduto, String nomeProduto, Marca marca, Categoria categoria, Modelo modelo, Date datCadastro, String descricao, boolean excluido) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.marca = marca;
        this.categoria = categoria;
        this.modelo = modelo;
        this.datCadastro = datCadastro;
        this.descricao = descricao;
        this.excluido = excluido;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPrecoProduto(float precoProduto) {
        this.precoProduto = precoProduto;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public void setDatCadastro(Date datCadastro) {
        this.datCadastro = datCadastro;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setExcluido(boolean excluido) {
        this.excluido = excluido;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public float getPrecoProduto() {
        return precoProduto;
    }

    public Marca getMarca() {
        return marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public Date getDatCadastro() {
        return datCadastro;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isExcluido() {
        return excluido;
    }
}