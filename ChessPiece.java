public abstract class ChessPiece {

    protected Position position;

    public ChessPiece(Position position) {
        this.position = position;
    }

    public abstract Position[] moves(Position p);

    public abstract Position getPosition();
}
