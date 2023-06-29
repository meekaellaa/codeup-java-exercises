import java.util.Scanner;

public class MethodsExercises {
   public static Scanner myScanner = new Scanner(System.in);
//    # 1
    public static int addition(int x, int y){
        return x + y;
    }
    public static int subtract(int x, int y){
        return x - y;
    }
    public static int multiplication(int x, int y){
        return x * y;
    }
    public static int division(int x, int y){
        return x / y;
    }
    public static int remainder(int x, int y){
        return x % y;
    }
//    #2
public static int getInteger(int min, int max){
    System.out.printf("Please enter an number between %d and %d", min,max);
    int userNum = myScanner.nextInt();
    if( userNum < min || userNum > max){
        System.out.println("Invalid input.");
        return getInteger(min, max);
    } else {
        System.out.println("Thanks");
        return userNum;
    }
}
// #3
    public static void factorialOfNum(int num){
        long userFactorial = 1;
        for (int i = 1; i <= num; i++){
            userFactorial *= i;
//            userFactorial = userFactorial * i;
            System.out.println(userFactorial);
        }

    }


//  #4
public static void rollDice(){
        Scanner sc = new Scanner(System.in);
    System.out.println("How many sides does your dice have?");
    int userNumber = sc.nextInt();
    int firstDieResult = (int) (Math.random()* userNumber) + 1;
    int secondDieResult = (int) (Math.random()* userNumber) + 1;
    int total = firstDieResult + secondDieResult;
    System.out.println("Your first die rolled: " + firstDieResult);
    System.out.println("Your 2nd die rolled: " + secondDieResult);
    System.out.println("Total: " + total);

}







    public static void main(String[] args) {
//        System.out.println(addition(2,5));
//        System.out.println(subtract(7,4));
//        System.out.println(multiplication(5,5));
//        System.out.println(division(80,5));
//        System.out.println(remainder(56,3));
//        System.out.println(getInteger(1,10));
//        factorialOfNum(4);
        rollDice();
    }
}
