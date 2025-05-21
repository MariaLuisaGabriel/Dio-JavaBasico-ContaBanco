import java.util.Locale;
import java.util.Scanner;

/*
* OBSERVAÇÃO!!!
* Para manter a main como estática e poder usar atributos não estáticos na ContaTerminal,
* separei os dois e fiz uma instância da classe ContaTerminal em troca, deixando a parte de leitura na main, e
* a resposta na classe Conta Terminal
* */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);//para permitir ler '.' em vez de ',' no meu IntelliJ

        System.out.println("Digite o número da agência: ");

        String agencia = sc.nextLine();

        System.out.println("Digite o seu nome: ");

        String nomeCliente = sc.nextLine();

        System.out.println("Digite o número da sua conta: ");

        int numero = sc.nextInt();

        System.out.println("Digite o saldo: ");

        Double saldo = sc.nextDouble();

        ContaTerminal ct = new ContaTerminal(numero, nomeCliente, agencia, saldo);
        ct.printScanned();
    }
}
