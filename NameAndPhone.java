import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author Krisi Hristova
 * GUI name and phone Program
 *
 */
public class NameAndPhone
{

	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame();
		myFrame.setBounds(400,400, 600,300);   //x,y,width, height
		myFrame.setLayout(null);
		
		JLabel nameLabel = new JLabel("Name?");
		nameLabel.setBounds(40, 30, 100, 30);     
		myFrame.add(nameLabel);
		
		JTextField writeName = new JTextField();
		writeName.setBounds(145, 30, 100, 30);
		myFrame.add(writeName);
		
		JLabel phoneLabel =  new JLabel("Phone Number?");
		phoneLabel.setBounds(40, 100, 100, 30);
		myFrame.add(phoneLabel);
		
		JTextField userNum = new JTextField();
		userNum.setBounds(145, 100, 100, 30);
		myFrame.add(userNum);		
		
		JButton commandName = new JButton("Set Name");
		commandName.setBounds(250, 30, 200, 30);
		commandName.addActionListener(new ActionListener()
				
				{
					public void actionPerformed(ActionEvent e)
					{
						nameLabel.setText(writeName.getText());
					}
				});
		myFrame.add(commandName);
		
		JButton commandNum = new JButton("Set Phone #");
		commandNum.setBounds(250, 100, 200, 30);
		commandNum.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						phoneLabel.setText(userNum.getText());
					}
				});
		myFrame.add(commandNum);
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}

}
