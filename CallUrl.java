import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.io.*;
public class CallUrl implements ActionListener
{
	JFrame f;JButton b;
	CallUrl()
	{
		f=new JFrame("url");
		b=new JButton("goto");
		b.setBounds(40,100,100,30);
		b.addActionListener(this);
		f.add(b);
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try{
URI uri = new URI("https://google.com/");
Desktop dt = Desktop.getDesktop();
// dt.browse(uri.toURL());
dt.browse(uri.resolve(uri));
}catch(Exception e)
{
	System.out.println(e);
}
}
public static void main(String s[])
{
	new CallUrl();
}
}
