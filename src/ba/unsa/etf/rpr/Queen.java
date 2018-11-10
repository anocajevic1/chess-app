package ba.unsa.etf.rpr;

public class Queen extends ChessPiece{

    public Queen(String position, Color color) {
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
