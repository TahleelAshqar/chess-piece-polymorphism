public class Main {
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard();
        board.addPiece(new Knight(new Position(5, 2)));
        board.addPiece(new Bishop(new Position(3, 3)));
        board.addPiece(new Knight(new Position(6, 6)));

        System.out.println(board);
        System.out.println(board.threats(0, 1));
        System.out.println(board.whoThreatsWho());
    }
}
