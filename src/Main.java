import java.util.Scanner;


public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("O nome e sobrenome digitados foram: " + nome + " " + sobrenome);
    }
}
