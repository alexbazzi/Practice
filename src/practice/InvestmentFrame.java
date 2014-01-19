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
    
    public void createTextField()
    {
        rateLabel = new JLabel("Interest rate: ");
        
        final int FIELD_WIDTH = 10;
        rateField = new JTextField(FIELD_WIDTH);
        rateField.setText("" + DEFAULT_RATE);
        
    }
    
    public void createButton()
    {
        button = new JButton("Add interest");
        
        class AddInterestListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                double rate = Double.parseDouble(rateField.getText());
                double interest = account.getBalance()*(rate/100);
                account.deposit(interest);
            }
        }
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
    }
    
    public void createPanel()
    {
        JPanel panel = new JPanel();
        panel.add(rateLabel);
        panel.add(rateField);
        panel.add(button);
        panel.add(resultLabel);
        this.add(panel);
    }
    
    private JLabel rateLabel;
    private JTextField rateField;
    private JButton button;
    private JLabel resultLabel;
    private JPanel panel;
    private BankAccount account;
    
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 200;
    
    private static final double DEFAULT_RATE = 5;
    private static final double INITIAL_BALANCE = 1000;
}
