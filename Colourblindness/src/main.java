import  java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n= Integer.parseInt(input.nextLine());
        //String s0;
        for(int i=1;i<=n;i++){
            String s0= input.nextLine();
            String s1 = input.nextLine();
            String s2 = input.nextLine();
            String l1 = s1.replaceAll("G","B");
            String l2 = s2.replaceAll("G","B");


            //System.out.println(l1);
            //System.out.println(l2);
            if(l1.equals(l2)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }


        }

    }
}
