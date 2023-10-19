import java.util.*;

class Bibliotheque {
    private List<Livre> livres = new ArrayList<>();
    private List<Utilisateur> utilisateurs = new ArrayList<>();
    private List<Emprunt> emprunts = new ArrayList<>();

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    public void ajouterUtilisateur(Utilisateur utilisateur) {
        utilisateurs.add(utilisateur);
    }

    public void emprunterLivre(Livre livre, Utilisateur utilisateur, String dateEmprunt) {
        emprunts.add(new Emprunt(livre, utilisateur, dateEmprunt));
    }

    public void afficherBibliotheque() {
        System.out.println("Livres dans la bibliothèque:");
        for (Livre livre : livres) {
            System.out.println(livre);
        }

        System.out.println("\nUtilisateurs enregistrés:");
        for (Utilisateur utilisateur : utilisateurs) {
            System.out.println(utilisateur);
        }

        System.out.println("\nEmprunts en cours:");
        for (Emprunt emprunt : emprunts) {
            System.out.println(emprunt);
        }
    }


}