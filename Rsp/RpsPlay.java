import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class RpsPlayPanel extends JPanel{
    //private int Counter;
    ImageIcon Rook = new ImageIcon("Rook.png");
    Image imgRook = Rook.getImage();
    ImageIcon Paper = new ImageIcon("Paper.png");
    Image imgPaper = Paper.getImage();
    ImageIcon Scissors = new ImageIcon("Scissors.png");
    Image imgScissors= Scissors.getImage();

    RpsPlayPanel(int objectCounter){
      //Counter = objectCounter;
    }

    public void paintComponent(Graphics g){  
        super.paintComponent(g); 
        // for(int i = 0; i < Counter; i++)
        // {
        //     g.drawImage(imgRook, 0, 0,100,100, null);
        // }
        g.drawImage(imgRook, 0, 0,50,50, null);
        g.drawImage(imgPaper, 0, 300,50,50, null);
        g.drawImage(imgScissors, 0, 600,50,50, null);
    }
   
}
class RpsPlayFrame extends JFrame{
    public RpsPlayFrame(int objectCounter){
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int screenHeight = d.height;
        int screenWidth = d.width;  
        setTitle("RpsPlayFrame");
        setSize(900,900);

        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        } );

        setLocation(screenWidth / 4, screenHeight / 11);
       
        Container contentPane = getContentPane();
        contentPane.add(new RpsPlayPanel(objectCounter));
    }
}