//By Brian Duke
//Description: Calculator to find shipping cost depending on package weight
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        // Create a Scanner object to read input. 
        Scanner keyboard = new Scanner(System.in);
        
        // Declare Variables being used
        double shippingRate, shippingCost, packageWeight;
        
        // Define the value for shipping rates
        final double RATE1 = 1.10, RATE2 = 2.20, RATE3 = 3.70, RATE4 = 3.8;
        
        // Prompt user to input package weight
        System.out.println("How many LBs does your package weigh? Press Enter when done typing.");
        // User inputs package weight
        packageWeight = keyboard.nextDouble();
        
        // Compares weight to find shipping rate
        if (packageWeight > 10)
            {
            shippingRate = RATE4;
            }   
        else if (packageWeight > 6)
            {
            shippingRate = RATE3;
            }    
        else if (packageWeight > 2)
            {
            shippingRate = RATE2;
            }    
        else
            {
            shippingRate = RATE1;
            }
        
        // Calculates shipping cost
        shippingCost = (shippingRate * packageWeight);
        
        // Display calculated shipping rate and shipping cost
        System.out.println("Given the weight of your package the shipping rate is " + shippingRate + ".");
        System.out.println("The total shipping cost is $" + shippingCost + ".");
    }
}