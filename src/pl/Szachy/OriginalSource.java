package pl.Szachy;

public class OriginalSource {
    // Sudoku
    //import java.util.Arrays;
    //
    //public class Exercise3 {
    //    private Integer[][] board;
    //
    //    public Exercise3(Integer[][] board) {
    //        this.board = board;
    //    }
    //
    //    public static Exercise3 sampleBoard() {
    //        Integer[][] board = new Integer[][] {
    //           new Integer[] {2,    null, null, 6,    null, 7,    5,    null, null},
    //           new Integer[] {null, null, null, null, null, null, null, 9,    6},
    //           new Integer[] {6,    null, 7,    null, null, 1,    3,    null, null},
    //
    //           new Integer[] {null, 5,    null, 7,    3,    2,    null, null, null},
    //           new Integer[] {null, 7,    null, null, null, null, null, 2,    null},
    //           new Integer[] {null, null, null, 1,    8,    9,    null, 7,    null},
    //
    //           new Integer[] {null, null, 3,    5,    null, null, 6,    null, 4},
    //           new Integer[] {8,    4,    null, null, null, null, null, null, null},
    //           new Integer[] {null, null, 5,    2,    null, 6,    null, null, 8}
    //        };
    //        return new Exercise3(board);
    //    }
    //
    //    public static void main(String[] args) {
    //        Exercise3 sampleBoard = sampleBoard();
    //        System.out.println(Arrays.deepToString(sampleBoard.board));
    //    }
    //}
    // Szachy
    //package pl.samouczekprogramisty.kursjava.arrays.exercise;
    //
    //
    //import java.util.Arrays;
    //
    //public class Exercise4 {
    //    // Sa lepsze sposoby, jednak na tym etapie taki sposob jest OK :)
    //    // Jesli jestes ciekawy jak zrobic to lepiej poczytaj o typie wyliczeniowym.
    //    // http://www.samouczekprogramisty.pl/typ-wyliczeniowy-w-jezyku-java/
    //    public static final int EMPTY = 0;
    //    public static final int B_PAWN = 1;
    //    public static final int B_ROOK = 2;
    //    public static final int B_BISHOP = 3;
    //    public static final int B_KNIGHT = 4;
    //    public static final int B_QUEEN = 5;
    //    public static final int B_KING = 6;
    //
    //    public static final int W_PAWN = 7;
    //    public static final int W_ROOK = 8;
    //    public static final int W_BISHOP = 9;
    //    public static final int W_KNIGHT = 10;
    //    public static final int W_QUEEN = 11;
    //    public static final int W_KING = 12;
    //
    //    private int[][] board = new int[8][8];
    //
    //    public static int[][] game5FinalState() {
    //        return new int[][] {
    //            new int[] {EMPTY,    EMPTY,    EMPTY,    EMPTY,    EMPTY,   EMPTY,    EMPTY,    EMPTY},
    //            new int[] {B_PAWN,   B_PAWN,   EMPTY,    EMPTY,    EMPTY,   EMPTY,    W_PAWN,   EMPTY},
    //            new int[] {EMPTY,    EMPTY,    EMPTY,    EMPTY,    EMPTY,   EMPTY,    EMPTY,    EMPTY},
    //            new int[] {EMPTY,    EMPTY,    EMPTY,    EMPTY,    EMPTY,   EMPTY,    EMPTY,    EMPTY},
    //            new int[] {EMPTY,    B_KING,   B_PAWN,   EMPTY,    EMPTY,   W_KNIGHT, EMPTY,    EMPTY},
    //            new int[] {EMPTY,    B_KNIGHT, EMPTY,    EMPTY,    W_ROOK,  EMPTY,    W_PAWN,   EMPTY},
    //            new int[] {EMPTY,    EMPTY,    EMPTY,    B_ROOK,   EMPTY,   EMPTY,    EMPTY,    EMPTY},
    //            new int[] {EMPTY,    W_KING,   EMPTY,    EMPTY,    EMPTY,   EMPTY,    EMPTY,    EMPTY},
    //        };
    //    }
    //
    //    public static void main(String[] args) {
    //        int[][] finalState = game5FinalState();
    //        System.out.println(Arrays.toString(finalState));
    //    }
    //
    //}
}
