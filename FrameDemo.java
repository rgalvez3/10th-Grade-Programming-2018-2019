import javax.swing.JFrame;

public class FrameDemo{
    public static void main(String[] args){
        JFrame frame = new JFrame("Frame Demo");  //makes new frame   and                         gives name on window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when closed, will stop running
        frame.setSize(400, 400); //size of the window
        Shapes r = new Shapes(); //creates shape from other Shape file
        frame.add(r);// adds shape to the ftame
        frame.setVisible(true); //makes the window visable??
    }
}
