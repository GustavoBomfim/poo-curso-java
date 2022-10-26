package arrays;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas notas você quer armazenar? ");
        int qntdNotas = sc.nextInt();

        double[] notas = new double[qntdNotas];

        for(int i = 0; i < qntdNotas; i++){
            System.out.printf("Digite a nota %d: ", i + 1);
            notas[i] = sc.nextDouble();
        }

        System.out.println();

        double media = 0.0;

        for(double nota: notas){
            media += nota / qntdNotas;
        }

        System.out.println("A média do aluno é: " + media);
    }
}
