import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int n= Integer.parseInt(input.nextLine());
        String [] array = new String[n];
        for(int i=0;i<n;i++){
            array[i]= input.nextLine();
            }
        int count =0;
        for(int j=0;j<n;j++){
            if(array[j].equals("Tetrahedron")){
                count=count+4;
            }
            else if(array[j].equals("Cube")){
                count=count+6;
            }
            else if(array[j].equals("Octahedron")){
                count=count+8;
            }
            else if(array[j].equals("Dodecahedron")){
                count=count+12;
            }
            else if(array[j].equals("Icosahedron")){
                count=count+20;
            }
        }
        System.out.println(count);

}}
