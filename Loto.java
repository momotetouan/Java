import java.util.Random;

public class Loto {
    public static void main(String[] args) {
        int[] numerosLoto = genererNumerosLoto();

        System.out.println("Les numéros de loto générés sont :");
        for (int i = 0; i < numerosLoto.length; i++) {
            System.out.print(numerosLoto[i] + " ");
        }
    }

    public static int[] genererNumerosLoto() {
        int[] numeros = new int[6];
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            // Génère un numéro aléatoire entre 1 et 49
            numeros[i] = random.nextInt(49) + 1;
        }

        return numeros;
    }
}
