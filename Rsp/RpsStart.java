import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class RpsStartPanel extends JPanel
    implements ActionListener
{   
    JButton stratButton = new JButton("Start");
    private JTextField RpsObjectField;
    private String text;
    static int RpsObjectCounter;
    
    public RpsStartPanel(){        
        RpsObjectField = new JTextField("3",5);
        add(RpsObjectField);
        add(stratButton);
        
        stratButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evt){

        if(evt.getSource() == stratButton)
        {
            text = RpsObjectField.getText();
            RpsObjectCounter = Integer.parseInt(text);
        }
        RpsPlayFrame mainFrame = new RpsPlayFrame(RpsObjectCounter);
        mainFrame.setVisible(true);  
    }
}

class RpsStartFrame extends JFrame{
    
    public RpsStartFrame(){  
        setTitle("RpsStartFrame");
        setSize(600,100);

        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        } );

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int screenHeight = d.height;
        int screenWidth = d.width;
        setLocation(screenWidth / 3, screenHeight / 3 );
       
        Container contentPane = getContentPane();
        contentPane.add(new RpsStartPanel());
    }
}