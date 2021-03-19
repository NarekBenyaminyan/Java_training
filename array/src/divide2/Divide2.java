package divide2;

public class Divide2 {
    public static void main(String[] args) {
        int[] nums = new int[50];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                count = count +1;
            }


        }
        System.out.println(count);
    }
}