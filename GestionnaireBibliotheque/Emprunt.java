public class Emprunt {
    private Livre livre;
    private Utilisateur utilisateur;
    private String dateEmprunt;

    public Emprunt(Livre livre, Utilisateur utilisateur, String dateEmprunt) {
        this.livre = livre;
        this.utilisateur = utilisateur;
        this.dateEmprunt = dateEmprunt;
    }

    // Getters et setters

    @Override
    public String toString() {
        return utilisateur + " a emprunté " + livre + " le " + dateEmprunt;
    }
}