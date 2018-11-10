package ba.unsa.etf.rpr;

public class Pawn extends ChessPiece{

    public Pawn(String position, Color color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(String position) {
        isPositionGenerallyLegal(position);
        return false;
    }

    @Override
    public void move(String position) {

    }
}
