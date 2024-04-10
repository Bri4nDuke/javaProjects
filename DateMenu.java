// By: Brian Duke
// Description: Calculator for converting dates to other forms

import java.util.Scanner;

public class DateMenu 
{

    public static void main(String[] args) 
    {
        DateCalc dateCalculator = new DateCalc();
        Scanner keyboard = new Scanner(System.in);
        boolean end = false;

        // While statement to loop the Menu after each time being used
        while (!end) 
        {
            System.out.println("Date Calculator Menu:");
            System.out.println("1. Convert Gregorian date to Julian date");
            System.out.println("2. Convert Julian date to Gregorian date");
            System.out.println("3. Add or subtract days from a date");
            System.out.println("4. Convert to English");
            System.out.println("5. Calculate amount of days between two dates");
            System.out.println("6. End Program");
            System.out.println("Please type number of desired proccess below (Press Enter when done typing): ");

            // User input for Menu option selected
            int option = keyboard.nextInt();
            keyboard.nextLine();

            // Switch statement with cases for each Menu option.
            switch (option) 
            {
                // Converts Gregorian Date to Julian Date
                case 1: 
                    System.out.println("Enter Gregorian date below in (mm/dd/yyyy) format:");
                    String gregorianDate1 = keyboard.nextLine();
                    int julianDate = dateCalculator.convertToJulian(gregorianDate1);
                    System.out.println("The date as a Julian date: " + julianDate);
                    break;
                // Convert Julian date to Gregorian
                case 2:
                    System.out.println("Enter Julian date below in (yyyyddd) format:");
                    int julianDate2 = keyboard.nextInt();
                    keyboard.nextLine(); // Consume newline
                    String gregorianDate2 = dateCalculator.convertToGreg(julianDate2);
                    System.out.println("The date as a Gregorian date: " + gregorianDate2);
                    break;
                // Adds or subtracts days from date
                case 3:
                    System.out.println("Enter Gregorian date below in (mm/dd/yyyy) format:");
                    String gregorianDate3 = keyboard.nextLine();
                    System.out.println("Enter number of days to add or subtract:");
                    int days = keyboard.nextInt();
                    keyboard.nextLine(); // Consume newline
                    String newDate = dateCalculator.addSubtractDays(gregorianDate3, days);
                    System.out.println("The date would be: " + newDate);
                    break;
                // Convert to English 
                case 4:
                    System.out.println("Enter Gregorian date  below in (mm/dd/yyyy) format:");
                    String gregorianDate4 = keyboard.nextLine();
                    String englishDate = dateCalculator.englishDate(gregorianDate4);
                    System.out.println("Date in English: " + englishDate);
                    break;
                // Calculate the amount of days between two dates
                case 5:
                    System.out.println("Enter start Gregorian date below in (mm/dd/yyyy) format:");
                    String firstDate = keyboard.nextLine();
                    System.out.println("Enter end Gregorian date below in (mm/dd/yyyy) format:");
                    String secondDate = keyboard.nextLine();
                    int daysBetween = dateCalculator.daysBetween(firstDate, secondDate);
                    System.out.println("The amount of days between the two dates is: " + daysBetween);
                    break;
                // Ends the program
                case 6:
                    end = true;
                    break;
                // Error message for if user types number out of range
                default:
                    System.out.println("Error: Option number was out of range.");
            }
        }

        keyboard.close();
    }
}
