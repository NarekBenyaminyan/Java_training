package multitype;

public class Multitype {
    public static void main(String[] args) {
        int n = 2;
        System.out.println("intput " + " N = " + n);
        System.out.println("Output");

        if (0 < n && n < 21) {

            for (int i = 1; i < 11; i++) {

                int result = n * i;

                System.out.println(result + "=" + n + "*" +i);
            }
        }else{
            System.out.println("Please Input right number");
        }

    }
}
