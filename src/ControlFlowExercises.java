import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
// Loop Basics:
//        a:
//        int i = 5;
//        while (i <= 15){
//            System.out.print("i = " + i);
//            i++;
//        }
//        b:
//        int count = 0;
//       do {
//           System.out.println(count);
//           count+=2;
//       } while (count <= 100);
//  loop counts backwards by 5's starting from 100 to -10
//        int count = 100;
//        do {
//            System.out.println(count);
//            count -= 5;
//        } while (count >= (-10));
//   loop starts at 2, and displays the number squared while number is less than 1,000,000.
//        long num = 2;
//        do{
//            System.out.println(num);
//            num *= num;
//        } while (num < 1000000);

//          c:
//        for (int j = 5; j <= 15; j++){
//            System.out.print(j+ " ");
//        }
//        System.out.println();
//        for(int j = 0; j<= 100; j+=2){
//            System.out.println(j);
//        }
//        for (int j = 100; j >= -10; j-=5){
//            System.out.println(j);
//        }
//        for (long b = 2; b < 1000000; b*=b){
//            System.out.println(b);
//        }

//        FIZZ BUZZ
//        for( int j = 1; j< 101; j++){
//            if(j % 15 == 0){
//                System.out.println("Fizz Buzz");
//            } else if (j % 3 ==0) {
//                System.out.println("Fizz");
//            } else if (j % 5 == 0) {
//
//            } else {
//                System.out.println(j);
//            }
//        }
//
//          Display a table of Power
//        boolean userContinue;
//        Scanner scan = new Scanner(System.in);
//        do {
//            System.out.println("Choose a number: ");
//            int userNumber = scan.nextInt();
//            System.out.println("Number |  squared | cubed\n------ | ------- | -----");
//            for (int j = 1; j <= userNumber; j++){
//                System.out.printf("%-6d |  %-7d | %d%n", j,j,*j, j*j*j);
//            }
//            System.out.println("Do you want to enter another number? ");
//            scan.nextLine();
//            String answer = scan.nextLine();
//            userContinue = answer.equals("yes");
//        } while (userContinue);
//        #4
        boolean userContinue;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Choose a grade as a number: ");
            int userNumber = scan.nextInt();
            if (userNumber >= 88){
                System.out.println("You've got an A!");
            } else if (userNumber >= 80) {
                System.out.println("You've got a B!");
            } else if (userNumber >= 67) {
                System.out.println("You've got a C!");
            } else if (userNumber >= 60) {
                System.out.println("You've got a D!");
            } else {
                System.out.println("You've got an F....");
            }
            System.out.println("Do you want to enter another grade? ");
            scan.nextLine();
            String answer = scan.nextLine();
            userContinue = answer.equals("yes");
        } while (userContinue);



    }
}
