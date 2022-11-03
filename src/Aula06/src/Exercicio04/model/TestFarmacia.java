package Exercicio04.model;

import Exercicio04.Farmacia.Farmacia;

public class TestFarmacia {
    public static void main(String[] args) {
        Farmacia farmacia01 = new Farmacia(1,"Venlafaxina","Vermelha","1 ao dia",25);
        Farmacia farmacia02 = new Farmacia(2,"Rivotril","Preta","1 a noite",30);

        farmacia01.visualizar();
        farmacia02.visualizar();

    }
}


