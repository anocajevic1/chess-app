package ba.unsa.etf.rpr;

public class IllegalChessMoveException  extends Exception{

        // Parameterless Constructor
        public IllegalChessMoveException() {
            super();
        }

        // Constructor that accepts a message
        public IllegalChessMoveException(String message)
        {
            super(message);
        }


}
