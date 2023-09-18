package exo5;

public class Main2 {

    public static void main(String[] args){

        Pile p = new Pile();

        p.empiler(String.valueOf((int) (Math.random() * 100)));
        p.empiler(String.valueOf((int) (Math.random() * 100)));
        p.empiler(String.valueOf((int) (Math.random() * 100)));
        p.empiler(String.valueOf((int) (Math.random() * 100)));
        p.empiler(String.valueOf((int) (Math.random() * 100)));

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
