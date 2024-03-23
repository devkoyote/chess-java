package xadrez.boardgame;

public class Position {
   // class position row and column

   private int row;
   private int column;


   public Position() {
   }

   public Position(int row, int column) {
      this.row = row;
      this.column = column;
   }


   public int getRow() {
      return this.row;
   }

   public void setRow(int row) {
      this.row = row;
   }

   public int getColumn() {
      return this.column;
   }

   public void setColumn(int column) {
      this.column = column;
   }

   @Override
   public String toString(){
      return row + ", " + column;
   }


}
