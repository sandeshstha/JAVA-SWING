import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdditionSubtraction implements ActionListener
{
	JTextField tf1,tf2,tf3;
	JButton btn1,btn2;

	AdditionSubtraction()
	{
		JFrame f = new JFrame("AdditionSubtraction");
		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		tf3 = new JTextField(20);
		btn1 = new JButton("add");
		btn2 = new JButton("subtract");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(btn1);
		f.add(btn2);

		f.setSize(500,500);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String string1 = tf1.getText();
		String string2 = tf2.getText();
		//convert the sting to integer
		int a = Integer.parseInt(string1);
		int b = Integer.parseInt(string2);
		int temp = 0;
		if(e.getSource() == btn1)
		{
			temp = a + b;
		}
		else if (e.getSource() == btn2) 
		{
			temp = a - b;
		}
		String result = String.valueOf(temp); //converting integer to String
		tf3.setText(result);

	}	
	public static void main(String[] args) {
		new AdditionSubtraction();
	}
}