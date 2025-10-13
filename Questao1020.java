import java.util.Scanner;
public class Questao1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalDays = scanner.nextInt();
        int years = totalDays / 365;
        int remainingDaysAfterYears = totalDays % 365;
        int months = remainingDaysAfterYears / 30;
        int days = remainingDaysAfterYears % 30;
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", years, months, days);
        scanner.close();
    }
}
