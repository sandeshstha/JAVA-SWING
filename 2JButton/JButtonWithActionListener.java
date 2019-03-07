import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JButtonWithActionListener
{
	public static void main(String[] args) 
	{
			JFrame f = new JFrame("Button Example Title");
			final JTextField tf = new JTextField(20);
			JButton btn = new JButton("click me");
			btn.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					tf.setText("welcome to my world");
				}
			});

			f.add(tf);
			f.add(btn);
			f.setSize(500,500);
			f.setVisible(true);
			f.setLayout(new FlowLayout());
	}
}