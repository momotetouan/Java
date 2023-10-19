public class Utilisateur{
    private int id;
    private String nom;

    public Utilisateur(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Utilisateur #" + id + ": " + nom;
    }
}