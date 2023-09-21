package exo1;

public class TestTriNuplet {

    public static void main(String[] args) {

        ListeNuplets question3 = new ListeNuplets(1, 2, 3);

        System.out.println(question3);

        question3.trier();

        System.out.println(question3);

        System.out.println(question3.getNuplet(1));
        System.out.println(question3.getNuplet(1).nbElements());

    }

}

