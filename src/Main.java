import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static CalculoTempo tempo = new CalculoTempo();
    //private static ValidarAposentadoria validacao = new ValidarAposentadoria();

    public static void main(String[] args) {

        System.out.println("Informe o código do colaborador:");
        int cod = scan.nextInt();

        System.out.println("Informe o nome do colaborador: ");
        String nome = scan.next();

        System.out.println("Informe o ano de Nascimento do colaborador");
        int anoNascimento = scan.nextInt();

        System.out.println("Informe o ano que o colaborador entrou na empresa: ");
        int anoEntradaEmpresa = scan.nextInt();

        int idade = tempo.calculoIdade(anoNascimento);
        int tempoTrabalho = tempo.calculoTempoTrabalho(anoEntradaEmpresa);
        String aposentadoria = ValidarAposentadoria.validacao(idade, tempoTrabalho);

        System.out.printf("O colaborador %s , código %d, tem %d anos. Trabalhou %d anos e %s", nome, cod, idade, tempoTrabalho, aposentadoria);
    }
}