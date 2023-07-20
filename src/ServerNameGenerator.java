import java.util.Random;

public class ServerNameGenerator {
// create an array of nouns and an array of adjectives
    public static String[] adjectives = {"Cool", "Calm", "Collected", "Beautiful", "Blue", "Goofy", "Fast", "Fun", "Dangerous", "Slow"};
    public static String[] nouns = {"Dog", "Cat","Woman", "Window", "Chair", "Man", "Chicken", "Mango", "Teacher", "School"};
//    Create a method  that generates a random combination of a noun and an adjective.
    public static String getRandom(String[] nouns, String[] adjectives){
            Random random = new Random();
            int nounsIndex = random.nextInt(nouns.length);
            int adjectiveIndex = random.nextInt(adjectives.length);
            String randomNoun = nouns[nounsIndex];
            String randomAdjective = adjectives[adjectiveIndex];
             return randomAdjective + " - " + randomNoun;
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name: ");
        System.out.println(getRandom(nouns, adjectives));

    }

}
