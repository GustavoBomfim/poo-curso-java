package oo.composicao.polimorfismo;

public class Alimento {
    protected double peso;

     public Alimento(double peso){
         setPeso(peso);
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
       this.peso = peso;
    }
}
