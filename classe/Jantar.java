package classe;

public class Jantar {

    public static void main(String[] args) {

        Comida c1 = new Comida("Banana", 0.230);

        Comida c2 = new Comida("Granola", 0.080);

        Pessoa p1 = new Pessoa("Carlos", 80.0);

        p1.comer(c1.pesoComida);
        p1.comer(c2.pesoComida);

        System.out.println("\n" + p1.nome + " pesava: " +p1.pesoInicial + "kg antes do jantar. E agora pesa: " + p1.pesoAtual + "kg ");



    }
}
