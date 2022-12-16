import java.util.*;

public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String givers = input.nextLine();


        String [] words = givers.split("\\s");
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        for(int i=0;i<n;i++){
            arr.add(Integer.valueOf(words[i]));
        }
        for(int i=1;i<=n;i++){
            System.out.print((arr.indexOf(i))+1);
            if(i<n){
                System.out.print(" ");
            }
        }




    }
}
