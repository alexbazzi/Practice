/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */


package practice;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Alex
 */
public class PracticeClass extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle box = new Rectangle(5, 10, 20, 30);
        g2.draw(box);
        box.translate(15, 25);
        g2.draw(box);
    }
    
    
}
