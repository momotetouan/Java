package exo1;

public class Main {

    public static void main(String[] args) {
	ListeNuplets n = new ListeNuplets(3,2);
	System.out.println(n);

	ListeNuplets.Nuplet nu = n.getNuplet(0);
	System.out.println(nu);
	System.out.println(nu.getElement(1));
	n.trier();
	System.out.println(n);
    }
}
