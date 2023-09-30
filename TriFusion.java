import java.util.Arrays;

public class TriFusion {

    public static void triFusion(int[] tableau) {
        if (tableau.length <= 1) {
            return; // Le tableau est déjà trié
        }

        // Divisez le tableau en deux moitiés
        int milieu = tableau.length / 2;
        int[] moitieGauche = Arrays.copyOfRange(tableau, 0, milieu);
        int[] moitieDroite = Arrays.copyOfRange(tableau, milieu, tableau.length);

        // Triez récursivement les deux moitiés
        triFusion(moitieGauche);
        triFusion(moitieDroite);

        // Fusionnez les deux moitiés triées
        fusionner(tableau, moitieGauche, moitieDroite);
    }

    private static void fusionner(int[] tableau, int[] moitieGauche, int[] moitieDroite) {
        int i = 0, j = 0, k = 0;

        while (i < moitieGauche.length && j < moitieDroite.length) {
            if (moitieGauche[i] < moitieDroite[j]) {
                tableau[k++] = moitieGauche[i++];
            } else {
                tableau[k++] = moitieDroite[j++];
            }
        }

        while (i < moitieGauche.length) {
            tableau[k++] = moitieGauche[i++];
        }

        while (j < moitieDroite.length) {
            tableau[k++] = moitieDroite[j++];
        }
    }

    public static void main(String[] args) {
        int[] tableau = {12, 11, 13, 5, 6, 7};

        System.out.println("Tableau avant le tri : " + Arrays.toString(tableau));

        triFusion(tableau);

        System.out.println("Tableau après le tri : " + Arrays.toString(tableau));
    }
}
