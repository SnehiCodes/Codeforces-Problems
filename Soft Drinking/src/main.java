import java.util.Scanner;

import java.lang.Math;
public class main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        String line = input.nextLine();

        String array1[]= line.split(" ");

        int n= Integer.parseInt(array1[0]);
        int k= Integer.parseInt(array1[1]);
        int l= Integer.parseInt(array1[2]);
        int c= Integer.parseInt(array1[3]);
        int d= Integer.parseInt(array1[4]);
        int p= Integer.parseInt(array1[5]);
        int nl= Integer.parseInt(array1[6]);
        int np= Integer.parseInt(array1[7]);

        int drinkpf = (k*l)/nl;
        int limes = c*d;
        int salt = p/np;
        int sec =Math.min(drinkpf,limes);
        int last =Math.min(sec,salt);
        int ans= last/n;

        System.out.print(ans);

    }
}
