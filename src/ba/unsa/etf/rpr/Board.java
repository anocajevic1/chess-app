package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Spot> spots = new ArrayList<Spot>() ;

    // stvara 64 prazna polja
    public Board(){
        super();
        int i = 8;

        while(i>0){
            String s = new StringBuilder().append('A').append(i).toString();
            spots.add(new Spot(s));
            i--;
        }

        i=8;
        while(i>0){
            String s = new StringBuilder().append('B').append(i).toString();
            spots.add(new Spot(s));
            i--;
        }

        i=8;
        while(i>0){
            String s = new StringBuilder().append('C').append(i).toString();
            spots.add(new Spot(s));
            i--;
        }



        i=8;
        while(i>0){
            String s = new StringBuilder().append('D').append(i).toString();
            spots.add(new Spot(s));
            i--;
        }
        i=8;
        while(i>0){
            String s = new StringBuilder().append('E').append(i).toString();
            spots.add(new Spot(s));
            i--;
        }


        i=8;
        while(i>0){
            String s = new StringBuilder().append('F').append(i).toString();
            spots.add(new Spot(s));
            i--;
        }


        i=8;
        while(i>0){
            String s = new StringBuilder().append('G').append(i).toString();
            spots.add(new Spot(s));
            i--;
        }


        i=8;
        while(i>0){
            String s = new StringBuilder().append('H').append(i).toString();
            spots.add(new Spot(s));
            i--;
        }


    }

    public void setBoardAtBeginning()  {
        Program.whitePlayer
    }

    public void move(Class type, ChessPiece.Color color, String position) {

    }

    public void move(String oldPosition, String newPosition)  {

    }

    public boolean isCheck(ChessPiece.Color color)  { // provjerava da li igrac s bojom color u sahu atm
        return King.isChecked();
    }

}
