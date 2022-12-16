import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt((input.nextLine()));

        String[] array1= new String[n];

        for(int i=0;i<n;i++){
            array1[i]= input.nextLine();
        }
       // int on= array1[1].length();
       // System.out.println(array1[1].length());
       // System.out.println(on%2==0);
        //System.out.println(array1[1].substring(0,(on/2)));
       // System.out.println(array1[1].substring(on/2,on));
       // System.out.println(array1[1].substring(0,(on/2)).equals(array1[1].substring(on/2,on)));
        for(int i=0;i<n;i++){
            int k= array1[i].length();
            if(k%2==0){
                if(array1[i].substring(0,(k/2)).equals(array1[i].substring(k/2,k))){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("NO");
            }
        }

    }
}
