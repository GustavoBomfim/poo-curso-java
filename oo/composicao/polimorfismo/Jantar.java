package oo.composicao.polimorfismo;

public class Jantar {
    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(99.65);

        Arroz ingrediente1 = new Arroz();
        Feijao ingrediente2 = new Feijao();

        Sorvete sobremesa = new Sorvete();

        // PESO INICIAL
        System.out.println("Peso Inicial do convidado: " + convidado.getPeso());

        // PESO PÓS ALMOÇO
        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        System.out.println("Peso do Convidado após o almoço: " + convidado.getPeso());


        // PESO PÓS SOBREMESA
        convidado.comer(sobremesa);
        System.out.println("Peso do Convidado após a sobremes: " + convidado.getPeso());

    }
}
