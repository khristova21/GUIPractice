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
		myFrame.setBounds(300,300, 400, 400);
		myFrame.setLayout(null);
		
		//Hourly Rate Label
		JLabel rate = new JLabel("Hourly Rate: ");
		rate.setBounds(50, 50 , 100, 30);
		myFrame.add(rate);
		
		//Hourly Rate JTextField
		JTextField userRate = new JTextField();
		userRate.setBounds(200, 50, 100, 30);
		myFrame.add(userRate);
		
		
		//Hours Per Week Label
		JLabel week = new JLabel("Hours/Week: ");
		rate.setBounds(50, 100, 100, 30);
		myFrame.add(week);
		
		
		//Hours Per Week JTextField
		JTextField userHours = new JTextField();
		userHours.setBounds(200, 100, 100, 30);
		myFrame.add(userHours);
		
		
		//FullTime JCheckBox
		
		//command Button "calculate"
		
		//JLabel annSal = new JLabel("Annual Salary: $ ");

		
		

		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
