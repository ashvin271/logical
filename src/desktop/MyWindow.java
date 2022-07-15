package desktop;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow {

	public static void main(String[] args) {
		//object jframe
		
		JFrame frame=new JFrame("my windo");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame size and layout
		
		frame.setSize(40, 40);
		frame.setLayout(new FlowLayout());
		
		// create button and jfram 
		JButton  button=new JButton("click me");
		
		/*
		 * button.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * JOptionPane.showMessageDialog(null, "hello"); } });
		 */
		
		button.addActionListener((ActionEvent e)->{
			JOptionPane.showMessageDialog(null, "hello");
		});
		
		
		frame.add(button);
		
		
		frame.setVisible(true);
	}
}
