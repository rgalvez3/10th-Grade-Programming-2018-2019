import javax.swing.JFrame;
import java.awt.Color;


public class DrawingFrame
{
    public static void main(String[] args){
        
        // You should change the Title
        JFrame frame = new JFrame("Google Apps");
        frame.setSize(400, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        DrawingPicture picture = new DrawingPicture();
        frame.add(picture);
        
        DrawingPicture r = new DrawingPicture();
        frame.add(r);
        frame.setBackground(Color.WHITE);
        frame.setVisible(true);    }
}
