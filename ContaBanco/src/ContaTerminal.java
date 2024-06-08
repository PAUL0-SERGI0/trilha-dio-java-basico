import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela classe scanner os valores digitados no terminal

        //Exibir a mensagem da conta criada

        System.out.println("Por favor, digite o número da sua conta.");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite a sua agência.");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome.");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digie o seu sobrenome.");
        String sobrenome = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo.");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome +", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numero +" e o seu saldo de R$:" + saldo + " já está disponível para saque." );
    }
}
