package oo.composicao.heranca.desafio;

public class Ferrari extends Carro{

    @Override
    void acelerar() {
        velocidadeAtual += 20;
    }
    Ferrari(){
        super(200);
    }
}
