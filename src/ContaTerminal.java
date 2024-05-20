import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o número da Agência !");
            String agenciaNumero = scanner.next();

            System.out.println("Digite o numero da sua conta!");
            int contaNumero = scanner.nextInt();

            System.out.println("Qual valor vai por na conta ?");
            double  saldoConta = scanner.nextDouble();

            System.out.println("Qual o seu nome ?");
            String nomeCliente = scanner.next();

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaNumero + " , conta " + contaNumero + " e seu saldo " + saldoConta + " já está disponível para saque");
        }

    }

}
