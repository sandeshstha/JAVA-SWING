import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JLabelWithActionListener extends JFrame implements ActionListener
{
	JTextField tf;
	JLabel label;
	JButton btn;
	JLabelWithActionListener()
	{
		tf = new JTextField();
		tf.setBounds(50,50,150,20);

		label = new JLabel();
		label.setBounds(50,100, 250,20);

		btn = new JButton("find IP");
		btn.setBounds(50,150,95,30); 

		btn.addActionListener(this);

		this.add(tf);
		this.add(btn);
		this.add(label);

		this.setSize(500,500);
		this.setVisible(true);
		this.setLayout(null);
	}
	public void actionPerformed(ActionEvent e) 
	{
		try
		{
			String host = tf.getText();
		String ip = java.net.InetAddress.getByName(host).getHostAddress();
		label.setText("IP of"+host+"is:"+ip);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}
	public static void main(String[] args) {
		new JLabelWithActionListener();
	}
}