public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, World!");



    int id;
    boolean isLoggedIn;
    float bankAccountBalance;

    int theAnswer = 42;
    String question = "What is your favorite color?";
//    .sout
    System.out.println(question);
//    .soutv
        System.out.println("theAnswer = " + theAnswer);
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
//        5
//        6
// Didn't print.
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//        6
//        6
//        order of operations...... different.
//  #11 Try to create a variable named class. What happens?
//        class is a reserved class in Java o it wouldn't work.
//  #12  Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
//        at HelloWorld.main(HelloWorld.java:61)
//        int three = (int) "three";
//        java: incompatible types: java.lang.String cannot be converted to int
//  #13 Rewrite the following expressions using the relevant shorthand assignment operators:
//        int x = 4;
//        x = x + 5;
////
//        int x = 3;
//        int y = 4;
//        y = y * x;
////
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
//        What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.













    }
};