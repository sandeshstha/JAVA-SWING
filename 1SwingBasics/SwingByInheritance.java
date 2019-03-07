import javax.swing.*;
import java.awt.*;

public class SwingByInheritance extends JFrame
{
	SwingByInheritance()
	{
		JButton btn = new JButton("clicke me");
		this.add(btn);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new SwingByInheritance();
	}
}