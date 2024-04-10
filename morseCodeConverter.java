// By: Brian Duke
// Description: Converts words or phrases into morse code

import java.util.Scanner;

public class morseCodeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	// User input for the phrase or word to be converted then coverts to upper case in order to convert it to morse code
        System.out.println("Enter a word or phrase to be converted into Morse Code:");
        String input = scanner.nextLine().toUpperCase();

        System.out.println("The input string was:");
        System.out.println(input);

        System.out.println("The Morse Code for this phrase is:");

        StringBuilder morseCode = new StringBuilder();

	// Array for English Alphabet
        String[] arrayEnglishAlphabet = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
                "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

	// Array for Morse Code Alphabet
        String[] arrayMorseCodeAlphabet = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
                "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----." };

	// Initialize boolian variable for if first character of phrase
        boolean isFirstCharacter = true;
        for (int i = 0; i < input.length(); i++) 
	{
            // Detects spaces and converts them into 3 spaces for the morse code
	    char c = input.charAt(i);
            if (c == ' ') 
	    {
                // Adds 3 spaces any time there is a space to show a clear break in the morse code
		morseCode.append("    ");
                isFirstCharacter = true;
            } 
	    else 
	    {
                // Detects if space is neccesary and then converts english alphabet into morse code alphabet
		int index = indexOfCharacter(arrayEnglishAlphabet, c);
                if (index != -1) {
                    if (!isFirstCharacter) 
		    {
                        morseCode.append(" ");
                    } 
		    else 
		    {
                        isFirstCharacter = false;
                    }
                    morseCode.append(arrayMorseCodeAlphabet[index]);
                }
            }
        }

        System.out.println(morseCode.toString());

        scanner.close();
    }

    private static int indexOfCharacter(String[] arrayEnglishAlphabet, char c) 
    {
        // For loop
	for (int i = 0; i < arrayEnglishAlphabet.length; i++) 
	{
            if (arrayEnglishAlphabet[i].charAt(0) == c) 
	    {
                return i;
            }
        }
        return -1;
    }
}