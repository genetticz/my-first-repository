import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        int min = 1;
        int maximum = 50;
        int range = maximum - min;
        int randomNum = min + (int) (Math.floor(Math.random() * range));

//        System.out.println("The random number is " + randomNum);
        System.out.println("Please take your first guess of the random number");
        int usersGuess = stdin.nextInt();
        int guessAttempts = 1;

        while(usersGuess != randomNum) {

            System.out.println("Please take a guess at the random number");
            usersGuess = stdin.nextInt();
            if (randomNum - usersGuess  <= 10) {
                System.out.println("You are hot. Keep guessing");
                guessAttempts++;
            }
            else if (randomNum - usersGuess <= 15) {
                System.out.println("You are warm. Keep guessing");
                guessAttempts++;
            }
            else{
                System.out.println("You are totally COLD!");
                guessAttempts++;
            }
        }

        System.out.println("Congrats! you guessed the right number which is "
                + randomNum + ". It only took " + guessAttempts + " guesses!");



    }

}
