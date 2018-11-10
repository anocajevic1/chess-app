package ba.unsa.etf.rpr;

public class King extends ChessPiece{
    public static boolean checked; // ovo ce biti true kada neka figura napadne kralja

    public King(String position, Color color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(String position) {
        isPositionGenerallyLegal(position);
        return false;
    }

    @Override
    public void move(String position) {
        if(position == null || !isLegalMove(position))
            throw new IllegalArgumentException();

    }

    public static boolean isChecked() {
        return  checked;
    }

}
