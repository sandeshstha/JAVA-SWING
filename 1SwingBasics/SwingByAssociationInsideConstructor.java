import javax.swing.*;
public class SwingByAssociationInsideConstructor
{
	JFrame f;
	SwingByAssociationInsideConstructor() //default constructor
	{
		f = new JFrame();
		JButton b = new JButton("click");
		b.setBounds(100,100,90,50);
		f.add(b);
		f.setSize(500,600);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new SwingByAssociationInsideConstructor();
	}
}