package ba.unsa.etf.rpr;

public class King extends ChessPiece{
    public static boolean checked; // ovo ce biti true kada neka figura napadne kralja

    public King(String position, Color color) {
        super(position, color);
    }


    @Override
    public boolean isLegalMove(String position) throws IllegalChessMoveException {
        isPositionGenerallyLegal(position);
        // kralj moze samo jedno mjesto da se pomjeri
        char[] currentPosition = this.position.toCharArray();
        char[] newPosition = position.toCharArray();

        if(currentPosition[0] != newPosition[0] || (int)currentPosition[0]+1 != (int) newPosition[0] || (int) currentPosition[0]-1 != (int) newPosition[0] )
            throw new IllegalChessMoveException();



        return false;
    }

    @Override
    public void move(String position) throws IllegalChessMoveException {
        if(position == null || !isLegalMove(position))
            throw new IllegalArgumentException();
        else  {
            position.toUpperCase();
            this.position = position;
        }

    }

    public static boolean isChecked() {
        return  checked;
    }

}
