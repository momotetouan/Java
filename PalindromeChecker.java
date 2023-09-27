import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        // Supprimez les espaces et mettez la chaîne en minuscules pour une comparaison insensible à la casse
        str = str.replaceAll("\\s+", "").toLowerCase();
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Les caractères ne correspondent pas, ce n'est pas un palindrome
            }
            left++;
            right--;
        }
        
        return true; // Tous les caractères correspondent, c'est un palindrome
    }
    
    public static void main(String[] args) {
        System.out.println("Entrez le mot à verifier");
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine(); // Remplacez cette chaîne par celle que vous souhaitez vérifier
        if (isPalindrome(input)) {
            System.out.println(input + " est un palindrome.");
        } else {
            System.out.println(input + " n'est pas un palindrome.");
        }
    }
}
