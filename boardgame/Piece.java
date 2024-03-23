package xadrez.boardgame;

public class Piece {
   
   protected Position position;
   // Associated with Board
   private Board board;


   public Piece(Board board) {
      
      this.board = board;
      //For default is null
      position = null;
   }

   protected Board getBoard() {
      return board;
   }

}
