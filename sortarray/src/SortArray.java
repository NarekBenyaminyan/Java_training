public class SortArray {
    public static void main(String[] args) {

        int anArray[] = {12, 45, 67, 32, 6, 2, 6, 71, 67, 4, 2, 11, 6, 90, 780, 454};
        int temp; // popoxakana vorov pahelu em met arjeqs, vor elementi korust chlini
      boolean isSorted = false; // qani vor mi angama sortavorelu petqa , enqan pttvi minchev jist sortavori while@ dra hamara

        while (!isSorted) {
                 isSorted = true;
            for (int i = 0; i < anArray.length - 1; i++) { // pttveluya masivis erkarutyamb u kangni, mi angama sortavorelu
                if (anArray[i] > anArray[i + 1]) {
                    temp = anArray[i + 1]; //arjeqneri veragrman hamara.
                    anArray[i + 1] = anArray[i];
                    anArray[i] = temp;
                    isSorted = false;
                }
                }
            }
            


        for (int i = 0; i < anArray.length; i++) {  // elementner@ tpelu hamar
            System.out.print(anArray[i] + "  ");
        }
    }
}





