package Aula06.src.Exercicio04.Medicamentos;

public class CadastroMedicamentos extends Medicamentos {
    private float valor;

    public CadastroMedicamentos(int id, String nomeclatura, float quantidade) {
        super(id, nomeclatura, quantidade);
        this.valor = valor;
    }

    public float getValor(){
        return valor;

    }
    public void setValor(float valor){
        this.valor = valor;
    }
    @Override
    public void vizualizar() {
        super.visualizar();
        System.out.println("Valor : "+getValor());
        System.out.println("\n **********************************");

    }
}



