import java.util.Scanner;
import java.lang.Math;
public class main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] array1 = line.split(" ");

        int n= Integer.parseInt(array1[0]);
        int m= Integer.parseInt(array1[1]);
        int k= Integer.parseInt(array1[2]);

        int low = Math.min(m,k);
        if(n>low){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }

    }
}
