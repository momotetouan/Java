import java.util.Scanner;

/**
 * Annagrame
 */
public class Annagrame {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String[] tab = getAnagrams(s);
        System.out.println(tab.toString());
        
    }


    
    public static String[] getAnagrams(String word) {
        // Convertir le mot en un tableau de caractères
        char[] chars = word.toCharArray();

        // Trier les caractères dans l'ordre alphabétique
        Arrays.sort(chars);

        // Stocker les anagrammes dans une liste
        java.util.List<String> anagramList = new java.util.ArrayList<>();

        // Recherche des anagrammes en comparant chaque mot avec le mot d'entrée
        for (String candidate : candidates) {
            char[] candidateChars = candidate.toCharArray();
            Arrays.sort(candidateChars);
            if (Arrays.equals(chars, candidateChars)) {
                anagramList.add(candidate);
            }
        }

        // Convertir la liste d'anagrammes en un tableau de chaînes de caractères
        String[] anagrams = new String[anagramList.size()];
        anagramList.toArray(anagrams);

        return anagrams;
    }

}