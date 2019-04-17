package dao;

import java.util.Date;

public class ProdutoDAO {
	public int idProduto;
	public String nomeProduto;
	public float precoProduto;
	public Object marca;
	public Object categoria;
	public Date datCadastro;
	public String descricao;
	public Boolean excluido;
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public float getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(float precoProduto) {
		this.precoProduto = precoProduto;
	}
	public Object getMarca() {
		return marca;
	}
	public void setMarca(Object marca) {
		this.marca = marca;
	}
	public Object getCategoria() {
		return categoria;
	}
	public void setCategoria(Object categoria) {
		this.categoria = categoria;
	}
	public Date getDatCadastro() {
		return datCadastro;
	}
	public void setDatCadastro(Date datCadastro) {
		this.datCadastro = datCadastro;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Boolean getExcluido() {
		return excluido;
	}
	public void setExcluido(Boolean excluido) {
		this.excluido = excluido;
	}
	
	public void cadastrar() {
		String inserir;
		inserir = "insert into produto(?,?,?,?,?,?,?,?)VALUES('01','teste','10.0','marca1','modelo1','categoria1','2019-01-20','teste de insersao')";
		System.out.println("Teste" + inserir);
	}


}
