import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n= Integer.parseInt(input.nextLine());
        String[] array1= new String[n];
        for(int i=0;i<n;i++){
            array1[i]= input.nextLine();
        }
        for(int i=0;i<n;i++){
            int a= Integer.parseInt(array1[i].substring(0,1));
            int b= Integer.parseInt(array1[i].substring(1,2));
            int c= Integer.parseInt(array1[i].substring(2,3));

            int j= Integer.parseInt(array1[i].substring(3,4));
            int k= Integer.parseInt(array1[i].substring(4,5));
            int l= Integer.parseInt(array1[i].substring(5));

            if(a+b+c == j+k+l)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }




        }
    }
}
