import java.util.Scanner;

public class CadastroFor {
    public static void main (String[] args) {
        for(int cont = 0; cont < 4; cont++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite o sobrenome: ");
            String sobrenome = sc.nextLine();
            System.out.printf("%s foi cadastrado. Cadastre mais um amigo. \n", nome);
        }
        System.out.printf("Parabéns. Cadastro finalizado.");
    }
}
