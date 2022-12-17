import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        String s1= input.nextLine();
        String s2= input.nextLine();

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i))
            {
                System.out.print("0");
            }
            else{
                System.out.print("1");
            }

        }
    }
}
