/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

package practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

/**
 *
 * @author Alex
 */
public class InvestmentFrame extends JFrame
{
    public InvestmentFrame()
    {
        account = new BankAccount(INITIAL_BALANCE);
        resultLabel = new JLabel("Balance: " + account.getBalance());
        
        createTextField();
        createButton();
        createPanel();
        
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        
    }
}
