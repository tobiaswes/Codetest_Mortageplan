package codetest;

public class Round {

    public static double roundFunction(double number) {
        // Multiply the number by 100 to keep two decimal places
        int roundedNumber = (int) (number * 100);

        // Check if the decimal part is greater than or equal to 0.5
        if ((number * 100) - roundedNumber >= 0.5) {
            // Round up by adding 1
            roundedNumber += 1;
        }

        // Divide by 100.0 to get the final rounded result
        return roundedNumber / 100.0;
    }
}
