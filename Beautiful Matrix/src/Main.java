import java.util.Scanner;
import java.util.regex.Matcher;
//package JavaProgram;
//import java.utils.Arrays;

public class Main {
    public static void main(String[] args){
        String a,b,c,d,e;
        Scanner input = new Scanner(System.in);
        a = input.nextLine();
        b = input.nextLine();
        c = input.nextLine();
        d = input.nextLine();
        e = input.nextLine();

        //char array[];

        int count=0;

        if(a.contains("1") ){
            count=2 + Math.abs(a.replaceAll("\\s+","").indexOf("1")-2);
            //System.out.println("chucky");
            //char [] array= a.toCharArray();


        }
        else if (b.contains("1")){
            count=1 +Math.abs(b.replaceAll("\\s+","").indexOf("1")-2);
            //char [] array= b.toCharArray();
        }
        else if (d.contains("1")){
            count=1 + Math.abs(d.replaceAll("\\s+","").indexOf("1")-2);
            //char [] array= d.toCharArray();
        }
        else if (e.contains("1")){
            count=2 +Math.abs(e.replaceAll("\\s+","").indexOf("1")-2);
            //char [] array= b.toCharArray();
        }
        else if(c.contains("1")){
            count=0 +Math.abs(c.replaceAll("\\s+","").indexOf("1")-2);
            //char [] array= c.toCharArray();
        }

        System.out.println(count);
        //System.out.println(Math.abs(((c.replaceAll("\\s+ ","")).indexOf("1"))-2));
        //System.out.println(a.replaceAll("\\s+",""));
        //System.out.println(a.replaceAll("\\s+","").indexOf("1"));
        //System.out.println((a.replaceAll("\\s+","").indexOf("1"))-2);

    }
}