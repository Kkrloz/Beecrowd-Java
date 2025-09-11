import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao1014 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DecimalFormat formato3Casas = new DecimalFormat("#,##0.000");
        int X = sc.nextInt();
        float Y = Math.round(sc.nextFloat() * 10) / 10.0f;
        double averageConsumption = X / Y;
        System.out.println(formato3Casas.format(averageConsumption) + " km/l");
        sc.close();
    }
}