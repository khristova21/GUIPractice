/**
 * Krisi Hristova
 * GUI Lesson
 * 
 */

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class first
{
	
	public static void main(String[]  args)
	{
		JFrame myFrame = new JFrame("My First Frame");
		myFrame.setBounds(400, 400, 600, 300);          //(x,y,width, height)
		myFrame.setLayout(null);
		
		JLabel label1 = new JLabel("Our First Label");
		label1.setBounds(40,30,100,30);                 //setBounds is the combination of setLocation and setSize
		myFrame.add(label1);

		//40pixel to the right of JLabel
		JButton myButton = new JButton("BUTTON!");
		myButton.setLocation(new Point(180,30));
		myButton.setSize(new Dimension(100,30));
		myButton.addActionListener(new ActionListener()
				
				{
					public void actionPerformed(ActionEvent e)
					{
						label1.setText("action listener");
					}
				});
		myFrame.add(myButton);
		
		//last thing you want to do in program
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
}
