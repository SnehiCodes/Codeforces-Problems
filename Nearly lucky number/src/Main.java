import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);


        String nums= input.nextLine();

        char[] ch = nums.toCharArray();

        int count = 0;



        for(int i = 0;i<nums.length();i++){

            if (ch[i] == 55 ||  ch[i] == 52){
                count=count+1;


            }
        }
        if(count ==4 || count == 7){
            System.out.println("YES");

        }
        else{
            System.out.println("NO");

        }

        //String[] huh = input.nextLine();
    }
}
