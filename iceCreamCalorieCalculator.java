//By Brian Duke
//Description: Calculator to find total calories eaten of Bryer's French Vanilla ice cream and Hershey's Hot Fudge Topping.
import java.util.Scanner;
public class iceCreamCalorieCalculator 
    {
    
    public static void main(String[] args) 
        {
        // Create a Scanner object to read input. 
        Scanner keyboard = new Scanner(System.in); 
        
        // Declare the integers used throughtout the code
        int scoopCount, vanillaCalories, teaspoonCount, fudgeCalories, totalCalories; 
      
        // Calories in  Bryer's French Vanilla ice cream
        vanillaCalories = 59;
    
        // Calories in Hershey's Hot Fudge Topping
        fudgeCalories = 60;

        System.out.println("How many scoops of Bryer's French Vanilla ice cream did you eat? Press Enter when finished typing.");
    
        scoopCount = keyboard.nextInt();
    
         System.out.println("How many teaspoons of Hershey's Hot Fudge Topping did you eat? Press Enter when finished typing.");
        
        teaspoonCount = keyboard.nextInt();
        
        // Total calories eaten
        totalCalories = (scoopCount * vanillaCalories) + (teaspoonCount * fudgeCalories);
        System.out.println("The total calories consumed is " + totalCalories);
   
    }
    
}