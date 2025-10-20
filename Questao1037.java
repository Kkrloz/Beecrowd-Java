import java.util.Scanner;
import java.util.Locale;

public class Questao1037 {
    public static void main(String[] args) {
        Locale.setDefault(java.util.Locale.US);
        Scanner sc = new Scanner(System.in);
        float numberChoosed = sc.nextFloat();
        if (numberChoosed >= 0 && numberChoosed <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (numberChoosed > 25 && numberChoosed <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (numberChoosed > 50 && numberChoosed <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (numberChoosed > 75 && numberChoosed <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }

        sc.close();
    }
}
