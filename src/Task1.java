import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

        Scanner inScanner = new Scanner(System.in);

        System.out.println("Enter text you want to uppercase: ");
        String toupper = inScanner.next();

        System.out.println("Enter text you want to lowercase: ");
        String tolower = inScanner.next();

        String ltoup = toupper.toUpperCase();
        String uptol = tolower.toLowerCase();


        System.out.println("Your UPPERCASED TEXT: " + ltoup);
        System.out.println("Your LOWERCASED TEXT: "+uptol);










    }
}
