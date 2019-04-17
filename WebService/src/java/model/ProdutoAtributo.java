
package model;

public class ProdutoAtributo {
    private int idProdutoAtributo;
    private int idProduto;
    private int idAtributo;
    private String valor;

    public int getIdProdutoAtributo() {
        return idProdutoAtributo;
    }

    public void setIdProdutoAtributo(int idProdutoAtributo) {
        this.idProdutoAtributo = idProdutoAtributo;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getIdAtributo() {
        return idAtributo;
    }

    public void setIdAtributo(int idAtributo) {
        this.idAtributo = idAtributo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public ProdutoAtributo(int idProdutoAtributo, int idProduto, int idAtributo, String valor) {
        this.idProdutoAtributo = idProdutoAtributo;
        this.idProduto = idProduto;
        this.idAtributo = idAtributo;
        this.valor = valor;
    }
    
    
}
