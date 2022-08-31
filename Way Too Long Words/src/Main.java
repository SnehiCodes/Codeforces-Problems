import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();

        String[] array1 = new String[n];

        for (int i = 0; i < n; i++) {
            array1[i] = input.nextLine();
        }



        //String word = input.nextLine();
        for(int i=0;i<n;i++){
            if(array1[i].length()>10){
                System.out.print(array1[i].substring(0,1));
                System.out.print(array1[i].length()-2);
                System.out.println(array1[i].substring(array1[i].length()-1));

            }
            else{
                System.out.println(array1[i]);
            }
        }


    }
}