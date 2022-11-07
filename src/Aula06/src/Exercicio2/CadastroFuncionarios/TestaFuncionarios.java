package Aula06.src.Exercicio2.CadastroFuncionarios;

import Aula06.src.Exercicio2.model.Funcionarios;
import Aula06.src.Exercicio2.model.Gerente;
import Aula06.src.Exercicio2.model.Vendedores;

public class TestaFuncionarios {
    public static void main(String[] args) {
        Funcionarios funcionario01 = new Funcionarios(1,"Adriana Nogueira","Desenvolvedor","Wheslley",15050);
        Funcionarios funcionario02 = new Funcionarios(2,"Andrea Nogueira","Tech Recruiter","Tereza",20502);

        funcionario02.visualizar();
        funcionario01.visualizar();


        Gerente gerente01 = new Gerente(5, "Samuel", "tech Lead","Wheslley",5000, 5);
        Gerente gerente21 = new Gerente(9, "Emerson", "Coordenador ","Adriana",8000, 12);

        gerente01.visualizar();
        gerente21.visualizar();

        Vendedores vendedor01 = new Vendedores(7,"Claudia","vendedor", "Wheslley",13000, "vendas software");
        Vendedores vendedor02 = new Vendedores(15,"Alexia","vendedor", "Adriana",11000, "vendas mercadopago");

        vendedor01.visualizar();
        vendedor02.visualizar();

    }
}
