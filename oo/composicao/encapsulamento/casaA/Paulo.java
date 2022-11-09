package oo.composicao.encapsulamento.casaA;

public class Paulo {

    Ana esposa = new Ana();

    void testeAcessos(){
        // segredo;
        // facoDentroDeCasa;
        // formaDeFalar;
        // todosSabem;

        // não é possivel ver atributo privado
        // System.out.println(esposa.segredo);
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todosSabem);
    }
}
