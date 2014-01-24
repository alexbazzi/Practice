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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

/**
 *
 * @author Alex
 */
public class InvestmentFrame extends JFrame
{
    public InvestmentFrame()
    {
        account = new BankAccount(INITIAL_BALANCE);
        resultArea = new JTextArea(AREA_ROWS, AREA_COLUMNS);
        resultArea.setEditable(true);
        
        createTextField();
        createButton();
        createPanel();
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        
    }
    
    public void createTextField()
    {
        rateLabel = new JLabel("Interest rate: ");
        
        final int FIELD_WIDTH = 10;
        rateField = new JTextField(FIELD_WIDTH);
        rateField.setText("" + DEFAULT_RATE);
        
        balanceLabel = new JLabel("Balance: ");
        
        
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
                resultArea.append(account.getBalance() + "\n");
            }
        }
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
    }
    
    public void createPanel()
    {
        panel = new JPanel();
        panel.add(rateLabel);
        panel.add(rateField);
        panel.add(button);
        panel.add(balanceLabel);
        panel.add(resultArea);
        JScrollPane scrollpane = new JScrollPane(resultArea);
        panel.add(scrollpane);
        add(panel);
    }
    
    private JLabel rateLabel;
    private JTextField rateField;
    private JLabel balanceLabel;
    private JButton button;
    private JTextArea resultArea;
    private JPanel panel;
    private BankAccount account;
    
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 200;
    
    private static final double DEFAULT_RATE = 5;
    private static final double INITIAL_BALANCE = 1000;
    
    private static final int AREA_ROWS = 10;
    private static final int AREA_COLUMNS = 30;
}