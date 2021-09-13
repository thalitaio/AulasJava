import java.util.Scanner;

public class Cliente {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("================== Cadastro Clientes ============");
        System.out.println("Bem-vinndo. Digite as informacoes do cliente.");
        System.out.print("Digite o nome do cliente: ");
        String nome = sc.next();
        System.out.print("Digite a idade do cliente: ");
        short idade = sc.nextShort();
        System.out.printf("O cliente %s de idade %d foi cadastrado com sucesso", nome, idade);

    }


}

