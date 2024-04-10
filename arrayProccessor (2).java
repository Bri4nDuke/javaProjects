//By: Brian Duke
//Description: proccesses a 20 integer array
import java.util.Scanner;

public class arrayProccessor
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read input. 
        Scanner keyboard = new Scanner(System.in); 

        // Initializes variables and array
        int[] array = new int[20];
        int number = 0;
        int loopCounter = 0;
        double arrayTotal = 0;
        int numberHighest = array[0];
        int numberLowest = array[0];
        double arrayAverage = 0;
    
        // Ask for user input for the next array slot
        System.out.println("Please enter a positive integer for next array slot or enter -1 to end the array");
        number = keyboard.nextInt();
    
            // While loop to continue asking the user for array data
            while (number != -1 && loopCounter < 20) 
            {
                array[loopCounter] = number;
                arrayTotal += number;
                loopCounter++;
                if (loopCounter < 20)
                {
                    // Ask for user input for the next array slot
                    System.out.println("Please enter a positive integer for next array slot or enter -1 to end the array");
                    number = keyboard.nextInt();
                }
            }
        // Reverse order For loop
        for (int i = loopCounter - 1; i >= 0; i--)
        {
            System.out.print(array[i] + ", ");
        }
    
        // Find highest and lowest number in array
        for (int i = 0; i < loopCounter; i++) 
        {
            if (array[i] > numberHighest) 
            {
                numberHighest = array[i];
            }
            if (array[i] < numberLowest) 
            {
                numberLowest = array[i];
            }
        }
    
        // Determine array average
        arrayAverage = arrayTotal/loopCounter;
    
        // Display array total, average, highest, and lowest
        System.out.println("\nThe total of the array is " + arrayTotal);
        System.out.print("The average of this array is ");
        System.out.printf("%.2f", arrayAverage);
        System.out.println("\nThe highest number is " + numberHighest + ".");
        System.out.println("The lowest number is " + numberLowest + ".");
        System.out.println("That's all folks!");
    }
}