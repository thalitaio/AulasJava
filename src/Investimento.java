/*
_ Calcule o retorno total de um investimento de R$ 5.000,00 durante 24 meses a uma taxa de juros de 2% ao mês.
  Utilize o laço FOR para imprimir o valor do retorno mês a mês.

 */



public class Investimento {
    public static void main(String args []){
        double invest = 5000.00;
        double newInvest = invest;

       for (int mes = 1; mes < 25; mes++){
           newInvest = (newInvest * 0.02) + newInvest;
           System.out.printf("Mes %d : %.2f \n", mes, newInvest);
       }

    }
}
