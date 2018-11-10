package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Player {
    public final int PAWNS = 8;

    // dodaje sve figure u listu figura za svakog igraca
    private void addPieces(ChessPiece.Color color) {
       for(int i=1; i<=PAWNS; i++)  { // pijuni

           if(color == ChessPiece.Color.WHITE){ // ako su bijeli pijuni
               String s = new StringBuilder().append('B').append(i).toString();
               pieces.add(new Pawn(s,color));
           } else { // ako su crni
               String s = new StringBuilder().append('G').append(i).toString();
               pieces.add(new Pawn(s,color));
           }

       }

       //topovi
        if(color == ChessPiece.Color.WHITE){ // ako su bijeli topovi
            String s = new StringBuilder().append('A').append(1).toString();
            pieces.add(new Rook(s,color));
            s = new StringBuilder().append('A').append(8).toString();
            pieces.add(new Rook(s,color));

        } else { // ako su crni
            String s = new StringBuilder().append('H').append(1).toString();
            pieces.add(new Rook(s,color));
            s = new StringBuilder().append('H').append(8).toString();
            pieces.add(new Rook(s,color));
        }

       //lovci
        if(color == ChessPiece.Color.WHITE){ // ako su bijeli lovci
            String s = new StringBuilder().append('A').append(3).toString();
            pieces.add(new Bishop(s,color));
            s = new StringBuilder().append('A').append(6).toString();
            pieces.add(new Bishop(s,color));

        } else { // ako su crni
            String s = new StringBuilder().append('H').append(3).toString();
            pieces.add(new Bishop(s,color));
            s = new StringBuilder().append('H').append(6).toString();
            pieces.add(new Bishop(s,color));
        }

        //konji
        if(color == ChessPiece.Color.WHITE){ // ako su bijeli konji
            String s = new StringBuilder().append('A').append(2).toString();
            pieces.add(new Knight(s,color));
            s = new StringBuilder().append('A').append(7).toString();
            pieces.add(new Knight(s,color));

        } else { // ako su crni
            String s = new StringBuilder().append('H').append(2).toString();
            pieces.add(new Knight(s,color));
            s = new StringBuilder().append('H').append(7).toString();
            pieces.add(new Knight(s,color));
        }


        if(color == ChessPiece.Color.WHITE)
        pieces.add(new King("A5", color)); // bijeli kralj
        else
            pieces.add(new King("H5", color)); // crni kralj

        if(color == ChessPiece.Color.WHITE)
            pieces.add(new Queen("A4", color)); // bijela kraljica
        else
            pieces.add(new Queen("H5", color)); // crna kraljica


    }

    public List<ChessPiece> pieces = new ArrayList<ChessPiece>();
    public ChessPiece.Color playerColor;


   public void setPlayerColor(boolean isWhite) {
       if(isWhite)  {
            playerColor = ChessPiece.Color.WHITE;
            addPieces(playerColor);
       } else {
           playerColor = ChessPiece.Color.BLACK;
           addPieces(playerColor);
    }

   }
}





