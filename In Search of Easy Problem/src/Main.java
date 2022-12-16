import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());

        String word = input.nextLine();
        if(word.contains("1")){
            System.out.print("HARD");
        }
        else{
            System.out.print("EASY");
        }
    }
}
