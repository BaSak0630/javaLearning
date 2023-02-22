import javax.swing.*;

class RpsObject{
    public static final int ROOK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;

    double pos_x = (Math.random() * 900);
    double pos_y = (Math.random() * 900);
    double movementSpeed_x = 1.d;
    double movementSpeed_y = 1.d;
    double panelWidth = 900.d;
    double panelheight = 900.d;
    
    ImageIcon rookImage = new ImageIcon("Rook.png");
    ImageIcon paperImage = new ImageIcon("Paper.png");
    ImageIcon scissorsImage = new ImageIcon("Scissors.png");

    public RpsObject(){
        
    }
    public void getState(){
    }
    public void change(){

    }
    
    //객체 이동 범위 설정
    //객체 충돌 범위 설정
    //객체 상태 설정 및 상호작용 설정 
}
