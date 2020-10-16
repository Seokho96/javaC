package awtSample05;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class WindowTest extends Frame implements WindowListener, ActionListener {
	

	Label label;
	Button button1, button2;
	
	public WindowTest() {
		
		label = new Label("label");
		label.setBounds(100, 100, 300, 30);
		label.setBackground(Color.pink);
		add(label);
		
		button1 = new Button();
		button1.setLabel("button one");
		button1.setBounds(100, 160, 150, 30);
		button1.addActionListener(this);
		add(button1);
		
		button2 = new Button("button two");
		button2.setBounds(300, 160, 150, 30);
		button2.addActionListener(this);
		add(button2);
		
		setLayout(null);
		/*
		 *  resource(자원) : button, label, textfield - Handle(번호)
		 *  
		 * 
		 */
		
		setSize(640, 480);
		setLocation(0, 0);
		
		setVisible(true);
		
		addWindowListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//JOptionPane.showMessageDialog(null, "버튼 클릭");
		
		Button btn = (Button)e.getSource();
		String btnTitle = btn.getLabel();
		
		if(btnTitle.equals("button one")) {
			JOptionPane.showMessageDialog(null, "one 버튼 클릭");
			
			label.setText("one button click");
		}
		else if (btnTitle.equals("button two")) {
		//	JOptionPane.showMessageDialog(null, "two 버튼 클릭");
			
			label.setText("two button click ");
		}
		
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub

		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}
