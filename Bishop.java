public class Bishop extends ChessPiece {

    public Bishop(Position position) {
        super(position);
    }

    @Override
    public Position[] moves(Position p) {
        // Bishop moves diagonally any number of squares
        // board is 8x8 with rows and columns 1..8
        Position[] temp = new Position[13]; // max possible moves for a bishop
        int count = 0;

        int row = p.getRow();
        int col = p.getColumn();

        // up-right
        int r = row + 1;
        int c = col + 1;
        while (r <= 8 && c <= 8) {
            temp[count++] = new Position(r, c);
            r++;
            c++;
        }

        // up-left
        r = row + 1;
        c = col - 1;
        while (r <= 8 && c >= 1) {
            temp[count++] = new Position(r, c);
            r++;
            c--;
        }

        // down-right
        r = row - 1;
        c = col + 1;
        while (r >= 1 && c <= 8) {
            temp[count++] = new Position(r, c);
            r--;
            c++;
        }

        // down-left
        r = row - 1;
        c = col - 1;
        while (r >= 1 && c >= 1) {
            temp[count++] = new Position(r, c);
            r--;
            c--;
        }

        Position[] result = new Position[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        // Format exactly like in example: Bishop at (3, 3)
        return "Bishop at " + position.toString();
    }
}
