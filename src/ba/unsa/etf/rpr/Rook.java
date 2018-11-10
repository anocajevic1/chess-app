package ba.unsa.etf.rpr;

public class Rook extends ChessPiece {

    public Rook(String position, Color color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(String position) {
        isPositionGenerallyLegal(position);
        return true;
    }

    @Override
    public void move(String position) {

    }
}
