import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());

        String line= input.nextLine();
        String[] line1 = line.split(" ");
        int[] arr=new int [n];

        for(int i=0;i< line1.length;i++){
            arr[i]= Integer.parseInt(line1[i]);
        }
        int i=0;
        double count =0;
        for(i=0;i< n;i++){
            count= count+ arr[i];
        }
        double sum= count;
        //System.out.println(count);
        double sum1 = (sum/n);
        System.out.println(sum1);
    }
}
