import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao1010 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat doisDigitos = new DecimalFormat("#.00"); // formata o num decimal
        int code1 = scanner.nextInt(); // linha um
        int valorInt1 = scanner.nextInt();
        double valorDouble1 = scanner.nextDouble(); // final linha um
        int code2 = scanner.nextInt(); // linha 2
        int valorInt2 = scanner.nextInt();
        double valorDouble2 = scanner.nextDouble(); // final linha 2
        double valorProduto1 = valorInt1*valorDouble1;
        double valorProduto2 = valorInt2*valorDouble2;
        double valorFinal = valorProduto1 + valorProduto2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorFinal);
        scanner.close();
    }
}
