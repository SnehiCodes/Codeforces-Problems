import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        int []array1= new int[n];
        for(int i=0;i<n;i++){
            array1[i]= Integer.parseInt(input.nextLine());
        }
        for(int i=0;i<n;i++){
           if(array1[i]<=1399){
               System.out.println("Division 4");
           }

           else if(1400<= array1[i]&& array1[i]<=1599){
               System.out.println("Division 3");
           }

           else if(1600<= array1[i]&& array1[i]<=1899){
               System.out.println("Division 2");
           }

           else if(array1[i]>=1900){
               System.out.println("Division 1");
           }
        }

    }
}
