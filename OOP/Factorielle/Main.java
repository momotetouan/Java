package exo2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        String s;
        do {
            System.out.println("Veuillez saisir l'entier pour calculer la factorielle");
            Scanner sc = new Scanner(System.in);
            s = sc.nextLine();
            if(s.equals("q")) {
                break;
            }
            Integer i=(Pattern.matches("[+-]?\\d+",s)?
                    Integer.parseInt(s):null);
            try {
                System.out.println(i + "! = " + Facto.factorielle(i));
            }
            catch (IllegalArgumentException e){
                System.out.println("Entier négatif ou supérieur à 20");
            }

        }
        while (!s.equals("q"));


    }
    
}
