import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CounterDemo extends JFrame
{
	private JTextField tfCount;
	private JButton btnCount;
	private int count = 0;

	// constructor to set up GUI components and event handlers
	public CounterDemo()
	{
		// retrive the content pane of the top level container i.e JFrame
		//all operations are done in the content-pane
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(new Label("Counter:"));

		tfCount = new JTextField("0",20);
		tfCount.setEditable(false);
		cp.add(tfCount);

		btnCount = new JButton("Count");
		cp.add(btnCount);

		btnCount.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					++count;
					tfCount.setText(count+" "); //count is integer but setText takes string only so " " is passed
				}
			});

		//operation on JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Counter Dmeo");
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		//run the GUI construction in the Event Dispatching thread for thread-safety
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				new CounterDemo(); //let constructor do the job
			}
		});
	}
}