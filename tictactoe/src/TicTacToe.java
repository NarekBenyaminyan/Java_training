import java.util.Scanner;

public class TicTacToe {

    public static void displayBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] board = new char[3][3];
        board[0][0] = ' ';
        board[0][1] = ' ';
        board[0][2] = ' ';
        board[1][1] = ' ';
        board[1][2] = ' ';
        board[2][1] = ' ';
        board[2][2] = ' ';


        while (true) {

            Scanner s = new Scanner(System.in);
            displayBoard(board);
            System.out.println("Player 1 choose your cords");
            int p1Row = s.nextInt();
            int p1Collum = s.nextInt();
            board[p1Row][p1Collum] = 'X';
            if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
                if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
                    if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
                        if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
                            if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
                                if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
                                    if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
                                        if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
                                            if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
                                                if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
                                                    if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
                                                    }
                                                }
                                            }
                                        }

                                    }
                                }

                            }

                        }

                    }
                }
                System.out.println("PLayer1 is winner");

            }

            System.out.println("Player 2 choose your cords");
            int p2Row = s.nextInt();
            int p2Collum = s.nextInt();
            board[p2Row][p2Collum] = 'O';

                if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
                    if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
                        if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
                            if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {
                                if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') {
                                    if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
                                        if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
                                            if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
                                                if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
                                                    if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
                                                        if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
                                                        }
                                                    }
                                                }
                                            }

                                        }
                                    }

                                }

                            }

                        }

                    }

                }
                System.out.println("Winner is Player2");

            }
        }

    }





