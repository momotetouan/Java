package exo5;

public class Pile {

    private Maillon sommet;

    public Pile(){
        sommet = null;
    }

    public void empiler(String s){

        Maillon m = new Maillon(s, sommet);
        sommet = m;

    }

    // Raise null pointer exception if the stack is empty
    public String depiler(){

        String s = sommet.getValeur();
        sommet = sommet.getSuivant();
        return s;
    }

    public Maillon getSommet(){

        return sommet;
    }

    public boolean estVide(){

        return sommet == null;
    }
}
