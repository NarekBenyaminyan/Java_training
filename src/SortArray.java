public class SortArray {


    public static void main(String[] args) {
        int anArray[] = {12, 45, 67, 32, 6, 2, 6, 71, 67, 4, 2, 11, 6, 90, 780, 454};
        int temp;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < anArray.length - 1; i++) {
                if (anArray[i] > anArray[i + 1]) {
                    temp = anArray[i + 1];
                    anArray[i + 1] = anArray[i];
                    anArray[i] = temp;
                    isSorted = false;
                }
            }
        }
        for (int i = 0; i < anArray.length; i++) {
            System.out.print(anArray[i] + "  ");
        }
    }
}
