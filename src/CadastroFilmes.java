import java.util.Scanner;

public class CadastroFilmes {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("================== Cadastro de Filmes, Series e Documentarios ================= ");
        System.out.println("================== Digite o numero correspondente a opcao desejada =================");
        System.out.println("1 - Cadastrar filme ");
        System.out.println("2 - Cadastrar serie ");
        System.out.println("3 - Cadastrar documentario ");
        System.out.println("4 - Sair ");

        int escolha = sc.nextInt();
        switch (escolha){
            case 1:
                System.out.println("Digite o nome do filme: ");
                String nome = sc.nextLine();
                sc.nextLine();
                System.out.println("Digite a descricao do filme: ");
                String descricao = sc.nextLine();
                System.out.println("Digite o genero do filme: ");
                String genero = sc.nextLine();
                System.out.println("Digite o ano do filme: ");
                int ano = sc.nextInt();
                System.out.printf("Parabens, o filme %s foi cadastrado com sucesso!" ,nome);
                break;
            case 2:
                System.out.println("Digite o nome da serie: ");
                String nomeserie = sc.nextLine();
                sc.nextLine();
                System.out.println("Digite o ano de lancamento da serie: ");
                int anoserie = sc.nextInt();
                System.out.println("Digite a produtora da serie: ");
                String produtora = sc.next();
                System.out.printf("Parabens, a serie %s foi cadastrada com sucesso!" ,nomeserie);
                break;
            case 3:
                System.out.println("Digite o nome do documentario: ");
                String nomedoc = sc.nextLine();
                sc.nextLine();
                System.out.println("Digite o ano de lancamento do documetario: ");
                int anodoc = sc.nextInt();
                System.out.println("Digite o tema do documentario: ");
                String tema = sc.next();
                System.out.printf("Parabens, o documentario %s foi cadastrado com sucesso!" ,nomedoc);
                break;
            case 4:
                System.out.println("Fim do programa.");
                break;
            default:
                System.out.println("Opcao invalida. ");
                break;
        }
}
}
