import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String line =input.nextLine();

        String parts[] = line.split(" ");


        int k= Integer.parseInt(parts[0]);
        int n= Integer.parseInt(parts[1]);
        int w= Integer.parseInt(parts[2]);


        int p = (2*k)+(w*k)-k;
        int r = w*p/2;


        int a =(r -n) ;

        if(a<=0){
            System.out.println(0);
        }
        else{
            System.out.println(a);
        }

    }
}
