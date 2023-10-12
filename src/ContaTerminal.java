import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class ContaTerminal {


    //desafio dio
    
    private int numero;
    private String nomeCliente, agencia;
    private double saldo;

    public ContaTerminal() {
    }

    Scanner conta = new Scanner(System.in);

    Random random = new Random();

    public void inserirDados() {

        this.numero = random.nextInt(100); // Gera um número aleatório
        this.saldo = random.nextDouble() * 1000;

        // Formata o saldo com 4 casas decimais
        DecimalFormat df = new DecimalFormat("#,####");
        String saldoFormatado = df.format(this.saldo);
        this.saldo = Double.parseDouble(saldoFormatado);

        System.out.print("Insira seu Nome :");
        nomeCliente = conta.next();
        System.out.print("Insira sua Agencia :");
        agencia = conta.next();

    }

    public void imprime() {
        System.out.print("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco" +
                ", sua agência é " + agencia + ", conta " + numero +
                ", e seu saldo " + saldo + " já está disponível para saque");
    }

    public static void main(String[] args) {

        ContaTerminal contaTerminal = new ContaTerminal();
        contaTerminal.inserirDados();
        contaTerminal.imprime();

    }
}