/*
_ Deve exibir um menu onde o usuário pode escolher números pares, números ímpares, números primos, calculo de juros compostos e sair.
_ Na opção de números pares, o usuário poderá digitar um valor e o sistema exibirá todos os números pares de zero até o valor que o usuário digitou.
_ Na opção de números ímpares, o usuário deverá digitar um valor e o sistema exibirá todos os números ímpares de zero até o valor digitado pelo usuário.
_ Na opção dos números primos, o sistema deve solicitar que o usuário digite um número e dizer quais são os números primos de zero ao valor digitado
  pelo usuário.
_ Para o calculo do juros, o sistema deve solicitar ao usuário que digite o valor do investimento, o prazo e a taxa de juros mensal.
  O sistema deve imprimir o retorno mês a mês e o montante para resgate ao final do prazo.
_ O programa deve validar os dados inseridos, não permitindo valores negativos.
_ Deve ser criado um novo repositório no github para a dupla e inserido o usuário maykondgranemann como colaborador.

 */

import java.util.Scanner;

public class ThalitaeDenise {
    public static void main(String args []){

        Scanner sc = new Scanner(System.in);
        System.out.print("=== BEM VINDE ===\n1 - Para números pares\t|\t2 - Para números ímpares\t|\t3 - Para números primos\t|\t" +
                "4 - Para calcular juros compostos\t|\t5 - Sair\nDigite a opção desejada: ");

        char menu = sc.next().charAt(0);
        while (menu != '1' && menu != '2' && menu != '3' && menu != '4' && menu != '5'){
            System.out.print("Opção inválida. Digite novamente: ");
            menu = sc.next().charAt(0);
        }

        int entrada = 0;

        switch (menu){
            case '1':
                System.out.print("=== NÚMEROS PARES ===\nInforme um valor: ");
                entrada = sc.nextInt();
                while (entrada < 0){
                    System.out.print("Valor inválido. Digite novamente: ");
                    entrada = sc.nextInt();
                }
                for (int i = 0; i <= entrada; i++){
                    if (i % 2 == 0){
                        System.out.printf("%d \t|\t", i);
                    }
                }
                break;
            case '2':
                System.out.print("=== NÚMEROS IMPARES ===\nInforme um valor: ");
                entrada = sc.nextInt();
                while (entrada < 0){
                    System.out.print("Valor inválido. Digite novamente: ");
                    entrada = sc.nextInt();
                }
                for (int i = 0; i <= entrada; i++){
                    if (i % 2 == 1){
                        System.out.printf("%d \t|\t", i);
                    }
                }
                break;
            case '3':
                System.out.print("=== NÚMEROS PRIMOS ===\nInforme um valor: ");
                entrada = sc.nextInt();
                while (entrada < 0){
                    System.out.print("Opção inválida. Digite novamente. ");
                    entrada = sc.nextInt();
                }
                for(int i = 2; i < entrada; i++){
                    boolean primo = true;
                    for( int p = 2; p < i; p++ ){
                        if(i % p == 0){
                            primo = false;
                        }
                    }
                    if(primo){
                        System.out.print( i + " é primo" );
                    }
                }
                break;
            case '4':
                double invest = 0.0;
                int prazo = 0;
                double taxa = 0.0;
                double newInvest = invest;
                double acresMes = 0.0;

                System.out.println("Digite o valor inicial: R$ ");
                invest = sc.nextDouble();
                while (invest <= 0){
                    System.out.print("V=R$ ");
                    invest = sc.nextDouble();
                }

                System.out.println("Digite a taxa mensal (%): ");
                taxa = sc.nextDouble();
                while (taxa <= 0){
                    System.out.print("Valor inválido. Digite novamente: ");
                    taxa = sc.nextDouble();
                }

                System.out.print("Digite o prazo de investimento em meses: ");
                prazo = sc.nextInt();
                while (prazo <= 0){
                    System.out.print("Valor inválido. Digite novamente: ");
                    prazo = sc.nextInt();
                }

                double taxaPercent = taxa / 100;

                for (int mes = 0; mes < prazo; mes++){
                    acresMes = invest * taxaPercent;
                    invest += acresMes;
                    System.out.printf("Mes %d : R$ %.2f \n", mes + 1, invest);
                }
                break;
            case '5':
                System.out.print("=== FIM DO PROGRAMA ===");
                break;
        }
    }
}
