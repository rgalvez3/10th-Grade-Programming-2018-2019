men
/**
 * Write a description of class LoopDrawing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawingPicture extends JComponent

{
    public void paintComponent(Graphics g){
        Color classgreen = new Color(74, 157, 99);
        Color DocsBlue = new Color(94, 143, 238);
        Color SlidesYellow = new Color(236, 187, 68);
        Color YoutubeRed = new Color(234, 51, 35);
        Color FormsPurp = new Color(108, 78, 183);
        Color SheetsGreen = new Color(26, 162, 96);
        Color ContactsBlue = new Color(26, 115 ,232 );
        Color SitesBlue = new Color(70, 133 ,241 );
        Color SitesBlue2 = new Color(53, 104 ,214);
        Color SitesGrey1 = new Color(229, 229 ,229);
        Color SitesGrey2 = new Color(166, 166 ,166);
        Color SitesGrey3 = new Color(196, 196 ,196);
        Color AccountRed = new Color(133, 9 ,1);
        
        
        
        
        
        
        
        
        
        Graphics2D g2 = (Graphics2D)g;
        g2.setStroke(new BasicStroke(4));
        g2.setColor(SlidesYellow);
        Rectangle room1 = new Rectangle(50, 50, 70, 60);
        g2.draw(room1);
        g2.setColor(classgreen);
        g2.fill(room1);
        g2.setColor(Color.white);
        Ellipse2D.Double room1c1 = new Ellipse2D.Double(73, 60, 25, 25);
        g2.fill(room1c1);
        Ellipse2D.Double room1c2 = new Ellipse2D.Double(60, 90, 50, 15);
        g2.fill(room1c2);
        g2.setColor(Color.black);
        g2.drawString("Classroom",52, 130);
        
        
        Rectangle Docs1 = new Rectangle(160, 50, 50, 60);
        g2.setColor(DocsBlue);
        g2.draw(Docs1);
        g2.fill(Docs1);
        g2.setColor(Color.white);
        g2.setStroke(new BasicStroke(2));
        g2.drawLine (170, 70, 200, 70);
        g2.drawLine (170, 80, 200, 80);
        g2.drawLine (170, 90, 200, 90);
        g2.drawLine (170, 100, 190, 100);
        g2.setStroke(new BasicStroke(1));
        g2.setColor(Color.black);
        g2.drawString("Docs",170, 130);
        
        
        Rectangle Slides1 = new Rectangle(250, 50, 50, 60);
        g2.setColor(SlidesYellow);
        g2.draw(Slides1);
        g2.fill(Slides1);
        g2.setColor(Color.white);
        g2.setStroke(new BasicStroke(4));
        g2.drawLine (265, 100, 289, 100);
        g2.setStroke(new BasicStroke(3));
        g2.drawLine (290, 100, 290, 80);
        g2.setStroke(new BasicStroke(4));
        g2.drawLine (289, 80, 265, 80);
        g2.setStroke(new BasicStroke(3));
        g2.drawLine (264, 80, 264, 100);
        g2.setColor(Color.black);
        g2.drawString("Slides",260, 130);
        
        
        g2.setColor(YoutubeRed);
        g2.drawRoundRect(50, 175,70,50, 10, 10);
        g2.fillRoundRect(50, 175,70,50,10,10);
        g2.setColor(Color.white);
        int x[] = {75,90,75};
        int y[] = {190,200,210};
        int points = 3;
        g2.drawPolygon(x, y, points);
        g2.fillPolygon(x, y, points);
        g2.setColor(Color.black);
        g2.drawString("YouTube",55, 250);
        
        
        Rectangle Forms1 = new Rectangle(160, 170, 50, 60);
        g2.setColor(FormsPurp);
        g2.draw(Forms1);
        g2.fill(Forms1);
        g2.setColor(Color.white);
        g2.setStroke(new BasicStroke(1));
        Ellipse2D.Double Formsc1 = new Ellipse2D.Double(170, 185, 5, 5);
        g2.fill(Formsc1);
        Ellipse2D.Double Formsc2 = new Ellipse2D.Double(170, 195, 5, 5);
        g2.fill(Formsc2);
        Ellipse2D.Double Formsc3 = new Ellipse2D.Double(170, 205, 5, 5);
        g2.fill(Formsc3);
        g2.setStroke(new BasicStroke(3));
        g2.drawLine (180, 187, 200, 187);
        g2.drawLine (180, 197, 200, 197);
        g2.drawLine (180, 207, 200, 207);
        g2.setColor(Color.black);
        g2.drawString("Forms",165, 250);
        
        
        Rectangle Sheets1 = new Rectangle(250, 170, 50, 60);
        g2.setColor(SheetsGreen);
        g2.draw(Sheets1);
        g2.fill(Sheets1);
        g2.setColor(Color.white);
        g2.setStroke(new BasicStroke(3));
        g2.drawLine (260, 220, 290, 220);
        g2.drawLine (290, 220, 290, 190);
        g2.drawLine (290, 190, 260, 190);
        g2.drawLine (260, 190, 260, 220);
        g2.drawLine (275, 190, 275, 220);
        g2.drawLine (260, 200, 290, 200);
        g2.drawLine (260, 210, 290, 210);
        g2.setColor(Color.black);
        g2.drawString("Sheets",255, 250);
        
        
        g2.setColor(ContactsBlue);
        Ellipse2D.Double Contactc1 = new Ellipse2D.Double(50, 280, 60, 60);
        g2.draw(Contactc1);
        g2.fill(Contactc1);
        g2.setColor(Color.white);
        Ellipse2D.Double Contactc2 = new Ellipse2D.Double(72, 295, 15, 15);
        g2.draw(Contactc2);
        g2.fill(Contactc2);
        g2.setStroke(new BasicStroke());
        g2.draw(new Arc2D.Double(65,315,30,20,-180,-180,Arc2D.CHORD));
        g2.fillArc(65,315,30,20,-180,-180);
        g2.setColor(Color.black);
        g2.drawString("Contacts",52, 360);
        
        
        g2.setColor(SitesBlue);
        Rectangle Sitesr1 = new Rectangle(150, 280, 70, 60);
        g2.draw(Sitesr1);
        g2.fill(Sitesr1);
        g2.setColor(SitesBlue2);
        Rectangle Sitesr2 = new Rectangle(150, 310, 70, 30);
        g2.draw(Sitesr2);
        g2.fill(Sitesr2);
        g2.setColor(SitesGrey1);
        Rectangle Sitesr3 = new Rectangle(150, 310, 35, 30);
        g2.draw(Sitesr3);
        g2.fill(Sitesr3);
        g2.setColor(SitesGrey2);
        g2.setStroke(new BasicStroke(3));
        g2.drawLine (155, 320, 180, 320);
        g2.drawLine (155, 327, 180, 327);
        g2.drawLine (155, 334, 165, 334);
        g2.setColor(SitesGrey3);
        Rectangle Sitesr4 = new Rectangle(151, 281, 68, 5);
        g2.draw(Sitesr4);
        g2.fill(Sitesr4);
        g2.setColor(Color.black);
        g2.drawString("Sites",170, 360);
        
        
        g2.setColor(AccountRed);
        Ellipse2D.Double Account = new Ellipse2D.Double(245, 280, 60, 60);
        g2.draw(Account);
        g2.fill(Account);
        g2.setColor(Color.black);
        g2.drawString("Account",247, 360);
        
    }
}

