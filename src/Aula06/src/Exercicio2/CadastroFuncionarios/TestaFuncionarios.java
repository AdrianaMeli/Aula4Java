package Exercicio2.CadastroFuncionarios;
import Exercicio2.model.Funcionarios;

public class TestaFuncionarios {
    public static void main(String[] args) {
        Funcionarios funcionario01 = new Funcionarios(1,"Adriana Nogueira","Desenvolvedor","Wheslley",15050);
        Funcionarios funcionario02 = new Funcionarios(2,"Andrea Nogueira","Tech Recruiter","Tereza",20502);

        funcionario02.visualizar();
        funcionario01.visualizar();

    }
}
