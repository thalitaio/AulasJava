import java.util.Scanner;

public class CadastroWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("================== Cadastro de Clientes ================= ");
        System.out.println("================== Digite o numero correspondente à opção desejada ================= ");
        System.out.println("1 - Cadastrar Cliente ");
        System.out.println("2 - Listar Cliente ");
        System.out.println("3 - Sair ");

        int escolha = sc.nextInt();
        sc.nextLine();

        switch (escolha){
            case 1:

                boolean invalido = true;
                do {
                    System.out.println("Digite o nome do cliente: ");
                    String nome = sc.nextLine();
                    if (nome.length() < 3) {
                        System.out.println("O nome deve ter, no minimo, três (3) caracteres. ");
                    } else {
                        invalido = false;
                    }
                } while (invalido) ;



                invalido = true;

                do {
                    System.out.println("Digite o sobrenome do cliente ");
                    String sobrenome = sc.nextLine();
                    if (sobrenome.length() < 3) {
                        System.out.println("O sobrenome deve ter, no minimo, três (3) caracteres. ");
                    } else {
                        invalido = false;
                    }
                } while (invalido) ;


                invalido = true;

                while(invalido) {
                    System.out.println("Digite o rg do cliente: ");
                    String rg = sc.nextLine();
                    if (rg.length() < 4) {
                        System.out.println("O rg deve conter, no mínimo, 4 dígitos.  ");
                    } else {
                        invalido = false;
                    }
                } while (invalido) ;

                invalido = true;

                do {
                    System.out.println("Digite o cpf do cliente: ");
                    String cpf = sc.nextLine();
                    if (cpf.length() < 11) {
                        System.out.println("O cpf deve conter, no mínimo, 11 dígitos.  ");
                    } else {
                        invalido = false;
                    }
                } while (invalido) ;

                System.out.printf("Parabens, o cliente foi cadastrado com sucesso!");
            break;
            case 2:
                System.out.println("Listar clientes. ");
                break;
            case 3:
                System.out.println("Fim do programa. ");
                break;
            default:
                System.out.println("Opcao invalida. ");
                break;
        }
    }
}

