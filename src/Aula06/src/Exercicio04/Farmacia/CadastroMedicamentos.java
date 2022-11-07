package Aula06.src.Exercicio04.Farmacia;

public class CadastroMedicamentos extends Farmacia {
    private float valor;

    public CadastroMedicamentos(int cod, String nomeclatura, String tarja, String posologia, float unidades, float valor) {
        super(cod, nomeclatura, tarja, posologia, unidades);
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void visualizar() {
        super.visualizar();
        System.out.println("Valor:" + getValor());

    }
}











