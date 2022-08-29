import java.util.ArrayList;
import java.util.*;


public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String word = input.nextLine();

        String[] array ;

        array = word.split("\\+");

        int[]array = Str

        mergeSort(array);


        //Arrays.sort(array);
        for(int i=0;i< array.length-1;i++){
            System.out.print(array[i]);
            System.out.print("+");
        }
        //System.out.print(array[array.length]);
    }

    private static void mergeSort(int[] array){

        int length = array.length;
        if(length<=1)return;

        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length-middle];

        int i=0; //left array
        int j =0;//right array

        for(; i<length;i++){
            if(i<middle){
                leftArray[i]=array[i];
            }
            else
            {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray,rightArray,array);

    }

    private static void merge(int[] leftArray,int[] rightArray,int[]array1){

    }
}
