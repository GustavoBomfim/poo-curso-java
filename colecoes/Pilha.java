package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<String>();

        livros.add("O Pequeno Príncipe");
        livros.push("Don Quixote");
        livros.push("O hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        for(String livro: livros){
            System.out.println(livro);
        }

        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());

    }
}
