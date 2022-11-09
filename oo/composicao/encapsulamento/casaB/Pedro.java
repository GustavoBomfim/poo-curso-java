package oo.composicao.encapsulamento.casaB;

import oo.composicao.encapsulamento.casaA.Ana;

public class Pedro extends Ana {


    void testeAcessos(){
        // segredo;
        // facoDentroDeCasa;
        // formaDeFalar;
        // todosSabem;

        // não é possivel ver atributo privado
        // System.out.println(esposa.segredo);
        //System.out.println(mae.facoDentroDeCasa);
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);
    }


}
