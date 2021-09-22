import java.util.Scanner;

public class Cadastro_dev {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cabecalho();
        escolha_menu();
    }

    static void cabecalho() {
        System.out.println("=============================CADASTRO DEV CAP===================================");
        System.out.println("------------Bem vindo ao cadastro de desenvolvedores da Capgemini----------------");
    }

    static void imprime_menu() {
        System.out.println("Menu");
        System.out.println(" \n 1-Cadastrar Dev \n 2-Cadastro de linguagem \n 3-Sair");
    }

    static int escolha_menu(){
        boolean validacao = true;

        System.out.println("Menu");
        System.out.println(" \n 1-Cadastrar Dev \n 2-Cadastro de linguagem \n 3-Sair");

        int opcao = sc.nextInt();
        String opcaoNome = "";
        String opcaoSobrenome = "";
        int idade ;
        int senioridade;

        String nomeLinguagem, descricaoLinguagem;
        int aplicLinguagem;


        switch (opcao) {
            case 1:
                 opcaoNome = cadastro_nome();
                 opcaoSobrenome = cadastro_sobrenome();
                 idade = cadastro_idade();
                 senioridade = cadastro_senioridade();
                System.out.print("\n------------Cadastrado com sucesso----------------\n");
                System.out.printf(" Nome: %s \n Sobrenome: %s \n Idade: %d Código da Senioridade: %d." , opcaoNome, opcaoSobrenome, idade, senioridade);
                break;
            case 2:
                nomeLinguagem = cadastro_linguagem();
                descricaoLinguagem = descricao_linguagem();
                aplicLinguagem = aplicacaoLinguagem();
                System.out.print("\n------------Cadastrado com sucesso----------------\n");
                System.out.printf(" Nome da linguagem: %s \n Descrição: %s \n Código da Aplicação da Linguagem: %d." , nomeLinguagem, descricaoLinguagem, aplicLinguagem);
                break;
            case 3:
                System.out.printf("------------Saindo----------------");
        }
        return opcao;
    }

    static String cadastro_nome(){
        boolean validacao = true ;
        String nome;
        do{
            System.out.print("Informe o nome Desenvolvedor:");
            nome = sc.next();
            if(nome.length() < 3){
                System.out.println("O nome cadastrado deve ter no mínimo três caracteres");
                System.out.println("Digite novamente\n");
            }else{
                validacao = false;
            }
        }while(validacao);
        return nome;
    }

    static String cadastro_sobrenome(){
        String sobrenome = "";
        boolean validacao = true;
;
        do{
            System.out.print("Informe o sobrenome do Desenvolvedor:");
            sobrenome = sc.next();
            if(sobrenome.length() < 3){
                System.out.println("O sobrenome cadastrado deve ter no mínimo três caracteres");
                System.out.println("Digite novamente \n");
            }else{
                validacao = false;
            }
        }while(validacao);

        return sobrenome;
    }
    static int cadastro_idade(){
        int idade;
        boolean validacao = true;

        do{
            System.out.print("Informe a idade do Desenvolvedor:");
            idade = sc.nextInt();
            if(idade <= 0){
                System.out.println("A idade cadastrada deve ser superior a zero");
                System.out.println("Digite novamente \n");
            }else{
                validacao = false;
            }
        }while(validacao);
        return idade;
    }

    static int cadastro_senioridade(){
        boolean validacao = true;

        System.out.println("Informe o nível de senioridade");
        System.out.println("1 - Junior ");
        System.out.println("2 - Pleno ");
        System.out.println("3 - Senior ");

        int opcao = sc.nextInt();
        sc.nextLine();


        switch (opcao) {
            case 1:
                System.out.println("Opcao escolhida: Junior. ");
                break;
            case 2:
                System.out.println("Opcao escolhida: Pleno. ");
                break;
            case 3:
                System.out.println("Opcao escolhida: Senior. ");
                break;
            default:
                System.out.print("Opcao invalida. Digite uma opcao valida: ");
                opcao = sc.nextInt();
                do{
                    if (opcao > 3) {
                        System.out.println("Digite novamente: ");
                        opcao = sc.nextInt();
                        sc.nextLine();
                    } else {
                        System.out.println("Cadastro realizado com sucesso!");
                        validacao = false;
                    }
                }while (validacao);

                System.out.printf("Parabens, a linguagem foi cadastrado!");
        }
        return opcao;
    }
    static void msgSucesso(){
        System.out.printf("Parabens, dev cadastrado!");
        System.out.printf(" \n %s \n %s \n %s \n %d", cadastro_nome(), cadastro_sobrenome(), cadastro_idade(), cadastro_senioridade());
    }

    // ===== função cadastro linguagem =====
    static String cadastro_linguagem(){
        System.out.print("Digite o nome da linguagem: ");
        String linguagem = sc.nextLine();
        sc.nextLine();
        return linguagem;
    }

    // ===== função descrição linguagem ====
    static String descricao_linguagem(){
        System.out.print("Digite a descrição da linguagem: ");
        String desc_linguagem = sc.nextLine();
        return desc_linguagem;
    }

    // função aplicação da linguagem: frontend, backend, mobile

    static int aplicacaoLinguagem(){
        boolean validacaoLinguagem = true;

        System.out.print("\n1 - Frontend \n2 - Backend \n3 - Mobile\nEscolha a aplicação:");
        int opcaoApl = sc.nextInt();

        switch(opcaoApl){

            case 1:
                System.out.print("Opcao escolhida: Frontend.");
                break;
            case 2:
                System.out.print("Opcao escolhida: Backend.");
                break;
            case 3:
                System.out.print("Opcao escolhida: Mobile.");
                break;
            default:
                System.out.print("Opcao invalida. Digite uma opcao valida: ");
                opcaoApl = sc.nextInt();
                do{
                    if (opcaoApl > 3) {
                        System.out.println("Digite novamente: ");
                        opcaoApl = sc.nextInt();
                        sc.nextLine();
                    } else {
                        System.out.println("Cadastro realizado com sucesso!");
                        validacaoLinguagem = false;
                    }
                }while (validacaoLinguagem);
        }
        return opcaoApl;
    }






}