package Aula06.src.Exercicio04.model;

import Aula06.src.Exercicio04.Medicamentos.CadastroMedicamentos;

public class TestFarmacia {

    public static void main(String[] args) {

        CadastroMedicamentos venlafaxina = new CadastroMedicamentos(
                2,
                "Venalfaxina",
                15
        );    CadastroMedicamentos tylenol = new CadastroMedicamentos(
                3,
                "Tylenol",
                10
        );
        venlafaxina.visualizar();
        tylenol.vizualizar();


        }


    }

