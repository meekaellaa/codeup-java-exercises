public class FizzBuzz {
    //write a method named doFizzBuzz that will print the numbers 1-100 except if a number is divisible by 3, print fizz
//if it's divisible by 5 print buzz, if divisible by both print fizzbuzz
    public static void doFizzBuzz(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        doFizzBuzz(3,1000);
    }

}



