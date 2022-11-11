package oo.composicao.heranca.desafio;

public class Carro {
    final int VELOCIDADE_MAXIMA;
    public int velocidadeAtual;
    private int delta = 5;

    protected Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }
    public void acelerar(){
        if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += getDelta();
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

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}