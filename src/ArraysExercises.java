import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] people, Person addperson){
        Person[] newArray = Arrays.copyOf(people, people.length +1);
        newArray[newArray.length - 1] = addperson;
        return newArray;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        does not work
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        Person p1 = new Person("Xavier");
        Person p2 = new Person("Maria");
        Person p3 = new Person("Francisco");
        Person[] people = {p1,p2,p3};
// Both loops give the same results.
        for (int i = 0; i < people.length; i++ ) {
            System.out.println(people[i].getName());
        }
//        enhanced for loop
        Person p4 = new Person("Victor");
         Person[] newpeople = addPerson(people, p4);

        for (Person element : newpeople){
            System.out.println(element.getName());
        }

    }
}
