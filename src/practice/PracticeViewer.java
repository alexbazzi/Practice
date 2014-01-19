/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

package practice;

import javax.swing.JFrame;
/**
 *
 * @author Alex
 */
public class PracticeViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 400;
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("Two fucking rectangles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PracticeClass pract = new PracticeClass();
        frame.add(pract);
        
        frame.setVisible(true);
    }
}
