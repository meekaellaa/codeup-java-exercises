public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//  #1
        int myFavoriteNumber = 3;
//  #2
        String myString = "Michaella is amazing!";
//  #3 Change your code to assign a character value to myString. What do you notice?
//        char myString = "Michaella is amazing!";
//        java: not a statement
//  #4 Change your code to assign the value 3.14159 to myString. What happens?
//        String myString = 3.14159;
//        java: variable myString is already defined in method main(java.lang.String[])
//  #5  Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//        long myNumber = ;
//        System.out.println(myNumber);
//        java: illegal start of expression
//  #6 Change your code to assign the value 3.14 to myNumber. What do you notice?
//        long myNumber = (long) 3.14;
//   get screamed at by intellij. intellij instructed to re-write long myNumber = 3.14; to long myNumber = (long) 3.14;
//  #7  Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//    long myNumber = 123L;
//#8 Change your code to assign the value 123 to myNumber.
//Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//        long myNumber = 3.14;
//    java: incompatible types: possible lossy conversion from double to long. Don't need to use long because it's already a double.
//  #9 Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this
//       float myNumber = 3.14;
//     java: incompatible types: possible lossy conversion from double to float.
//  #10  Copy and paste the following code blocks one at a time and execute them.
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
// Didn't print.
        int x = 5;
        System.out.println(++x);
        System.out.println(x);







    }
}