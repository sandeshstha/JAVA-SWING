import javax.swing.*;
import java.awt.*;
public class ContentPaneDemo extends JFrame
{
	ContentPaneDemo()
	{
		//get the content-pane of this JFrame which is a java.awt.Container
		//all operations such as setLayout(), add() operates on content-pane
		Container cp = getContentPane(); 
		cp.setLayout(new FlowLayout());
		cp.add(new JLabel("hello world"));
		cp.add(new JButton("click"));

		//JFrame Operations
		setVisible(true);
		setSize(200,200);
	}
	public static void main(String[] args) {
		new ContentPaneDemo();
	}
}