public class Main {
    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque();

        Livre livre1 = new Livre(1, "Guerre et Paix", "Léon Tolstoï");
        Livre livre2 = new Livre(2, "1984", "George Orwell");

        Utilisateur utilisateur1 = new Utilisateur(1, "Alice");
        Utilisateur utilisateur2 = new Utilisateur(2, "Bob");

        bibliotheque.ajouterLivre(livre1);
        bibliotheque.ajouterLivre(livre2);

        bibliotheque.ajouterUtilisateur(utilisateur1);
        bibliotheque.ajouterUtilisateur(utilisateur2);

        bibliotheque.emprunterLivre(livre1, utilisateur1, "2023-10-19");
        bibliotheque.emprunterLivre(livre2, utilisateur2, "2023-10-20");

        /*System.out.println(livre1.toString());
        System.out.println(livre2.toString());
        System.out.println(utilisateur1.toString());
        System.out.println(utilisateur2.toString());
        */

        bibliotheque.afficherBibliotheque();
    }
}