/*
	Syntax:
	JDialog(Frame owner, String title, boolean modal)

	Dialog represents a top level window.
	it consists of border , title and it is used to take some form of input from the user.
	it doesn't have maximize and minimize button but have close button
*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DialogDemo
{
	JDialog d;
	DialogDemo()
	{
		JFrame frame = new JFrame();
		d = new JDialog(frame,"Dialog example", true);
		d.setLayout(new FlowLayout());

		JButton btn = new JButton("OKay");
		btn.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					d.setVisible(false);
				}
			});
		d.add(new JLabel("press OKay to continue"));
		d.add(btn);
		d.setSize(200,200);
		d.setVisible(true);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable()
			{
				public void run()
				{
					new DialogDemo();
				}
			});
	}
}