import java.util.Scanner;
import java.util.Arrays;
public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] array1 = line.split(" ");
        int [] array2 = new int[3];
        for(int i=0;i< array1.length;i++){
            array2[i] = Integer.parseInt(array1[i]);
        }
        Arrays.sort(array2);

        int k= array2[1]-array2[0];
        int l= array2[2]-array2[1];

        int answer = k+l;
        System.out.print(answer);
    }
}
