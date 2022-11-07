package Aula06.src.Exercicio04.model;

import Aula06.src.Exercicio04.Farmacia.CadastroMedicamentos;
import Aula06.src.Exercicio04.Farmacia.CadastroPerfumaria;
import Aula06.src.Exercicio04.Farmacia.Farmacia;

public class TestFarmacia {

    public static void main(String[] args) {

        Farmacia medicamentos01 = new Farmacia(8,"dipirona","vermelha","1x ao dia",8);
        Farmacia medicamentos02 = new Farmacia(10,"calamed","sem tarja","1x ao dia",20);
        medicamentos02.visualizar();
        medicamentos01.visualizar();

        CadastroMedicamentos venlafaxina = new CadastroMedicamentos(1,"Velafaxina","vermelha","1x ao dia",5,55);
        CadastroMedicamentos tylenol = new CadastroMedicamentos(2,"Tylenol","s/taja","4 em 4 horas",5, 30);
        venlafaxina.visualizar();
        tylenol.visualizar();

        CadastroPerfumaria centaphil = new CadastroPerfumaria(3,"centaphil","s/tarja", "s/h",5,200);
        CadastroPerfumaria aussie = new CadastroPerfumaria(5,"aussie","s/tarja", "s/h",20,240);

        centaphil.visualizar();
        aussie.visualizar();
        }


    }


