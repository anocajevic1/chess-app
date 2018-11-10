package ba.unsa.etf.rpr;
import java.lang.*;

public class Knight extends ChessPiece{

    public Knight(String position, Color color) {
        super(position, color);
    }

    @Override
    public void move(String position) {
        if(position == null || !isLegalMove(position))
            throw new IllegalArgumentException();

    }

    @Override
    public boolean isLegalMove(String position) {
        isPositionGenerallyLegal(position);
        return true;
    }
}
