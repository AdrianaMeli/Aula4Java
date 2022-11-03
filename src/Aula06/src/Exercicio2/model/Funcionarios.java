package Exercicio2.model;

public class Funcionarios {
    private int id;
    private String nome;
    private String ocupacao;
    private String gestor;
    private float salario;

    public Funcionarios(int id, String nome, String ocupacao, String gestor, float salario) {
        this.id = id;
        this.nome = nome;
        this.ocupacao = ocupacao;
        this.gestor = gestor;
        this.salario = salario;
    }

    public int id() {
        return id;
    }

    public String nome() {
        return nome;
    }

    public String ocupacao() {
        return ocupacao;
    }

    public String gestor() {
        return gestor;
    }

    public float salario() {
        return salario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public void setGestor(String gestor) {
        this.gestor = gestor;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


    public void visualizar() {
        System.out.println("\n\n*********************************************************************");
        System.out.println("Dados do Funcionario:");
        System.out.println("*********************************************************************");
        System.out.println("Id da Funcionario: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Ocupação: " + this.ocupacao);
        System.out.println("Gestor: " + this.gestor);
        System.out.println("Salario: " + this.salario);

    }
}


