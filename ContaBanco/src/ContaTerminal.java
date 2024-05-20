import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta:");
        int numeroConta = sc.nextInt();

        System.out.print("Por favor, digite o número da Agência:");
        String agencia = sc.next();

        System.out.print("Por favor, digite o nome do Cliente:");
        String nomeCliente = sc.next();

        System.out.print("Por favor, digite o saldo da conta:");
        Double saldo = sc.nextDouble();
        System.out.println();

        System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponivel para saque!");

        sc.close();
    }
}
