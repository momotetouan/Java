package exo2;

public class Facto {
    
    
    private static long factRec(int n){
        assert n>=0:"ERREUR";
        long res=1;
        for(int i=1;i<=n;i++){
            res*=i;
        }
        return res;
        
    }

    /**
     * @param n
     * @return
     * @throws IllegalArgumentException
     */
    public static long factorielle (int n) throws IllegalArgumentException{
        if(n>=0 && n<=20){
           return factRec((n));
        }
        else
        throw new IllegalArgumentException("ERREUR !");
    }
    

}
