import java.util.Scanner;

public class Produtos {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("================== Cadastro Produtos ============");
        System.out.println("Bem-vindo. Digite as informacoes do solicitadas.");
        System.out.print("Digite o nome do produto: ");
        String nome = sc.next();
        System.out.print("Digite uma breve descricao do produto: ");
        String descricao = sc.next();
        System.out.print("Digite o valor do produto: ");
        double valor = sc.nextDouble();
        System.out.print("Digite a categoria do produto: ");
        String categoria = sc.next();

        System.out.printf("Produto cadastrado com sucesso. Produto: %s -- Descricao: %s -- Valor: %f -- Categoria: %s", nome, descricao, valor, categoria);

    }
}
