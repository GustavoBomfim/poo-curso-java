package oo.composicao.heranca.teste;

import oo.composicao.heranca.Direcao;
import oo.composicao.heranca.Heroi;
import oo.composicao.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {
        Monstro monstro = new Monstro(10, 10);


        Heroi heroi = new Heroi(10, 11);

        System.out.println("A vida do monstro é: " + monstro.vida);
        System.out.println("A vida do heroi é: " + heroi.vida);


        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("A vida do monstro é: " + monstro.vida);
        System.out.println("A vida do heroi é: " + heroi.vida);

    }
}
