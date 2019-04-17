/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

public class Alteracao {
    protected int idAlteracao;
    protected int idProduto;// verificar se declara assim ou inscancia na classe produto;
    protected String nomeCampo;
    protected Date datAlteracao;
    protected String valor;

    public Alteracao(int idAlteracao, int idProduto, String nomeCampo, String valor) {
        this.idAlteracao = idAlteracao;
        this.idProduto = idProduto;
        this.nomeCampo = nomeCampo;
        this.valor = valor;
    }

    public int getIdAlteracao() {
        return idAlteracao;
    }

    public void setIdAlteracao(int idAlteracao) {
        this.idAlteracao = idAlteracao;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeCampo() {
        return nomeCampo;
    }

    public void setNomeCampo(String nomeCampo) {
        this.nomeCampo = nomeCampo;
    }

    public Date getDatAlteracao() {
        return datAlteracao;
    }

    public void setDatAlteracao(Date datAlteracao) {
        this.datAlteracao = datAlteracao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
}
