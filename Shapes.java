import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;


public class Shapes extends JComponent{

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g; //creates a 2d graphucs object

		Rectangle box = new Rectangle(5, 10, 50, 30);//creatimg rectagle object at (X, Y, W, H)
		g2.draw(box);// draws a black box

		g2.setColor(Color.blue);// sets color to blue

        Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 200, 200);// draw a circle with prarmeters of (X, Y, W, H). can also be    ovals
        
		g2.fill(circle);//

	}



}
