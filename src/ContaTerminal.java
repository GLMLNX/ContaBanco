import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);
       System.out.println("Por favor, digite o seu Nome !");
       String nome=input.nextLine();
       System.out.println("Por favor, digite o número da Conta !");
       int conta=input.nextInt();
       System.out.println("Por favor, digite o seu Saldo !");
       double saldo=input.nextDouble();
       System.out.println("Por favor, digite o número da Agência !");
       String agencia=input.next();
       System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque.");
    }
}
