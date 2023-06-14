import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){

//        double pi = 3.14159;
//        System.out.println("The value of pi is approximately " + pi);
//        System.out.printf("The value of pi is approximately %.2f"  ,pi);

        Scanner myScanner = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        double userInput = myScanner.nextInt();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");


//        Prompt user to enter 3 words
//        System.out.println("Enter 3 words: ");
//        String word1 = myScanner.next();
//        String word2 = myScanner.next();
//        String word3 = myScanner.next();

//  Display words back in the console:
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);
//  Prompt user to enter a sentence
//        System.out.println("Enter a sentence: ");
//        String sentence = myScanner.next();
//        System.out.println("You wrote = " + sentence);
// The code above did not capture all the words.
//        Re-writing the code using nextline method.
//        System.out.println("Enter a sentence: ");
//        String sentence = myScanner.nextLine();
//        System.out.println("You wrote = " + sentence);
//  Prompt the user for values of length and width:
//        System.out.println("Enter the length of the Classroom: ");
//        double length = myScanner.nextInt();
//        System.out.println("Enter the width of the Classroom: ");
//        double width = myScanner.nextInt();
//        double lw = 2 * length + 2 * width;
//        System.out.println("Area of the Classroom is: " + lw);

//Cody's solution:

        System.out.println("Enter the length of the Classroom: ");
        String input = myScanner.nextLine();
        int length = Integer.parseInt(input);
        System.out.println("length = " + length);
        System.out.println("Enter the width of the Classroom: ");
        String input2 = myScanner.nextLine();
        int width = Integer.parseInt(input2);
        System.out.println("width = " + width);
        int area = 2 * (length + width);
        System.out.println("area = " + area);
        System.out.printf("area = %s" , area);

    }
}
