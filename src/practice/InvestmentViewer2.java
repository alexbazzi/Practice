/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

package practice;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
/**
 *
 * @author Alex
 */
public class InvestmentViewer2 extends InvestmentViewer1
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JButton button = new JButton("Add interest");
        
        final BankAccount account = new BankAccount(INITIAL_BALANCE);
        
        final JLabel label = new JLabel("balance: " + account.getBalance());
        
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        frame.add(panel);
        
        class AddInterestListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                account.addInterest();
                label.setText("balance: " + account.getBalance());
            }
        }
        
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}
