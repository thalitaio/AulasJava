package Modulo1;/*
_ Armazene o seu nome completo em duas variáveis, nome e sobrenome
_ Imprima seu nome 10 vezes no terminal com a função PRINTF usando o laço de repetição while
  utilizando uma variável contadora.
_ Recrie o passo anterior feito com WHILE agora com o laço FOR.

 */


import java.util.Scanner;

/*public class Modulo1.ForWhileEx {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite o sobrenome: ");
        String sobrenome = sc.nextLine();

        int cont = 1;
        while(cont < 11) {
            System.out.printf("%s %s. \n",nome, sobrenome);
            cont++;
        }
    }
}
*/

public class ForWhileEx {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite o sobrenome: ");
        String sobrenome = sc.nextLine();

        for(int cont = 1; cont < 11; cont++) {
            System.out.printf("%s %s. \n",nome, sobrenome);
        }
    }
}

