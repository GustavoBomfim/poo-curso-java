package oo.composicao.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {

        //Carro carro = new Carro();
        Civic civic = new Civic();
        Ferrari ferrari = new Ferrari();

        System.out.println("Velocidade Ferrari: " + ferrari.velocidadeAtual);
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        System.out.println("Velocidade atual da Ferrari: " + ferrari.velocidadeAtual);

        ferrari.frear();
        ferrari.frear();
        System.out.println("Velocidade da Ferrari: " + ferrari.velocidadeAtual);

        //CIVIC
        civic.acelerar();
        civic.acelerar();
        System.out.println("Velocidade do civic: " + civic.velocidadeAtual);
        civic.frear();
        System.out.println("Velocidade do civic: " + civic.velocidadeAtual);


    }
}
