import java.util.Scanner;
public class ConsoleIONotes {
    public static void main(String[] args){
//        String name = "codeup";
//        System.out.println("name = " + name);
        //Print all together: codeupcodeupcodeup
//        System.out.print(name);
//        System.out.print(name);
//        System.out.print(name);

//        System.out.printf("Hello there, %s. Nice to see you.%n", name);
//        System.out.println("Hello there, " + name + "Nice to see you.");
//
//        String greeting = "Salutations";
//        String name = "codeup";
//        System.out.printf("%s, %s!", greeting, name);
//        1st variable will take up the first %s and the second will take the 2nd %s. greeting = 1st & name= 2nd
//        System.out.printf("%s, %s!",name, greeting);
//        switched around to show.
//Added the scanner class import at the top.
//        utilizing the scanner below:
//        new: making an object using the class of scanner.
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter something: ");
//        Enter something: chicken n waffles
//        String userInput = myScanner.next();
//        You entered: --> "chicken" <--
        String userInput = myScanner.nextLine();
//        will grab everything on the line.
//        this will grab chicken n waffles
//        You entered: --> "chicken n waffles" <--
        System.out.println("You entered: --> \"" + userInput + "\" <--");



    }
}
