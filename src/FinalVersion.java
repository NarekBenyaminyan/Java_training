public class FinalVersion {

    public static void main(String[] args) {
        int num = 10;

        String text = "Picsart";
        String[] sym = new String[]{"-", ".", "|", "-"};
        int heightBase = sym.length;
        int height = 2 * heightBase + 1;
        int widthBase = text.length() / 2 + 2;
        int width = text.length() + 4;
        for (int row = 0; row < height; row++) {
            int xc = Math.abs(heightBase - row);
            if (xc == 0) {
                System.out.println("- " + text + " -");
            } else {
                for (int col = 0; col < width; col++) {
                    int yc = Math.abs(widthBase - col);
                    if (col < xc || col > (width - xc - 1) || (col + xc) % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print(sym[sym.length - xc]);
                    }
                }
                System.out.println(" ");
            }

        }
    }
}

