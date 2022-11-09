package oo.composicao.heranca.desafio;

public class Ferrari extends Carro{

    @Override
    public void acelerar() {
        velocidadeAtual += 20;
    }
    public Ferrari(){
        super(200);
    }
}
