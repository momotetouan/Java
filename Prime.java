public class Prime {
    public static void main(String[] args) {
        
        int[] tab={1,3,7,9,5,2};
        System.out.println(prime(tab));


    }
    public static String prime(int[] tab){
        String s="";
        
        for(int i=0;i<tab.length;i++){
            boolean ok=false;
            for(int j=1;j<tab[i];j++){
            if(tab[i]%j==0){
                ok=true;
            }
        }
        if(ok==false)
        s+=tab[i]+" ";
        }
        return s;
    }
}
