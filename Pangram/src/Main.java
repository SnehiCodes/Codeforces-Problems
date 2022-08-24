import java.util.*;

public class Main {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();

        String line1 = input.nextLine();

        String line =line1.toLowerCase();
        //line.toLowerCase();
        //System.out.println(line);



        //if(n<26){
        //    System.out.println("NO");
        //}

        if (line.contains("a") &
                line.contains("b") &
                line.contains("c") &
                line.contains("d") &
                line.contains("e") &
                line.contains("f") &
                line.contains("g") &
                line.contains("h") &
                line.contains("i") &
                line.contains("j") &
                line.contains("k") &
                line.contains("l") &
                line.contains("m") &
                line.contains("n") &
                line.contains("o") &
                line.contains("p") &
                line.contains("q") &
                line.contains("r") &
                line.contains("s") &
                line.contains("t") &
                line.contains("u") &
                line.contains("v") &
                line.contains("w") &
                line.contains("x") &
                line.contains("y") &
                line.contains("z") )
         {System.out.println("YES");
                 }
        else{
            System.out.println("NO");}

    }
}
