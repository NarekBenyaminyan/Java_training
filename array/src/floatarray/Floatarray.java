package floatarray;

public class Floatarray {
    public static void main(String[] args) {
        int anArray[];
        int a = (int) 24.12f;
        int b = (int) 467.23f;
        int c = b - a;
        int[] nums = new int[c];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = 25 + i ;
            System.out.println(nums[i]);
        }




    }
}

