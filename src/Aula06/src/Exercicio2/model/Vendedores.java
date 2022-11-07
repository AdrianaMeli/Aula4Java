package Aula06.src.Exercicio2.model;

public class Vendedores extends Funcionarios{

    private String departamento;



    public Vendedores(int id, String nome, String ocupacao, String gestor, float salario, String departamento) {
        super(id, nome, ocupacao, gestor, salario);

        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void visualizar() {
        super.visualizar();
        System.out.println("Departamento: " + this.departamento);
    }



}
