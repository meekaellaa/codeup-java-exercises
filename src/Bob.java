import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner bobScanner = new Scanner(System.in);
        System.out.println("Talk to Bob, what would you like to say?");
        String whatYouSaidToBob = bobScanner.nextLine();
        String bobSure = "Sure";
        String chillOutDude = "YOOOOOO......Chilllllllll out.";
        String bobFine = "FINE. Be that way then. I didn't want to talk to you either.";
        String bobWhatEver = "what-ever...";

        if(whatYouSaidToBob.endsWith("?")){
            System.out.println(bobSure);
        } else if (whatYouSaidToBob.endsWith("!")){
            System.out.println(chillOutDude);
        } else if (whatYouSaidToBob.trim().isEmpty()) {
            System.out.println(bobFine);
        } else System.out.println(bobWhatEver);


    }
}
