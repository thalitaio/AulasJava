package Modulo1;/* O programa deve realizar o cadastro de um dev e uma linguagem.
  O programa deve ter um cabeçalho com o nome do programa.
  O programa deve exibir um menu com as opções cadastrar dev, cadastrar linguagem e sair.
  Deve ser utilizado a estrutura SWITCH-CASE para decidir sobre a opção escolhida pelo usuário.
   O cadastro de dev deve solicitar o nome, sobrenome, senioridade e idade.
    O nome e sobrenome devem conter no mínimo 3 caracteres.
   A idade deve ser maior que 0.
   _ O programa deve realizar o cadastro de um dev e uma linguagem.
_ O programa deve ter um cabeçalho com o nome do programa.
_ O programa deve exibir um menu com as opções cadastrar dev, cadastrar linguagem e sair.
_ Deve ser utilizado a estrutura SWITCH-CASE para decidir sobre a opção escolhida pelo usuário.
_ O cadastro de dev deve solicitar o nome, sobrenome, senioridade e idade.
_ O nome e sobrenome devem conter no mínimo 3 caracteres.
_ A idade deve ser maior que 0.
 programa deve validar os dados assim que informado pelo usuário, caso o dado não atenda as regras de negócio,
 deve informar o usuário com uma mensagem de erro e solicitar que digite novamente. Após o cadastro e as
 validações o sistema deve imprimir o dados cadastrados.
*/


import java.util.Scanner;

public class CadastroAll {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================== Cadastro de Devs ================= ");
        System.out.println("================== Digite o numero correspondente à opção desejada ================= ");
        System.out.println("1 - Cadastrar Dev ");
        System.out.println("2 - Cadastrar Linguagem ");
        System.out.println("0 - Sair ");

        int escolha = sc.nextInt();
        sc.nextLine();

        switch (escolha) {
            case 1:

                boolean invalido = true;
                do {
                    System.out.println("Digite o nome do desenvolvedor: ");
                    String nome = sc.nextLine();
                    if (nome.length() < 3) {
                        System.out.println("O nome deve ter, no minimo, três (3) caracteres. ");
                    } else {
                        invalido = false;
                    }
                } while (invalido);


                invalido = true;

                do {
                    System.out.println("Digite o sobrenome do desenvolvedor ");
                    String sobrenome = sc.nextLine();
                    if (sobrenome.length() < 3) {
                        System.out.println("O sobrenome deve ter, no minimo, três (3) caracteres. ");
                    } else {
                        invalido = false;
                    }
                } while (invalido);


                invalido = true;

                while (invalido) {
                    System.out.println("Digite a senioridade do desenvolvedor: ");
                    String senioridade = sc.nextLine();
                    if (senioridade.length() < 3) {
                        System.out.println("A senioridade deve ter no mínimo, 3 dígitos.  ");
                    } else {
                        invalido = false;
                    }
                }
                while (invalido) ;

                invalido = true;

                do {
                    System.out.println("Digite a idade do dev: ");
                    int idade = sc.nextInt();
                    if (idade < 1) {
                        System.out.println("Modulo1.Idade invalida. Insira a sua idade novamente.  ");
                    } else {
                        invalido = false;
                    }
                } while (invalido);

                System.out.printf("Parabens, o dev foi cadastrado com sucesso!");
                break;


            case 2:
                invalido = true;
                do {
                    System.out.println("Digite o nome da linguagem ");
                    String nomeLing = sc.nextLine();
                    if (nomeLing.length() < 3) {
                        System.out.println("O nome da linguagem deve ter, no minimo, três (3) caracteres. ");
                    } else {
                        invalido = false;
                    }
                } while (invalido);


                invalido = true;

                do {
                    System.out.println("Digite a descricao da linguagem ");
                    String descricao = sc.nextLine();
                    if (descricao.length() < 3) {
                        System.out.println("A descricao da linguagem deve ter, no minimo, três (3) caracteres. ");
                    } else {
                        invalido = false;
                    }
                } while (invalido);


                invalido = true;

                System.out.println("================== Escolha a aplicacao a ser cadastrada ================= ");
                System.out.println("1 - Front-End ");
                System.out.println("2 - Back-End ");
                System.out.println("3 - Mobile ");

                int opcao = sc.nextInt();
                sc.nextLine();


                switch (opcao) {
                    case 1:
                        System.out.println("Opcao escolhida: Front-End. ");
                        break;
                    case 2:
                        System.out.println("Opcao escolhida: Back-End. ");
                        break;
                    case 3:
                        System.out.println("Opcao escolhida: Mobile. ");
                        break;
                    default:
                        System.out.println("Opcao invalida. Digite uma opcao valida. ");
                        opcao = sc.nextInt();
                        do{
                            if (opcao > 3) {
                                System.out.println("Digite novamente: ");
                                opcao = sc.nextInt();
                                sc.nextLine();
                            } else {
                                System.out.println("Cadastro realizado com sucesso!");
                                invalido = false;
                            }
                        }while (invalido);

                        System.out.printf("Parabens, a linguagem foi cadastrado!");
                }
                break;

                    case 0:
                    System.out.println("Fim do programa. ");
                    break;
                    default:
                        System.out.println("Opcao invalida. ");
                        break;


                }
        }
    }




