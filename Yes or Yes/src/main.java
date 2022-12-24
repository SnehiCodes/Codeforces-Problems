import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());

        for(int i=0;i<n;i++){
            if(input.nextLine().toLowerCase().equals("yes")){
                System.out.println("YES");

            }
            else{
                System.out.println("NO");

            }
            }
    }
}
