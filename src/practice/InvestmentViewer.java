/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

package practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
/**
 *
 * @author Alex
 */
public class InvestmentViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JButton button = new JButton("Add interest");
        frame.add(button);
        
        final BankAccount account = new BankAccount(INITIAL_BALANCE);
        
        class AddInterestListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                account.addInterest();
                System.out.println("Balance: " + account.getBalance());
            }
        }
        
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
    private static final double INITIAL_BALANCE = 1000;
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 60;
}
