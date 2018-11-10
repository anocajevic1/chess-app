package ba.unsa.etf.rpr;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class ChessPiece {
    String position;
    public Color pieceColor;

    public static enum Color {
        BLACK, WHITE
    }

    public String getPosition() {
        return position;
    }
    public Color getColor() {
        return pieceColor;
    }
    public abstract boolean isLegalMove (String position);
    public abstract void move(String position);

    public ChessPiece(String position, Color color) {
        isPositionGenerallyLegal(position);
        this.position = position;
        this.pieceColor = color;
    }

    public boolean wrongLetterFormat(String position){
        if(!position.startsWith("A") && !position.startsWith("B") && !position.startsWith("C") && !position.startsWith("D") && !position.startsWith("E") && !position.startsWith("F")
                && !position.startsWith("G") && !position.startsWith("H"))
            return true;
        return false;
    }

    public static boolean stringContainsNumber(String s)    {
        Pattern p = Pattern.compile( "[1-8]" );
        Matcher m = p.matcher( s );
        return m.find();
    }

    public boolean wrongNumberFormat(String position){
        String s = position.substring(1,1);
        return stringContainsNumber(s);
    }

    public void isPositionGenerallyLegal(String position) {
        if(position.length()>2 || wrongLetterFormat(position) || wrongNumberFormat(position) ) // predugo da bi bilo pozicija, nepravilno slovo i nepravilan broj
            throw new IllegalArgumentException();
    }


};
