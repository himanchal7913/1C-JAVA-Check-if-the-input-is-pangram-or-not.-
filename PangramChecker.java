import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
        str = str.toLowerCase(); // Convert the input string to lowercase for case-insensitive comparison
        boolean[] alphabetArray = new boolean[26];

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a';
                alphabetArray[index] = true;
            }
        }

        for (boolean isPresent : alphabetArray) {
            if (!isPresent) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // All letters are present
    }
}
