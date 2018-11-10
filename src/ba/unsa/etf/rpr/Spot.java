package ba.unsa.etf.rpr;

public class Spot {
    String position;
    boolean isOccupied_;
    ChessPiece pieceOccupying; // mozda nepotrebno
    ChessPiece.Color spotColor; // ovo mi treba samo zbog lovca pa tako da mozda i izbacim

    public Spot (String position) {
        super();
        this.position = position;
        pieceOccupying = null; //kada stvaramo novo polje nema nikakve figure na njemu
        isOccupied_= false;
    }

    public Spot (String position, ChessPiece piece ) { // za svaki slucaj da imam konstruktor za ovo
        super();
        this.position = position;
        this.pieceOccupying = piece;
        isOccupied_ = true;

    }

    public void occupySpot (ChessPiece piece) { // stavljanje figure na polje
        if(this.pieceOccupying == null) //ako nema figure
            this.pieceOccupying = piece;
         //provjeri mozel pojesti se figura ako moze pojedi makni iz liste suprotnog igraca i stavi novu figuru
    }

    public boolean isOccupied() {
        return isOccupied_;
    }

    public ChessPiece releaseSpot(){ // prilikom ubijanja figure
        ChessPiece releasedPiece = this.pieceOccupying;
        this.pieceOccupying = null;
        return releasedPiece;
    }
}
