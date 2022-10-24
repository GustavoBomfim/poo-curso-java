package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.ano = 2022;

        var d2 = new Data(01, 03, 2001);

        String dataFormatada1 = d1.obterDataFormatada();

        System.out.println("A data 1 é: " + dataFormatada1);
        System.out.println("A data 2 é: " + d2.obterDataFormatada());

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();
    }
}
