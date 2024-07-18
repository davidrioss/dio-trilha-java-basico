import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO: conhecer e importar a classe Scanner
        //exibir as mensagens para o nosso usuario
        //Obter pela Scanner os valores digitados no terminal
        //Exibir a mensagem conta criada


        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //solicitando entradas do cliente
        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o Nome do Cliente !");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o valor inicial do Saldo !");
        double saldo = scanner.nextDouble();


        //exibindo mensagem da conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero +" e seu saldo " + saldo +" já está disponível para saque");


    }
}
