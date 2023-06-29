import java.util.Scanner;

public class HighLow {
        public static void startGame (){
            int magicNum = (int) Math.floor(Math.random() * 100) + 1;
            boolean keepPlaying = true;
            Scanner scan = new Scanner(System.in);
            while (keepPlaying) {
                System.out.println("Guess and number between 1 - 100.");
                int userNumber = scan.nextInt();
                if (userNumber < 1 || userNumber > 100) {
                    startGame();
                }
                if (userNumber < magicNum) {
                    System.out.println("Higher");
                }
                if (userNumber > magicNum) {
                    System.out.println("Lower");
                }
                if (userNumber == magicNum) {
                    System.out.println("Congrats! Good Guess!");
                    keepPlaying = false;
                }
            }
            System.out.println("Would you like to play again? If yes, enter y, if no, enter n.");
            scan.nextLine();
            String userInput = scan.nextLine();
            if( userInput.equals("y") ){
                startGame();
            } else {
                System.out.println("Thanks for playing!");
            }
    }


    public static void main(String[] args) {
      startGame();

    }


}
