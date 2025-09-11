import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao1015 {
    public static void main(String[] args) throws IOException {
        DecimalFormat formatado4Casas = new DecimalFormat("#.0000");
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double formulaDistance = Math.sqrt(((x2 - x1) * (x2 - x1)) + (y2 - y1) * (y2 - y1));
        System.out.println(formatado4Casas.format(formulaDistance));
        sc.close();
    }
}