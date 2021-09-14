import java.util.Scanner;

public class Idade {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("================== Cadastro ============");
        System.out.print("Digite o seu nome: ");
        String nome = sc.next();
        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = sc.next();
        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();
        if (idade >= 18){
            System.out.printf("Parabens, %s %s. voce tem %d anos e pode se cadastrar.", nome, sobrenome, idade);
        } else {
            System.out.printf("Lamentamos, %s %s. Voce tem %d anos e nao pode se cadastrar.", nome, sobrenome, idade);
        }
    }
}
