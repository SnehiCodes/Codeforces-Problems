import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String line = input.nextLine();

        String[] MyNum = line.split(" ");

        int m= Integer.parseInt(MyNum[0]);
        int n= Integer.parseInt(MyNum[1]);

        //System.out.println(m);
        //System.out.println(n);


        for(int i=0;i<n;i++){

            if(m%10 !=0){
                m=m-1;
            }
            else{
                m=m/10;
            }


        }
        System.out.println(m);



    }
}
