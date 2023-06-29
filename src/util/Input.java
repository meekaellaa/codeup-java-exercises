package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Enter a string or phrase.");
        return this.scanner.nextLine();
    }

public boolean yesNo(){
    System.out.println("Yes or no? pick. ");
    String decisions = this.scanner.nextLine();
    if (decisions.equals( "y") || decisions.equals("yes")){
        return true;
    } else if(decisions.equals( "n") || decisions.equals("no")) {
        return false;
    } else {
//        re-prompt the user to enter yes or no..
        return yesNo();
    }
}

public int getInt(){
    System.out.println("Enter an Integer:");
    return this.scanner.nextInt();
}

public int getInt (int min, int max){
    System.out.println(" Enter a number between " + min + " and " + max);
    int input = this.scanner.nextInt();
    if (input < min || input > max ){
        getInt( min, max);
    }
        return input;
}
    public double getDouble(){
        System.out.println("Enter a double:");
        return this.scanner.nextDouble();
    }

    public double getDouble(double min, double max){
        System.out.println(" Enter a number between " + min + " and " + max);
        double input = this.scanner.nextDouble();
        if (input < min || input > max ){
            getDouble( min, max);
        }
        return input;
    }


    public static void main(String[] args) {
        Input input = new Input();
//        input.scanner.nextLine();
//        input.getString();
//        input.yesNo();
        input.getInt();
        input.getInt(1, 100);
        input.getInt(5,300);
        input.getDouble();
        input.getDouble(1.0, 5.3);
    }
}
