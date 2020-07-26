public class Board {
    private char[][] cells = null;

    public Board(String input)
    {
        cells = new char[3][3];
        cells[0][0] = input.charAt(0);
        cells[0][1] = input.charAt(1);
        cells[0][2] = input.charAt(2);
        cells[1][0] = input.charAt(3);
        cells[1][1] = input.charAt(4);
        cells[1][2] = input.charAt(5);
        cells[2][0] = input.charAt(6);
        cells[2][1] = input.charAt(7);
        cells[2][2] = input.charAt(8);
    }

    public void print()
    {
        System.out.println("---------");
        System.out.printf("| %c %c %c |\n", cells[0][0], cells[0][1], cells[0][2]);
        System.out.printf("| %c %c %c |\n", cells[1][0], cells[1][1], cells[1][2]);
        System.out.printf("| %c %c %c |\n", cells[2][0], cells[2][1], cells[2][2]);
        System.out.println("---------");
    }
}
