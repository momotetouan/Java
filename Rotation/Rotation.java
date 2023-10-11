import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int nbrotation=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        String s=sc1.nextLine();
        String[] tab=s.split(" ");
        int[] array=new int[tab.length];
        for(int i=0;i<tab.length;i++){
            array[i]=Integer.parseInt(tab[i]);
        }
        
        while(nbrotation!=0){
            int[] tab1=new int[array.length];
            for(int i=0;i<array.length-1;i++){
                tab1[i+1] = array[i];  
            }
            tab1[0]=array[array.length-1];
            array=tab1;
            nbrotation--;
        }

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");  
        }
        


    }
}
