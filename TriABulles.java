public class TriABulles {

    public static void triABulles(int[] tableau) {
        int n = tableau.length;
        boolean echange;
        do {
            echange = false;
            for (int i = 0; i < n - 1; i++) {
                if (tableau[i] > tableau[i + 1]) {
                    // Échangez les éléments tableau[i] et tableau[i+1]
                    int temp = tableau[i];
                    tableau[i] = tableau[i + 1];
                    tableau[i + 1] = temp;
                    echange = true;
                }
            }
        } while (echange);
    }

    public static void main(String[] args) {
        int[] tableau = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Tableau avant le tri : " + Arrays.toString(tableau));

        triABulles(tableau);

        System.out.println("Tableau après le tri : " + Arrays.toString(tableau));
    }
}
