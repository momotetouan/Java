package Application;

import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        TicTacToe plateau=new TicTacToe();
        Player currentPlayer=new Player('X');
        plateau.setCurrentPlayer(currentPlayer);

        while(!plateau.isGameOver()){
            plateau.afficherPlateau();
            System.out.println("C'est à " + currentPlayer.getNom() + " de jouer");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            int row = Integer.parseInt(parts[0]) - 1;
            int col = Integer.parseInt(parts[1]) - 1;
        
            if(plateau.isValidMove(row, col)){
                plateau.makeMove(row,col);
                if (plateau.checkWin()) {
                    plateau.afficherPlateau();
                    break; // Sortez de la boucle si quelqu'un a gagné
                }
                plateau.changePlayer(currentPlayer);
            }
        }
        

        if (plateau.checkWin()) {
            System.out.println("Le joueur " + plateau.getCurrentPlayer().getNom() + " a gagné !");
        } else {
            System.out.println("Match nul !");
        }


    }
}