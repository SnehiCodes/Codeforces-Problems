import java.util.*;

public class threeNums {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String myLine= input.nextLine();
        //System.out.println(myLine);

        String[] parseStr = myLine.split(" ");

        int[] nums = new int[4];
        for(int i = 0; i < 4; i++)
        {
            nums[i] =Integer.parseInt(parseStr[i]);
        }

        Arrays.sort(nums);
        int maxNum = nums[nums.length - 1];

            System.out.print(nums[3]-nums[0]);
            System.out.print(" ");
            System.out.print(nums[3]-nums[1]);
            System.out.print(" ");
            System.out.print(nums[3]-nums[2]);
    }
}