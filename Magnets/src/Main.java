//import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());

        String[] array1 = new String[n];
        int count =1;
        for(int i=0;i<n;i++){
            array1[i]= input.nextLine();
        }
        for(int i=0;i<n-1;i++){
            if(array1[i].equals(array1[i+1]) ){

            }
            else {count++;}

        }System.out.println(count);
    }
}
