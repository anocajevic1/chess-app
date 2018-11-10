package ba.unsa.etf.rpr;

public class Program {
    // svaka igra saha ima jednu plocu i dva igraca (svaki igrac ima arraylist svojih figurica)
    private Board board = new Board();
    private Player whitePlayer = new Player();
    private Player blackPlayer = new Player();
    private boolean whiteMove = true; // bijeli ima prvi potez
    private boolean abrubted = false; // kod predaje ce biti true
    public Program (){
        super();
    }

    private void whiteMovePrompt()  {
        System.out.println("Bijeli je na potezu: ");
    }
    private void blackMovePrompt()  {
        System.out.println("Crni je na potezu: ");
    }

    public void setWhiteMove(boolean whiteMove) { // da mogu iz vana regulisati ciji je potez
        this.whiteMove = whiteMove;
    }

    public void main(){
        whitePlayer.setPlayerColor(true); // naznaciti da je bijeli i daje mu figure te boje
        blackPlayer.setPlayerColor(false); // naznaciti da je crni i daje mu figure te boje
        System.out.println("Game starts!");

        while(!whitePlayer.pieces.isEmpty() && !blackPlayer.pieces.isEmpty())  { // dok ima figura (racunat cu i da se zadnji kralj pojede a ne samo ostavi na ploci)
            if(whiteMove) {
                whiteMovePrompt();
                // pomjeri figuru
                // provjeri jel pojeo sta
                // ako je pojeo uzmi crnome s liste tu koju je pojeo
            } else  {
                blackMovePrompt();
                //pomjeri figuru
                //ako je pojeo skini bijelome s liste ono sto je pojeo
            }

        }

        if(whitePlayer.pieces.isEmpty())
            System.out.println("Black victory!");
        else if (blackPlayer.pieces.isEmpty())
            System.out.println("White victory!");
        else if(abrubted)
            System.out.println("Surrender!");
        else
            System.out.println("Draw!"); // u slucaju da se ne moze nista vise pomjeriti na tabli a nije sah mat


    }

}
