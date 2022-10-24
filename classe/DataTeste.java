package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 01;
        d1.mes = 03;
        d1.ano = 2001;

        var d2 = new Data();
        d2.dia = 15;
        d2.mes = 03;
        d2.ano = 2005;

        String dataFormatada1 = d1.obterDataFormatada();

        System.out.println("A data 1 é: " + dataFormatada1);
        System.out.println("A data 2 é: " + d2.obterDataFormatada());

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();
    }
}
