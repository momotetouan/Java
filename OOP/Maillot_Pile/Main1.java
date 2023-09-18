package exo5;

public class Main1 {

    public static void main(String[] args){

        Pile p = new Pile();
        p.empiler("a");
        p.empiler("b");
        p.empiler("c");
        p.empiler("d");
        p.empiler("e");

        Maillon q = p.getSommet();

        while ( q!=null ){
            System.out.println(q.getValeur());
            q = q.getSuivant();
        }

        p.depiler();
        p.depiler();

        System.out.println("\n\n");

        q = p.getSommet();
        while ( q!=null ){
            System.out.println(q.getValeur());
            q = q.getSuivant();
        }

    }
}
