package oddelements;

public class Oddelements {
    public static void main(String[] args) {

        int a = 20;
        int b = -20;
        int c = a - b;
        int[] nums = new int[c];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i - 20 ;
            if(nums[i] % 2 !=0){
                System.out.println(nums[i]);
            }



        }
    }
}
