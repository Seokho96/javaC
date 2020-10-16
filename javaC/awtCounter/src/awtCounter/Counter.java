package awtCounter;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class Counter extends Frame implements WindowListener, ActionListener{
	 
	

	Label label;
	Button button1, button2, button3;
	int i=0;
	
	public Counter() {
		
		label = new Label("                                            "+ i);
		label.setBounds(50, 50, 400, 100);
		label.setBackground(Color.pink);
		add(label);
		
		button1 = new Button();
		button1.setLabel("+");
		button1.setBounds(80, 180, 150, 150);;
		button1.addActionListener(this);
		add(button1);
		
		button2 = new Button("-");
		button2.setBounds(240, 180, 150, 150);
		button2.addActionListener(this);
		add(button2);
		
		button3 = new Button("Reset");
		button3.setBounds(160, 360, 150, 100);
		button3.addActionListener(this);
		add(button3);
	

		
		setLayout(null);
		

		setSize(640, 480);
		setLocation(0, 0);
		
		setVisible(true);
		
		addWindowListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Button btn = (Button)e.getSource();
		String btnTitle = btn.getLabel();
		String n = Integer.toString(i);
		
		if(i == -1) {
			
			JOptionPane.showMessageDialog(null, " 더이상 내려가지 않습니다.");
			i = 0;
		}
		
		else if(btnTitle.equals("+")) {
			//	JOptionPane.showMessageDialog(null, "one 버튼 클릭");
				
				i++;
				
				label.setText("                                            "+n);
			}
			else if (btnTitle.equals("-")) {
	
				i--;
			
				label.setText("                                            "+n);
				
				
			}else if (btnTitle.equals("Reset")) {
				
				i = 0;
				
				label.setText("                                            "+n);
				
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
