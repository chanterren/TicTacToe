//Data for TicTacToe

public class TicTacToeModel{
  //Properties  
  private String strBoard[][];
  private int intP1Wins;
  private int intP2Wins;
  private String strTurn;
  private int intTurns;
  
  //Methods
  public int getP1Wins(){
    return intP1Wins; 
  }
  public int getP2Wins(){
    return intP2Wins; 
  }
  public String getTurn(){
    return strTurn; 
  }
  public void placeThePiece(int intRow, int intCol){
    strBoard[intRow][intCol] = strTurn;
    intTurns++;
    if(strTurn.equals("X")){
      strTurn = "O"; 
    }else{
      strTurn = "X"; 
    }
  }
  public String checkWin(){
    //Horizontal
    if(strBoard[0][0].equals(strBoard[0][1]) && strBoard[0][1].equals(strBoard[0][2])){
      if(strBoard[0][0].equals("X")){
        intP1Wins++; 
      }else if(strBoard[0][0].equals("O")){
        intP2Wins++; 
      }
      return strBoard[0][0]; 
    }else if(strBoard[1][0].equals(strBoard[1][1]) && strBoard[1][1].equals(strBoard[1][2])){
      if(strBoard[1][0].equals("X")){
        intP1Wins++; 
      }else if(strBoard[1][0].equals("O")){
        intP2Wins++; 
      }
      return strBoard[1][0]; 
    }else if(strBoard[2][0].equals(strBoard[2][1]) && strBoard[2][1].equals(strBoard[2][2])){
      if(strBoard[2][0].equals("X")){
        intP1Wins++; 
      }else if(strBoard[2][0].equals("O")){
        intP2Wins++; 
      }
      return strBoard[2][0];
      //Vertical
    }else if(strBoard[0][0].equals(strBoard[1][0]) && strBoard[1][0].equals(strBoard[2][0])){
      if(strBoard[0][0].equals("X")){
        intP1Wins++; 
      }else if(strBoard[0][0].equals("O")){
        intP2Wins++; 
      }
      return strBoard[0][0];
    }else if(strBoard[0][1].equals(strBoard[1][1]) && strBoard[1][1].equals(strBoard[2][1])){
      if(strBoard[0][1].equals("X")){
        intP1Wins++; 
      }else if(strBoard[0][1].equals("O")){
        intP2Wins++; 
      }
      return strBoard[0][1];
    }else if(strBoard[0][2].equals(strBoard[1][2]) && strBoard[1][2].equals(strBoard[2][2])){
      if(strBoard[0][2].equals("X")){
        intP1Wins++; 
      }else if(strBoard[0][2].equals("O")){
        intP2Wins++; 
      }
      return strBoard[0][2]; 
      //Diagonal
    }else if(strBoard[0][0].equals(strBoard[1][1]) && strBoard[1][1].equals(strBoard[2][2])){
      if(strBoard[0][0].equals("X")){
        intP1Wins++; 
      }else if(strBoard[0][0].equals("O")){
        intP2Wins++; 
      }
      return strBoard[0][0];
    }else if(strBoard[0][2].equals(strBoard[1][1]) && strBoard[1][1].equals(strBoard[2][0])){
      if(strBoard[0][2].equals("X")){
        intP1Wins++; 
      }else if(strBoard[0][2].equals("O")){
        intP2Wins++; 
      }
      return strBoard[0][2];  
      //Others
    }else{
      if(intTurns>=9){
        return "C"; 
      }else{
        return " "; 
      }
    }
  }
  public void resetBoard(){
    int intR;
    int intC;
    for(intR = 0; intR<3; intR++){
      for(intC = 0; intC<3; intC++){
        strBoard[intR][intC] = " ";
      }
    }
    intTurns = 0;
    strTurn = "X";
  }
  public String turn(){
    return strTurn; 
  }
  //Constructor
  public TicTacToeModel(){
    this.strBoard = new String[3][3];
    this.intP1Wins = 0;
    this.intP2Wins = 0;
    this.strTurn = "X";
    this.intTurns = 0;
  }
}