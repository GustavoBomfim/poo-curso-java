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

        System.out.printf("A data 1 é: %d/%d/%d \n", d1.dia, d1.mes, d1.ano);
        System.out.printf("A data 2 é: %d/%d/%d", d2.dia, d2.mes, d2.ano);
    }
}
