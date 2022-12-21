import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        String line1 = input.nextLine();
        String[] array1 = line1.split(" ");
        int [] arr1 = new int[array1.length];
        for(int i=0;i< array1.length;i++){
            arr1[i]= Integer.parseInt(array1[i]);
        }

        String line2 = input.nextLine();
        int [] arr2 = new int[line2.length()];
        for(int i=0;i< arr2.length;i++){
            arr2[i]= Integer.parseInt(String.valueOf(line2.charAt(i)));
        }
        int count =0;
        for(int i=0;i< arr2.length;i++){
            if(arr2[i]==1){
                count= count+ arr1[0];

            }
            else if(arr2[i]==2){
                count= count+ arr1[1];

            }
            else if(arr2[i]==3){
                count= count+ arr1[2];

            }
            else if(arr2[i]==4){
                count= count+ arr1[3];

            }

    }System.out.println(count);
}}
