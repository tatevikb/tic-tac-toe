import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Board board = new Board(input);
        board.print();
    }

}
