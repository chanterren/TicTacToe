import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TicTacToeView implements ActionListener{
  //Properties 
  JFrame theframe;
  JPanel thepanel;
  JButton button00;
  JButton button01;
  JButton button02;
  JButton button10;
  JButton button11;
  JButton button12;
  JButton button20;
  JButton button21;
  JButton button22;
  JButton reset;
  JLabel p1wins;
  JLabel p2wins;
  JLabel message;
  TicTacToeModel tttmodel;
  
  //Methods
  //Local Methods for GUI View
  public void disablebuttons(){
    button00.setEnabled(false);
    button01.setEnabled(false);
    button02.setEnabled(false);
    button10.setEnabled(false);
    button11.setEnabled(false);
    button12.setEnabled(false);
    button20.setEnabled(false);
    button21.setEnabled(false); 
  }
  //Controller Methods that link the view to the model
  public void actionPerformed(ActionEvent evt){
    if(evt.getSource() == button00){
      button00.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(0,0);
      button00.setEnabled(false);
      String strWin = tttmodel.checkWin();
      if(strWin.equals("X")){
        p1wins.setText("P1 Wins: "+tttmodel.getP1Wins());
        message.setText("P1 Wins");
        disablebuttons();
      }else if(strWin.equals("O")){
        p2wins.setText("P2 Wins: "+tttmodel.getP2Wins());
        message.setText("P2 Wins");
        disablebuttons();
      }else if(strWin.equals("C")){
        message.setText("Cats game");
        disablebuttons();
      }
    }else if(evt.getSource() == button01){
      button01.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(0,1);
      button01.setEnabled(false);
      String strWin = tttmodel.checkWin();
      if(strWin.equals("X")){
        p1wins.setText("P1 Wins: "+tttmodel.getP1Wins());
        message.setText("P1 Wins");
        disablebuttons();
      }else if(strWin.equals("O")){
        p2wins.setText("P2 Wins: "+tttmodel.getP2Wins());
        message.setText("P2 Wins"); 
        disablebuttons();
      }else if(strWin.equals("C")){
        message.setText("Cats game");
        disablebuttons();
      }
    }else if(evt.getSource() == button02){
      button02.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(0,2);
      button02.setEnabled(false);
      String strWin = tttmodel.checkWin();
      if(strWin.equals("X")){
        p1wins.setText("P1 Wins: "+tttmodel.getP1Wins());
        message.setText("P1 Wins");
        disablebuttons();
      }else if(strWin.equals("O")){
        p2wins.setText("P2 Wins: "+tttmodel.getP2Wins());
        message.setText("P2 Wins");
        disablebuttons();
      }else if(strWin.equals("C")){
        message.setText("Cats game");
        disablebuttons();
      }
    }if(evt.getSource() == button10){
      button10.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(1,0);
      button10.setEnabled(false);
      String strWin = tttmodel.checkWin();
      if(strWin.equals("X")){
        p1wins.setText("P1 Wins: "+tttmodel.getP1Wins());
        message.setText("P1 Wins");
        disablebuttons();
      }else if(strWin.equals("O")){
        p2wins.setText("P2 Wins: "+tttmodel.getP2Wins());
        message.setText("P2 Wins");
        disablebuttons();
      }else if(strWin.equals("C")){
        message.setText("Cats game");
        disablebuttons();
      }
    }else if(evt.getSource() == button11){
      button11.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(1,1);
      button11.setEnabled(false);
      String strWin = tttmodel.checkWin();
      if(strWin.equals("X")){
        p1wins.setText("P1 Wins: "+tttmodel.getP1Wins());
        message.setText("P1 Wins");
        disablebuttons();
      }else if(strWin.equals("O")){
        p2wins.setText("P2 Wins: "+tttmodel.getP2Wins());
        message.setText("P2 Wins"); 
        disablebuttons();
      }else if(strWin.equals("C")){
        message.setText("Cats game");
        disablebuttons();
      }
    }else if(evt.getSource() == button12){
      button12.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(1,2);
      button12.setEnabled(false);
      String strWin = tttmodel.checkWin();
      if(strWin.equals("X")){
        p1wins.setText("P1 Wins: "+tttmodel.getP1Wins());
        message.setText("P1 Wins");
        disablebuttons();
      }else if(strWin.equals("O")){
        message.setText("P2 Wins");
        disablebuttons();
      }else if(strWin.equals("C")){
        message.setText("Cats game");
        disablebuttons();
      }
    }if(evt.getSource() == button20){
      button20.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(2,0);
      button20.setEnabled(false);
      String strWin = tttmodel.checkWin();
      if(strWin.equals("X")){
        p1wins.setText("P1 Wins: "+tttmodel.getP1Wins());
        message.setText("P1 Wins");
        disablebuttons();
      }else if(strWin.equals("O")){
        p2wins.setText("P2 Wins: "+tttmodel.getP2Wins());
        message.setText("P2 Wins"); 
        disablebuttons();
      }else if(strWin.equals("C")){
        message.setText("Cats game");
        disablebuttons();
      }
    }else if(evt.getSource() == button21){
      button21.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(2,1);
      button21.setEnabled(false);
      String strWin = tttmodel.checkWin();
      if(strWin.equals("X")){
        p1wins.setText("P1 Wins: "+tttmodel.getP1Wins());
        message.setText("P1 Wins");
        disablebuttons();
      }else if(strWin.equals("O")){
        p2wins.setText("P2 Wins: "+tttmodel.getP2Wins());
        message.setText("P2 Wins"); 
        disablebuttons();
      }else if(strWin.equals("C")){
        message.setText("Cats game");
        disablebuttons();
      }
    }else if(evt.getSource() == button22){
      button22.setText(tttmodel.getTurn());
      tttmodel.placeThePiece(2,2);
      button22.setEnabled(false);
      String strWin = tttmodel.checkWin();
      if(strWin.equals("X")){
        p1wins.setText("P1 Wins: "+tttmodel.getP1Wins());
        message.setText("P1 Wins");
        disablebuttons();
      }else if(strWin.equals("O")){
        p2wins.setText("P2 Wins: "+tttmodel.getP2Wins());
        message.setText("P2 Wins"); 
        disablebuttons();
      }else if(strWin.equals("C")){
        message.setText("Cats game");
        disablebuttons();
      }
    }else if(evt.getSource() == reset){
      tttmodel.resetBoard(); 
      button00.setEnabled(true);
      button01.setEnabled(true);
      button02.setEnabled(true);
      button10.setEnabled(true);
      button11.setEnabled(true);
      button12.setEnabled(true);
      button20.setEnabled(true);
      button21.setEnabled(true);
      button22.setEnabled(true);
      button00.setText(" ");
      button01.setText(" ");
      button02.setText(" ");
      button10.setText(" ");
      button11.setText(" ");
      button12.setText(" ");
      button20.setText(" ");
      button21.setText(" ");
      button22.setText(" ");
      message.setText("Play TicTacToe");
    }
  }
  //Constructor
  public TicTacToeView(){
    //Construct the model
    tttmodel = new TicTacToeModel();
    tttmodel.resetBoard();
    //Setting up VIEW for Model View Controller
    thepanel = new JPanel();
    thepanel.setPreferredSize(new Dimension(300,450));
    thepanel.setLayout(null);
    
    button00 = new JButton(" ");
    button00.setSize(100,100);
    button00.setLocation(0,0);
    button00.addActionListener(this);
    thepanel.add(button00);
    
    button01 = new JButton(" ");
    button01.setSize(100,100);
    button01.setLocation(100,0);
    button01.addActionListener(this);
    thepanel.add(button01);
    
    button02 = new JButton(" ");
    button02.setSize(100,100);
    button02.setLocation(200,0);
    button02.addActionListener(this);
    thepanel.add(button02);
    
    button10 = new JButton(" ");
    button10.setSize(100,100);
    button10.setLocation(0,100);
    button10.addActionListener(this);
    thepanel.add(button10);
    
    button11 = new JButton(" ");
    button11.setSize(100,100);
    button11.setLocation(100,100);
    button11.addActionListener(this);
    thepanel.add(button11);
    
    button12 = new JButton(" ");
    button12.setSize(100,100);
    button12.setLocation(200,100);
    button12.addActionListener(this);
    thepanel.add(button12);
    
    button20 = new JButton(" ");
    button20.setSize(100,100);
    button20.setLocation(0,200);
    button20.addActionListener(this);
    thepanel.add(button20);
    
    button21 = new JButton(" ");
    button21.setSize(100,100);
    button21.setLocation(100,200);
    button21.addActionListener(this);
    thepanel.add(button21);
    
    button22 = new JButton(" ");
    button22.setSize(100,100);
    button22.setLocation(200,200);
    button22.addActionListener(this);
    thepanel.add(button22);
    
    reset = new JButton("Reset");
    reset.setSize(300,50);
    reset.setLocation(0,400);
    reset.addActionListener(this);
    thepanel.add(reset);
    
    p1wins = new JLabel("P1 Wins:");
    p1wins.setSize(100,50);
    p1wins.setLocation(0,300);
    p1wins.setHorizontalAlignment(JLabel.CENTER);
    thepanel.add(p1wins);
    
    p2wins = new JLabel("P2 Wins:");
    p2wins.setSize(100,50);
    p2wins.setLocation(150,300);
    p2wins.setHorizontalAlignment(JLabel.CENTER);
    thepanel.add(p2wins);
    
    message = new JLabel("Play TicTacToe");
    message.setSize(300,50);
    message.setLocation(0,350);
    message.setHorizontalAlignment(JLabel.CENTER);
    thepanel.add(message);
    
    theframe = new JFrame("TicTacToe");
    theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    theframe.setContentPane(thepanel);
    theframe.pack();
    theframe.setVisible(true);
  }
  public static void main(String[] args){
    TicTacToeView gui = new TicTacToeView(); 
    
  }
}