package Aula06.src.Exercicio2.model;

public class Gerente  extends Funcionarios {

    private int funcionariosGerenciados;

    public Gerente(int id, String nome, String ocupacao, String gestor, float salario, int funcionariosGerenciados) {
        super(id, nome, ocupacao, gestor, salario);

        this.funcionariosGerenciados = funcionariosGerenciados;
    }

    public int FuncionariosGerenciados() {
        return funcionariosGerenciados;
    }

    public void setFuncionariosGerenciados(int FuncionariosGerenciados) {
        this.funcionariosGerenciados = funcionariosGerenciados;
    }

    public void visualizar() {
        super.visualizar();
        System.out.println("Número de Funcionários Gerenciados: " + this.funcionariosGerenciados);
    }



}