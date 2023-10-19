public class Livre{
    private int id;
    private String titre;
    private String auteur;

    public Livre(int id, String titre, String auteur) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
    }

    // Getters et setters

    @Override
    public String toString() {
        return "Livre #" + id + ": " + titre + " par " + auteur;
    }
}