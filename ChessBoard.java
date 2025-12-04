public class ChessBoard {

    private ChessPiece[] pieces;

    public ChessBoard() {
        // size 10 as required
        pieces = new ChessPiece[10];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (ChessPiece piece : pieces) {
            if (piece != null) {
                sb.append(piece.toString()).append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    public void addPiece(ChessPiece p) {
        for (int i = 0; i < pieces.length; i++) {
            if (pieces[i] == null) {
                pieces[i] = p;
                return;
            }
        }
        // array full → do nothing
    }

    public boolean threats(int p1, int p2) {
        // index checks + empty cell checks
        if (p1 < 0 || p1 >= pieces.length ||
            p2 < 0 || p2 >= pieces.length) {
            return false;
        }
        if (pieces[p1] == null || pieces[p2] == null) {
            return false;
        }

        ChessPiece attacker = pieces[p1];
        ChessPiece target   = pieces[p2];

        Position[] moves = attacker.moves(attacker.getPosition());
        Position targetPos = target.getPosition();

        for (Position move : moves) {
            if (move.equals(targetPos)) {
                return true;
            }
        }
        return false;
    }

    public String whoThreatsWho() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < pieces.length; i++) {
            if (pieces[i] == null) continue;

            for (int j = 0; j < pieces.length; j++) {
                if (i == j) continue;
                if (pieces[j] == null) continue;

                if (threats(i, j)) {
                    sb.append(pieces[i].toString())
                      .append(" threats ")
                      .append(pieces[j].toString())
                      .append(System.lineSeparator());
                }
            }
        }
        return sb.toString();
    }
}
