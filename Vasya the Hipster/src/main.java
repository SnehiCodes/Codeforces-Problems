import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String array1[] = line.split(" ");

        int k= Math.min(Integer.parseInt(array1[1]),Integer.parseInt(array1[0]));
        int l= Math.max(Integer.parseInt(array1[1]),Integer.parseInt(array1[0]));

        int m= (l-k)/2;
        System.out.print(k);
        System.out.print(" ");
        System.out.print(m);
    }
}
