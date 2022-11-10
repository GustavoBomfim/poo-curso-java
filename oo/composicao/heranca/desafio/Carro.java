package oo.composicao.heranca.desafio;

public class Carro {
    final int VELOCIDADE_MAXIMA;
    public int velocidadeAtual;
    int delta = 5;

    protected Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }
    public void acelerar(){
        if(velocidadeAtual + delta > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += delta;
        }

    }

    // Validação para freiar o carro e a velocidade nao ficar negativa
    public void frear(){
        if(velocidadeAtual >= 5){
            velocidadeAtual -= 5;
        }
        else {
            velocidadeAtual = 0;
        }
    }
}
