import java.util.Scanner;
import java.text.DecimalFormat;
public class Questao1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        int spentTime = sc.nextInt();
        int averageSpeed = sc.nextInt();
        double fuelSpent = (spentTime * averageSpeed) / 12.0;
        System.out.println(df.format(fuelSpent));
        sc.close();
    }
}
