import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: \n");
        String nomeCliente = sc.nextLine();

        System.out.printf("Digite a agência: \n");
        String agencia = sc.nextLine();


        System.out.printf("Digite a sua conta: ");
        Integer conta = sc.nextInt();

        System.out.println("Digite o saldo: ");
        Float saldo = sc.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
        ",conta " +  conta + " e seu saldo "+ saldo + " já está disponível para saque");
        sc.close();
        }
}