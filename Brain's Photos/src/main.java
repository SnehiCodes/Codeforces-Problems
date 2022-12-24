import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] array1 = (input.nextLine()).split(" ");
        int n= Integer.parseInt(array1[0]);
        int m= Integer.parseInt(array1[1]);

        String [][] array2 = new String[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array2[i][j]= String.valueOf(input.nextLine().split(""));
            }
        }
        int count =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(array2[i][j].equals("B")
                || array2[i][j].equals("W")
                || array2[i][j].equals("G"))
                {
                    count = count +0;
                }
                else{
                    count++;
                }
            }

            }
            System.out.print(count);
            if(count ==0){
                System.out.print("#Black&White");
            }
            else{
                System.out.print("#Color");
        }
    }
}
