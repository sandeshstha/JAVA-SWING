import javax.swing.*;
import java.awt.*;

public class ContentPaneSetToJPanel extends JFrame
{
	public ContentPaneSetToJPanel()
	{
		// Jpanel holds all the GUI compenents
		JPanel mainPanel = new JPanel(new FlowLayout());
		mainPanel.add(new JLabel("hello world"));
		mainPanel.add(new JButton("click"));

		// set the content-pane of this JFrame to main Jpanel
		setContentPane(mainPanel);

		//frame operations
		setVisible(true);
		setSize(500,590);


	}
	public static void main(String[] args) {
		new ContentPaneSetToJPanel();
	}
}