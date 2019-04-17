
package model;

public class Atributo {
    private int idAtributo;
    private String nome;

    public int getIdAtributo() {
        return idAtributo;
    }

    public void setIdAtributo(int idAtributo) {
        this.idAtributo = idAtributo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Atributo(int idAtributo, String nome) {
        this.idAtributo = idAtributo;
        this.nome = nome;
    }
    
    
}
