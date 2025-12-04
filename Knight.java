public class Knight extends ChessPiece {

    public Knight(Position position) {
        super(position);
    }

    @Override
    public Position[] moves(Position p) {
        // Knight moves in an L-shape: (2,1) or (1,2)
        Position[] temp = new Position[8];
        int count = 0;

        int row = p.getRow();
        int col = p.getColumn();

        int[][] deltas = {
                { 2,  1},
                { 2, -1},
                {-2,  1},
                {-2, -1},
                { 1,  2},
                { 1, -2},
                {-1,  2},
                {-1, -2}
        };

        for (int[] d : deltas) {
            int r = row + d[0];
            int c = col + d[1];
            if (r >= 1 && r <= 8 && c >= 1 && c <= 8) {
                temp[count++] = new Position(r, c);
            }
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
        // Format: Knight at (5, 2)
        return "Knight at " + position.toString();
    }
}
