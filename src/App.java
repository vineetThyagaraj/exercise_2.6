import java.util.Scanner;


public class App {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal: ");
        double subtotal = input.nextDouble();
        System.out.println("Enter the gratuityRate: ");
        double gratuityRate = input.nextDouble();
        double gratuity = calculateGratuity(subtotal, gratuityRate);
        double total = calculateTotal(subtotal, gratuity);
        System.out.println ("Gratuity: $" + gratuity + " Total: $" + total);
        input.close();
    }
       
    public static double calculateGratuity(double subtotal, double gratuityRate){
        double gratuity = subtotal * (gratuityRate / 100);
        return gratuity;
    }
 
    public static double calculateTotal(double subtotal, double gratuity){
        double total = subtotal + gratuity;
        return total;
    }

}
