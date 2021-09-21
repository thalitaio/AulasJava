/*
_ Leia dois valores do tipo double, digitados pelo usuário.
_ Realize a chamada para um método que faz a soma entre os dois números e retorna o resultado.
_ Realize a chamada para um método que faz a subtração entre os dois números e retorna o resultado.
_ Realize a chamada para um método que faz a multiplicação entre os dois números e retorna o resultado.
_ Realize a chamada para um método que faz a divisão entre os dois números e retorna o resultado.
_ O programa deve imprimir ao final da execução todas as operações realizadas e seus resultados.
_ Deve ser criado um novo repositório no github para a dupla e inserido o usuário maykondgranemann
  como colaborador.
_ Deve ser concluído e enviado para o repositório do github até às 18:00 do dia 21/09/2021.

 */

import java.util.Scanner;

public class aula_funcoes {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args []) {
        System.out.print("Digite o primeiro número: ");
        double valor1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double valor2 = sc.nextDouble();
        resultados(valor1, valor2);
    }

    // Operacoes
    static double soma ( double n1, double n2){
        double result = n1 + n2;
        return result;
    }
    static double subtracao ( double n1, double n2){
        double result = n1 - n2;
        return result;
    }
    static double multiplica ( double n1, double n2){
        double result = n1 * n2;
        return result;
    }
    static double divide ( double n1, double n2){
        double result = n1 / n2;
        return result;
    }

    static void resultados(double valor1, double valor2){
        System.out.println("Os resultados são: ");
        System.out.println(soma(valor1, valor2));
        System.out.println(subtracao(valor1, valor2));
        System.out.println(multiplica(valor1, valor2));
        System.out.println(divide(valor1, valor2));
    }
}
