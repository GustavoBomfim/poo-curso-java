package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {

        System.out.println();

        List<Usuario> lista = new ArrayList<Usuario>();

        Usuario u1 = new Usuario("Ana");

        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3).nome); // acesar nome pelo índice

        System.out.println(">>>> " + lista.remove(1));
        System.out.println(lista.remove(new Usuario("Manu")));

        System.out.println("Tem? " + lista.contains(new Usuario("Lia")));


        for(Usuario u: lista){
            System.out.println(u.nome );
        }



    }
}
