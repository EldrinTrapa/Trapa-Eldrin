import java.util.Scanner;

public class ActivityThreeTrapa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usdToPhpConversionRate = 56.40;

                System.out.println("Menu:");
        System.out.println("1. C1 - Php 250.00");
        System.out.println("2. C2 - Php 200.00");
        System.out.println("3. C3 - Php 150.00");
        System.out.println("");
        System.out.println("Adds on:");
        System.out.println("4. R1 - Php 30.00");
        System.out.println("5. R2 - Php 40.00");
        System.out.println("");

               System.out.print("Enter items (1, 2, 3, 4, 5): ");
        int itemCode = scanner.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

                double totalPrice = 0;

        switch (itemCode) {
            case 1:
                totalPrice = 10 * quantity;
                break;
            case 2:
                totalPrice = 15 * quantity;
                break;
            case 3:
                totalPrice = 20 * quantity;
                break;
            case 4:
                totalPrice = 20 * quantity;
                break;
            case 5:
                totalPrice = 20 * quantity;
                break;
              
            default:
                System.out.println("Invalid item code");
                return;
        }

               System.out.println("Order Code: " + itemCode);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + totalPrice);

               double phpAmount = totalPrice * usdToPhpConversionRate;
        System.out.println("Total Price in PHP: Php " + phpAmount);

                scanner.close();
    }
}
   
     
     
     
       