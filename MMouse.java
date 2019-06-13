import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;


public class MMouse extends JComponent{
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;


        Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 200, 200);
        g2.fill(circle);
        Ellipse2D.Double circle1 = new Ellipse2D.Double(55, 55, 110, 110);
        g2.fill(circle1);
        Ellipse2D.Double circle2 = new Ellipse2D.Double(225, 55, 110, 110);
        g2.fill(circle2);
	}



}
