import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] nums = new int[input.length];
        int left = 1, right = 0, h = sc.nextInt();
        for (int i = 0; i < nums.length; i++){
            nums[i] = Integer.parseInt(input[i]);
            if (nums[i] > right) right = nums[i];
        }
        while (left <= right){
            int mid = (left + right) / 2;
            if (time(nums, mid) <= h) right = mid - 1;
            else left = mid + 1;
        }
        System.out.println(left);
    }
    private static int time(int[] nums, int speed){
        int res = 0;
        for (int num: nums){
            res += num / speed;
            if (num % speed != 0) res++;
        }
        return res;
    }
}