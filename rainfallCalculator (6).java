//By Brian Duke
//Description: Calculator to find data on rainfall.
import java.util.Scanner;
public class rainfallCalculator {
    public static void main(String args[]) {
        // Create a Scanner object to read input. 
        Scanner keyboard = new Scanner(System.in);
        
        // Declare Variables being used
        int rainCount = 0, monthsLessThanThree = 0, monthsMoreThanTen = 0, totalYears = 0;
        double totalRainfall = 0, averageRainfall = 0;
        
        // User input for how many years will be calculated
        System.out.println("How many years of data are you going to be entering? Press Enter when done typing.");
        totalYears = keyboard.nextInt();
        
        // Nested loop, repeating for each year entered
        for (int yearCount = 1; yearCount <= totalYears; yearCount++)
        {
            // initializing variables that will be reset after each year
            int yearlyMonthsLessThanThree = 0, yearlyMonthsMoreThanTen = 0;
            double yearlyRainfall = 0, yearlyAverageRainfall = 0;
            
            // Loop for 12 months
            for (int monthCount = 1; monthCount <= 12; monthCount++)
            {
                // Prompt user to input rainfall data
                System.out.println("How many inches of rain in year " + yearCount + ", month " + monthCount + "? Press Enter when done typing.");
                rainCount = keyboard.nextInt();
            
                yearlyRainfall += rainCount;
                totalRainfall += rainCount;
            
            // If there is less than 3 inches of rain then increase the counter for Months with less than three by 1    
            if (rainCount < 3)
            {
                monthsLessThanThree++;
                yearlyMonthsLessThanThree++;
            }
            // If there is more than 10 inches of rain then increase the counter for Months with more than 10 by 1    
            else if (rainCount > 10)
            {
                monthsMoreThanTen++;
                yearlyMonthsMoreThanTen++;
            }
            }
            // Calculate and display total yearly rainfall, average rainfall for the year, months with less than 3 inches, and months with more than 10 inches
            yearlyAverageRainfall = (yearlyRainfall / 12);
            System.out.println("\nThe total yearly rainfall was " + yearlyRainfall + " inches.");
            System.out.print("The average rainfall of year " + yearCount + " was ");
            System.out.printf("%.2f", yearlyAverageRainfall);
            System.out.println(" inches.");
            System.out.println("The amount of months with less than 3 inches of rain in year " + yearCount + " is " + yearlyMonthsLessThanThree + ".");
            System.out.println("The amount of months with more than 10 inches of rain in year " + yearCount + " is " + yearlyMonthsMoreThanTen + ".\n");
        }
        
        // Calculate and display total rainfall, total average rainfall, months with less than 3 inches, and months with more than 10 inches
        averageRainfall = (totalRainfall / 12 * totalYears);
        System.out.println("The total rainfall was " + totalRainfall + " inches.");
        System.out.print("The total average rainfall was ");
        System.out.printf("%.2f", averageRainfall);
        System.out.println(" inches.");
        System.out.println("The amount of months with less than 3 inches of rain is " + monthsLessThanThree + ".");
        System.out.println("The amount of months with more than 10 inches of rain is " + monthsMoreThanTen + ".");
        
    }
}