package oo.composicao.encapsulamento.casaB;

import oo.composicao.encapsulamento.casaA.Ana;

public class Julia {

    void testeAcessos(){
        // segredo;
        // facoDentroDeCasa;
        // formaDeFalar;
        // todosSabem;

        Ana sogra = new Ana();

        // não é possivel ver atributo privado
        // System.out.println(sogra.segredo);
        //System.out.println(sogra.facoDentroDeCasa);
        //System.out.println(sogra.formaDeFalar);
        System.out.println(sogra.todosSabem);
    }
}
