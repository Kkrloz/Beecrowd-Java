import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao1038 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        // prices dos produtos
        double priceCachorroQuente = 4.00;
        double priceXSalada = 4.50;
        double priceXBacon = 5.00;
        double priceTorradaSimples = 2.00;
        double priceRefrigerante = 1.50;

        int x = sc.nextInt();
        int y = sc.nextInt();
        
        switch (x) {
            case 1:
                System.out.println("Total: R$ " + df.format(y * priceCachorroQuente));
                break;
            case 2:
                System.out.println("Total: R$ " + df.format(y * priceXSalada));
                break;
            case 3:
                System.out.println("Total: R$ " + df.format(y * priceXBacon));
                break;
            case 4:
                System.out.println("Total: R$ " + df.format(y * priceTorradaSimples));
                break;
            case 5:
                System.out.println("Total: R$ " + df.format(y * priceRefrigerante));
                break;
            default:
                System.out.println("Invalid product code.");
                break;
        }

        sc.close();
    }
}
