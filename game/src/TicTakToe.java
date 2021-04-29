
    import java.util.Scanner;

    class TicTacToe {
        final char SIGN_X = 'x';
        final char SIGN_O = 'o';
        final char SIGN_EMPTY = '.';
        char[][] dashboard;
        Scanner scanner;

        public static void main(String[] args) {
            new TicTacToe().game();
        }

        TicTacToe() {

            scanner = new Scanner(System.in);
            dashboard = new char[3][3];
        }// dashti konstruktor
        void initDashboard() {
            for (int row = 0; row < 3; row++)
                for (int col = 0; col < 3; col++)
                    dashboard[row][col] = SIGN_EMPTY;
        }

        void printDashboard() { //dashti vijakna
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++)
                    System.out.print(dashboard[row][col] + " ");
                System.out.println();
            }
        }


        void turnHuman1() { // ete sxal kam zbaxvaca vandak@ norica krknum, -1 vor arrayi mej tex ani
            int x, y;
            do {
                System.out.println("Enter X and Y (1..3):");
                x = scanner.nextInt() - 1;
                y = scanner.nextInt() - 1;
            } while (!isCellValid(x, y));
            dashboard[y][x] = SIGN_X;
        }
        void turnHuman2() { // ete sxal kam zbaxvaca vandak@ norica krknum, -1 vor arrayi mej tex ani
            int x, y;
            do {
                System.out.println("Enter X and Y (1..3):");
                x = scanner.nextInt() - 1;
                y = scanner.nextInt() - 1;
            } while (!isCellValid(x, y));
            dashboard[y][x] = SIGN_O;
        }
        boolean isCellValid(int x, int y) { // stuguma vandaki valid linel@
            if (x < 0 || y < 0 || x >= 3 || y >= 3) {
                return false;
            } else {
                return dashboard[y][x] == SIGN_EMPTY;
            }
        }

        boolean checkWin(char symbol) { // sranov stugelu em vor tox/syun/ankyunagit nuyn symbol@ lini
            for (int i = 0; i < 3; i++) {
                if ((dashboard[i][0] == symbol && dashboard[i][1] == symbol &&
                        dashboard[i][2] == symbol) ||
                        (dashboard[0][i] == symbol && dashboard[1][i] == symbol &&
                                dashboard[2][i] == symbol)) {
                    return true;
                } else if ((dashboard[0][0] == symbol && dashboard[1][1] == symbol &&
                        dashboard[2][2] == symbol) ||
                        (dashboard[2][0] == symbol && dashboard[1][1] == symbol &&
                                dashboard[0][2] == symbol)) {
                    return true;
                }
            }
            return false;
        }

        boolean isTableFull() {
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    if (dashboard[row][col] == SIGN_EMPTY) {
                        return false;
                    }
                }
            }
            return true;
        }

        void game() {
            initDashboard();
            while (true) {
                turnHuman1();
                if (checkWin(SIGN_X)) {
                    System.out.println("Human1 WIN!");
                    break;
                }
                turnHuman2();
                if (checkWin(SIGN_O)) {
                    System.out.println("Human1 WIN!");
                    break;
                }
                printDashboard();
                if (isTableFull()) {
                    System.out.println("Sorry, DRAW!");
                    break;
                }

            }
            printDashboard();
        }
    }

