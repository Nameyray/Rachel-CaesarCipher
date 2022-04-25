import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the caesar cipher app!");
        System.out.println("Enter the plaintext message for Encryption:");
        String plaintext = scanner.nextLine();

        System.out.println("\n\nEnter Shift Key:");
        int shift = scanner.nextInt();
        String ciphertext = "";
        char alphabet = 0;
        for (int i = 0; i < plaintext.length(); i++) {
            alphabet = plaintext.charAt(i);
            if (alphabet >= 'a' && alphabet <= 'z') {
                alphabet = (char) (alphabet + shift);
                if (alphabet > 'z') {
                    alphabet = (char) (alphabet + 'a' - 'z' - 1);
                }
                ciphertext = ciphertext + alphabet;
            } else if (alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + shift);
                if (alphabet > 'Z') {
                    alphabet = (char) (alphabet + 'A' - 'Z' - 1);
                }
                ciphertext = ciphertext + alphabet;
            } else {
                ciphertext = ciphertext + alphabet;
            }

        }
        System.out.println("Your ciphered text is : " + ciphertext);
        String decryptMessage = null;
        System.out.println("Your decrypt message: " + decryptMessage);

    }

}







