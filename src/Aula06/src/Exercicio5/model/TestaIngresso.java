package Exercicio5.model;

import Ingresso.Ingressos;

public class TestaIngresso {
    public static void main(String[] args) {
        Ingressos ingressos01 = new Ingressos("Panico",252,"terror","maior de 18",15);
        Ingressos ingressos02 = new Ingressos("Como se fosse a primeira vez.",3205,"Romance","livre",20);

        ingressos02.visualizar();
        ingressos01.visualizar();

    }

}


