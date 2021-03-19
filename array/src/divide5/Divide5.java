package divide5;

public class Divide5 {
    public static void main(String[] args) {
        int[] nums = new int[140];
        for (int i = 0; i < nums.length ; i++) {
            if (i % 5 == 0) {
                nums[i] = i;
                System.out.println(nums[i]);

            }
        }
    }
}
