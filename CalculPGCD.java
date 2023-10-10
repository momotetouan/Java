import java.util.Scanner;

public class CalculPGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir les deux nombres
        System.out.print("Entrez le premier nombre : ");
        int nombre1 = scanner.nextInt();

        System.out.print("Entrez le deuxième nombre : ");
        int nombre2 = scanner.nextInt();

        // Calcule le PGCD en utilisant l'algorithme d'Euclide
        int pgcd = calculerPGCD(nombre1, nombre2);

        // Affiche le résultat
        System.out.println("Le PGCD de " + nombre1 + " et " + nombre2 + " est : " + pgcd);
    }

    // Méthode pour calculer le PGCD en utilisant l'algorithme d'Euclide
    public static int calculerPGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
