package oo.composicao.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Civic civic = new Civic();
        Ferrari ferrari = new Ferrari();

        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        System.out.println("Velocidade da Ferrari: " + ferrari.velocidadeAtual);

        ferrari.freiar();
        ferrari.freiar();
        System.out.println("Velocidade da Ferrari: " + ferrari.velocidadeAtual);

        //CIVIC
        civic.acelerar();
        civic.acelerar();
        System.out.println("Velocidade do civic: " + civic.velocidadeAtual);
        civic.freiar();
        System.out.println("Velocidade do civic: " + civic.velocidadeAtual);


    }
}
