import javax.swing.*;
public class FirstSwingExample
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame(); //creating instance of JFrame

        JButton b = new JButton("Click me."); //creating instance of JButton
        b.setBounds(250,250,100,50); //x-axis, y axis, width, height

        f.add(b); 
        //content-pane of JFrame is similar to java.awt.Container
        //getContentPane().add(b); //adding to frame is by default added to Container of JFrame
        f.setSize(500,500); //width and height of JFrame is set
        f.setLayout(null);
        f.setVisible(true);
    }
}