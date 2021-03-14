public class first {
    public static void main(String[] args) {
      int num = 10;
        String[] elements  = new String[] {"-", ". .", "| | |", "- - - -","- PICSART -"};

        for (int i = 1; i <= num/2 ; ++i){

            for (int j = num/2; j > i; --j){
                System.out.print("+");
            }

            for (int j = 5; j > i ; --j){

            }
            System.out.print(elements[i-1]);

            System.out.println();
        }
    for (int i = num/2 ; i > 1; --i){

            for (int j = num/2; j >= i; --j){
                System.out.print("+");
            }

            for (int j = 1; j <= i; ++j){

            }
                  System.out.print(elements[i-2]);

            System.out.println();
        }
    }
}

