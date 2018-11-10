package ba.unsa.etf.rpr;

public class Bishop extends ChessPiece {

    public Bishop(String position, Color color) {
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
