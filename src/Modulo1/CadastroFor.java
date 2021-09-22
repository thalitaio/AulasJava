package Modulo1;

import java.util.Scanner;

public class CadastroFor {
    public static void main (String[] args) {
        for(int cont = 1; cont < 5; cont++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite o sobrenome: ");
            String sobrenome = sc.nextLine();
            System.out.printf("Usuario %d : %s foi cadastrado. Cadastre mais um amigo. \n",cont, nome);
        }
        System.out.printf("Parabéns. Cadastro finalizado.");
    }
}
