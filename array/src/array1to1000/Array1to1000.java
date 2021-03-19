package array1to1000;

public class Array1to1000 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1001;
        int c = b - a;
        int anarray[];
        anarray = new int[c];

        for (int i = 0; i < c; i++){
            anarray[i] = i + 1;
            System.out.println(anarray[i]);
        }
    }
}
