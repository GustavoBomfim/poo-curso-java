package oo.composicao.heranca.desafio;

public class Carro {
    int velocidadeAtual;

    void acelerar(int aceleracao){
        velocidadeAtual += aceleracao;
    }

    // Validação para freiar o carro e a velocidade nao ficar negativa
    void freiar(int frenagem){
        if(velocidadeAtual > 0){
            velocidadeAtual -= frenagem;
        }
        else {

        }
    }
}
