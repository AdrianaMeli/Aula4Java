package Aula06.src.Exercicio04.Farmacia;

public class CadastroPerfumaria  extends Farmacia {
    private float dosagem;

    public CadastroPerfumaria(int cod, String nomeclatura, String tarja, String posologia, float unidades,float dosagem) {
        super(cod, nomeclatura, tarja, posologia, unidades);
        this.dosagem = dosagem;
    }

    public float getDosagem() {
        return dosagem;
    }

    public void setDosagem(float dosagem) {
        this.dosagem = dosagem;
    }
    public void visualizar(){
        super.visualizar();
        System.out.println("Dosagem:" + this.dosagem);
    }


}









