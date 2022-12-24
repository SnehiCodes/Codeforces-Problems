import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String line1 = input.nextLine();
        String[] array1 = line1.split("");

        String line2 = input.nextLine().replaceAll(" ","");

        if(line2.contains(array1[0]) || line2.contains(array1[1])){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
