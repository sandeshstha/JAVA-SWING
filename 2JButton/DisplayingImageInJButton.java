import javax.swing.*;
import java.awt.*;
public class DisplayingImageInJButton
{
	DisplayingImageInJButton()
	{
		JFrame f = new JFrame("DisplayImage In JButton");
		JButton btn = new JButton(new ImageIcon("buttonImage.png"));
		btn.setBounds(200,200,100,50);
		f.add(btn);
		f.setSize(500,500);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new DisplayingImageInJButton();
	}
}