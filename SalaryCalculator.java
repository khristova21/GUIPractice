import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author Krisi Hristova Pd.6
 * Salary Calculator
 *
 *Set up silimar to the frame below. 
 * When calculate is clicked, check to see if full time is clicked.  
 * If it is, hours/week need not be filled in, assume 40 hours per week, and calculate annual salary.  
 * If the checkbox is not checked, use rate and hours/week to calculate the annual salary.  
 * Make sure your frame has a title. (Double.parseDouble will be necessary)

 */
public class SalaryCalculator 
{

	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame();
		myFrame.setBounds(400, 400, 600, 300);
		myFrame.setLayout(null);
		
		//Hourly Rate Label
		JLabel rate = new JLabel("Hourly Rate: ");
		rate.setBounds(40, 30, 250, 30);
		myFrame.add(rate);
		
		//Hourly Rate JTextField
		JTextField userRate = new JTextField();
		userRate.setBounds(125, 30, 250, 30);
		myFrame.add(userRate);
		
		
		//Hours Per Week Label
		JLabel week = new JLabel("Hours/Week: ");
		week.setBounds(40, 90, 250, 30);
		myFrame.add(week);
		
		
		//Hours Per Week JTextField
		JTextField userHours = new JTextField();
		userHours.setBounds(125,90, 250, 30);
		myFrame.add(userHours);
		
		
		//FullTime JCheckBox
		JCheckBox check = new JCheckBox("Full Time");
		check.setBounds(40, 140, 100, 15);
		myFrame.add(check);
		
		//empty label
		JLabel display  = new  JLabel();
		display.setBounds(275, 160, 500, 30);
		myFrame.add(display);
		
		//command Button "calculate"
		JButton calculate = new JButton("Calculate");
		calculate.setBounds(40, 165, 200, 30);
		calculate.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						if(check.isSelected())
						{
							double rate = Double.parseDouble(userRate.getText());
							double sal = rate * 40 * 52;
							display.setText("Annual Salary: $ " + sal);
							
						}
						else //not selected CheckBox
						{
							double hours = Double.parseDouble(userHours.getText());
							double rate = Double.parseDouble(userRate.getText());
							double sal = rate * hours * 52;
							display.setText("Annual Salary: $ " + sal);
						
						}	
					}
				});
		myFrame.add(calculate);
		
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
