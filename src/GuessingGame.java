import javax.swing.*;

public class GuessingGame {
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random()*100 + 1); // math.random returns a positive double value
        int userAnswer = 0;
        System.out.println("The correct guess would be " + computerNumber);
        int count = 1;

        while (userAnswer != computerNumber) // != means not equal to
        {
            String response = JOptionPane.showInputDialog(null,
                    "Enter a guess between 1 and 100", "Guessing Game", 3);
            // JOptionPane creates a standard dialog box
            userAnswer = Integer.parseInt(response);
            // this converts a string to an integer
            JOptionPane.showMessageDialog(null, ""+ determineGuess (userAnswer, computerNumber, count));
            count++;
        }
    }

    private static String determineGuess(int userAnswer, int computerNumber, int count) {
        if (userAnswer <=0 || userAnswer>100) {
            return "Your guess is invalid";
        }
        else if (userAnswer == computerNumber) {
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (userAnswer > computerNumber) {
            return "Your guess is too high, try again. \nTry Number: " + count;
        }
        else if (userAnswer < computerNumber) {
            return "Your guess is too low, try again \nTry Number:" + count;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}
