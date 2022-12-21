import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());

        for(int i=0;i<n;i++){
           String line1 = input.nextLine();

            String line2 = input.nextLine();
            String[] array2 =line2.split("");

            int count =0;
            for(int j=0;j<line2.length()-1;j++){

                int k= Math.abs(line1.indexOf(array2[j])- line1.indexOf(array2[j+1]));
                count = count+k;

            }
            System.out.println(count);
        }

    }}

