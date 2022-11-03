package Exercicio04.Farmacia;

public class Farmacia {
    private int cod;
    private String nomeclatura;
    private String tarja;
    private String posologia;
    private float unidades;

    public Farmacia(int cod, String nomeclatura, String tarja, String posologia, float unidades) {
        this.cod = cod;
        this.nomeclatura = nomeclatura;
        this.tarja = tarja;
        this.posologia = posologia;
        this.unidades = unidades;
    }

    public int cod() {
        return cod;
    }

    public String nomeclatura() {
        return nomeclatura;
    }

    public String tarja() {
        return tarja;
    }

    public String posologia() {
        return posologia;
    }

    public float unidades() {
        return unidades;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setNomeclatura(String nomeclatura) {
        this.nomeclatura = nomeclatura;
    }

    public void setTarja(String tarja) {
        this.tarja = tarja;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    public void setUnidades(float unidades) {
        this.unidades = unidades;
    }
    public void visualizar(){
        System.out.println("\n\n*********************************************************************");
        System.out.println("Medicamentos:");
        System.out.println("*********************************************************************");
        System.out.println("Cod: " + this.cod);
        System.out.println("Nomeclatura: " + this.nomeclatura);
        System.out.println("Posologia: " + this.posologia);
        System.out.println("Tarja: " + this.tarja);
        System.out.println("Unidades: " + this.unidades);

}
}
