import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        

        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        String con=sc1.nextLine();

        String tab[]=new String[len];
        tab=con.split(" ");

        
        int res=1;
        for(String s:tab){
            res*=(Integer.parseInt(s));
        }

        System.out.println(res);
    }
}