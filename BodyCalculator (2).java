// This program is tasked with calculating the BMI of a persons' body after inputing height and weight.

/*
Allow entry of the height and weight
    Enter the height in inches
    Enter the weight in pounds

Compute the weight in kilograms
    There are 453.59 grams in a pounds
    There are 1000 grams in a kilogram

Compute the height in meters
    There are 2.54 centimeters in an inch
    There are 100 centimeters in a meter

Compute the BMI
    BMI is weight in kilograms divided by the height in meters squared

Display the BMI
    Display the weight in pounds and kilograms
    Display the height in inches and meters
    Display the BMI

Display end-of-job message “Thanks for using this program”
*/

// Heath, Gaven, Brian

import java.util.Scanner;

public class BodyCalculator {

// Establishes variables and adds the user inpt to allow input of height and weight = Heath
    static double inputHeight, inputWeight, kiloWeight, meterHeight, BMI;

    public static void entryOfWeight_Height(){
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter you height in inches.");
        inputHeight = keyboard.nextDouble();
        
        System.out.println("Please enter your weight in pounds.");
        inputWeight = keyboard.nextDouble();
    }
    //
    public static void computePoundToKilo(double pounds){
        
        kiloWeight = (453.59 * pounds) / 1000;
    }
    //
    public static void computeInchToMeter(double inches){
        
        meterHeight = (2.54 * inches) / 100;
    }
    // This module is where the BMI is actually calculated Kilograms X Meters^2 -Gaven
    public static void computeBMI(double kilograms, double meters){
        
        BMI = kilograms / (meters * meters);
    }
    
    // Displays the BMI alongside the other variables including pounds, kilo, inches, meters. = Heath
    public static void displayBMI(double Pounds, double Inches, double Kilograms, double Meters, double BMI){
        
        System.out.printf("\nYour weight in pounds is %.2f and your weight in kilograms is %.2f. \n", Pounds, Kilograms);
        System.out.printf("\nYour height in inches is %.2f and your height in meters is %.2f. \n", Inches, Meters);
        System.out.printf("\nYour BMI is %.1f! \n", BMI);
    }
    // Thanks the user for using the program. -Gaven
    public static void endDisplay(){
        
        System.out.println("\nThanks for using this program!\n");
    }
    // Helps to pull from the string objects from each module
    public static void main (String[] args){
        
        entryOfWeight_Height();
        
        computePoundToKilo(inputWeight);
        
        computeInchToMeter(inputHeight);
        
        computeBMI(kiloWeight, meterHeight);
        
        displayBMI(inputWeight, inputHeight, kiloWeight, meterHeight, BMI);
        
        endDisplay();
    }
}