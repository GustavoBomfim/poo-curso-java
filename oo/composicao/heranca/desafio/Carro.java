package oo.composicao.heranca.desafio;

public class Carro {
    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
    int delta = 5;

    Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }
    void acelerar(){
        if(velocidadeAtual + delta > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += delta;
        }

    }

    // Validação para freiar o carro e a velocidade nao ficar negativa
    void frear(){
        if(velocidadeAtual >= 5){
            velocidadeAtual -= 5;
        }
        else {
            velocidadeAtual = 0;
        }
    }
}
