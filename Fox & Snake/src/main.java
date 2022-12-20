import java.util.Scanner;
public class main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] array1= (line.split(" "));

        int n=Integer.parseInt(array1[0]);
        int m=Integer.parseInt(array1[1]);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){

                if(i%2!=0){
                    System.out.print("#");
                }

                else if(i%2==0 && i%4!=0){
                    for(j=1;j<=m-1;j++){
                        System.out.print(".");
                    }System.out.print("#");
                }
                else if(i%4==0 && i%2==0){
                    System.out.print("#");
                    for(j=1;j<=m-1;j++){
                        System.out.print(".");
                    }
                }


            }System.out.println(" ");
        }
    }
}
