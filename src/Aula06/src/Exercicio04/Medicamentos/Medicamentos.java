package Aula06.src.Exercicio04.Medicamentos;

public abstract class Medicamentos {
    private int idProduto;
    private String nomeclatura;
    private float quantidade;

    public int getIdProduto(){
        return idProduto;
    }
    public Medicamentos(int idProduto, String nomeclatura, float quantidade){
        this.idProduto = idProduto;
        this.nomeclatura = nomeclatura;
        this.quantidade = quantidade;
    }


    public String getNomeclatura() {
        return nomeclatura;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setNomeclatura(String nomeclatura) {
        this.nomeclatura = nomeclatura;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public void visualizar() {
        System.out.println("Id do Produto:"+getIdProduto());
        System.out.println("Nome medicamento :"+ getNomeclatura());
        System.out.println("Quantidade:"+ getQuantidade());

    }

    public abstract void vizualizar();
}
