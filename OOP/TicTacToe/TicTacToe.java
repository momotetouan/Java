package Application;

public class TicTacToe {
    
    private char[][] plateau;
    private Player currentPlayer;

    public TicTacToe(){
        plateau=new char[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                plateau[i][j]=' ';
            }
        }
    }

    public void afficherPlateau(){
         
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(plateau[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }

}

public boolean checkWin(){
    return checkRows() || checkColumns() || checkDiagonals();
}

    public boolean isValidMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && plateau[row][col]==' ') {
            return true;
        } else {
            System.out.println("Coup invalide. Réessayez.");
            return false;
        }
    }

    public void makeMove(int row,int col){
        plateau[row][col]=currentPlayer.getNom();
    }

    private boolean checkRows() {
        for (int i = 0; i < 3; i++) {
            if (plateau[i][0] == currentPlayer.getNom() && plateau[i][1] == currentPlayer.getNom() && plateau[i][2] == currentPlayer.getNom()) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColumns() {
        for (int i = 0; i < 3; i++) {
            if (plateau[0][i] == currentPlayer.getNom() && plateau[1][i] == currentPlayer.getNom() && plateau[2][i] == currentPlayer.getNom()) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonals() {
        return (plateau[0][0] == currentPlayer.getNom() && plateau[1][1] == currentPlayer.getNom() && plateau[2][2] == currentPlayer.getNom()) ||
               (plateau[0][2] == currentPlayer.getNom() && plateau[1][1] == currentPlayer.getNom() && plateau[2][0] == currentPlayer.getNom());
    }

    public Player getCurrentPlayer(){
        return this.currentPlayer;
    }

    public void changePlayer(Player player) {
        currentPlayer.setNom((player.getNom() == 'X') ? 'O' : 'X');
    }
    
    public boolean isGameOver() {
        return isBoardFull() || checkWin();
    }

    // Vérifie si le plateau est plein
    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (plateau[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public void setCurrentPlayer(Player player){
        this.currentPlayer=player;
    }

    

}
