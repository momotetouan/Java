package exo1;

import java.util.Arrays;
import java.util.Scanner;

public class ListeNuplets {
    private Nuplet[] LesNuplets;

    private static Scanner sc = new Scanner(System.in);
    static class Nuplet implements Comparable<Nuplet> {
        private int[] content;


        /*Les valeurs ui doivent être saisies par lecture interactive et doivent être positives*/
        public Nuplet(int k) {
            content = new int[k];

            for (int i = 0; i < k; i++) {
                int v;
                System.out.println("Veuillez entrer un entier positif" + "(" + i + "/" + k + ")");
                while (true) {
                    v = sc.nextInt();
                    if (0 <= v) {
                        break;
                    } else {
                        sc.next();
                    }
                    System.err.println("Il faut un entier positif");
                }
                content[i] = v;
            }


        }


        @Override
        public String toString() {
            String u = "";
            String sep = "";
            for (int n : content) {
                u = u + sep + n;
                sep = ",";
            }
            return "(" + u + ')';
        }

        /*retourne le nombre d'éléments du nuplet*/
        public int nbElements() {
            return content.length;
        }

        /*
        retourne l'élément du nuplet correspondant
        à l'indice passé en paramètre si l'indice est
        valide et -1 sinon.
        */
        public int getElement(int index) {
            if (index < 0 || content.length <= index) {
                return -1;
            } else {
                return content[index];
            }

        }

        @Override
        public int compareTo(Nuplet nuplet) {
            int [] n = nuplet.content;
            for (int i=0; i < content.length && i < n.length; i++ ) {
                if (content[i] < n[i])
                    return -1;
                else if (content[i] > n[i])
                    return 1;
            }
            return 0;
        }
    }

        public ListeNuplets(int... lesTailles) {
            LesNuplets = new Nuplet[lesTailles.length];
            for (int i = 0; i < lesTailles.length; i++) {
                LesNuplets[i] = new Nuplet(lesTailles[i]);
            }
        }

        @Override
        public String toString() {
            return Arrays.toString(LesNuplets);
        }

        public Nuplet getNuplet(int index) {
            if (index < 0 || LesNuplets.length <= index) {
                return null;
            } else {
                return LesNuplets[index];
            }
        }

        public void trier() {
            Arrays.sort(LesNuplets);
        }


}

