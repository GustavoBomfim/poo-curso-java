package classe;

public class Pessoa {
    String nome;
    double pesoInicial;

    double pesoAtual;

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.pesoInicial = peso;
        this.pesoAtual = peso;

    }

    void comer(double pesoComida){
        this.pesoAtual += pesoComida;
    }
}
