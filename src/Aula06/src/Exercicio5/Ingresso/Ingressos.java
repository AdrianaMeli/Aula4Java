package Ingresso;

public class Ingressos {
        private String evento;
        private int numeroticket;
        private String tipo;
        private  String faixaEtaria;
        private double valor;
    
        public Ingressos(String evento, int numeroticket, String tipo, String faixaEtaria, double valor) {
            this.evento = evento;
            this.numeroticket = numeroticket;
            this.tipo = tipo;
            this.faixaEtaria = faixaEtaria;
            this.valor = valor;
        }
    
        public String evento() {
            return evento;
        }
    
        public int numeroticket() {
            return numeroticket;
        }
    
        public String tipo() {
            return tipo;
        }
    
        public String faixaEtaria() {
            return faixaEtaria;
        }
    
        public double valor() {
            return valor;
        }
    
        public void setEvento(String evento) {
            this.evento = evento;
        }
    
        public void setNumeroticket(int numeroticket) {
            this.numeroticket = numeroticket;
        }
    
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    
        public void setFaixaEtaria(String faixaEtaria) {
            this.faixaEtaria = faixaEtaria;
        }
    
        public void setValor(double valor) {
            this.valor = valor;
        }
        public void visualizar(){
            System.out.println("\n\n*********************************************************************");
            System.out.println("Dados do Funcionario:");
            System.out.println("*********************************************************************");
            System.out.println("Numero do ticket: " + this.numeroticket);
            System.out.println("Nome do  Filme : " + this.evento);
            System.out.println("Tipo de filme: " + this.tipo);
            System.out.println("Faixa etaria: " + this.faixaEtaria);
            System.out.println("Valor do Ingresso: " + this.valor);
    
        }
    
    }