package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class RSPgame extends Frame implements WindowListener, ActionListener{

	Image image;
	Label label1, label2, label3;
	Button button1, button2, button3;
	int a, b, c;
	static int d = (int)Math.random()*3;
	String t = "Com";
	public RSPgame() {
			
		label1 = new Label("                    Player");
		label1.setBounds(50, 180, 150, 150);
		label1.setBackground(Color.pink);
		label1.setForeground(Color.BLUE);
		add(label1);
		
		label2 = new Label("                    " + t);
		label2.setBounds(250, 180, 150, 150);
		label2.setBackground(Color.orange);
		add(label2);
		
		label3 = new Label("                                             " + a + "승"  + b + "패" + c +"무");
		label3.setBounds(50, 350, 360, 100);
		label3.setBackground(Color.cyan);
		add(label3);
		
		
		
		button1 = new Button();
		button1.setLabel("가위");
		button1.setBounds(50, 50, 80, 80);;
		button1.addActionListener(this);
		add(button1);
		
		button2 = new Button("바위");
		button2.setBounds(200, 50, 80, 80);
		button2.addActionListener(this);
		add(button2);
		
		button3 = new Button("보");
		button3.setBounds(360, 50, 80, 80);
		button3.addActionListener(this);
		add(button3);
	

		
		setLayout(null);
		

		setSize(500, 480);
		setLocation(0, 0);
		setBackground(Color.LIGHT_GRAY);
		
		setVisible(true);
		
		addWindowListener(this);
		
	
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Button btn = (Button)e.getSource();
		String btnTitle = btn.getLabel();
		
		String q = Integer.toString(a);
		String w = Integer.toString(b);
		String r = Integer.toString(c);
		
		String m[] = {"가위", 
				      "바위", 
				       "보"};
		
	
		 if(btnTitle.equals("가위")) {
			label1.setText("                    " + "가위");
			 d = (int)(Math.random()*3);
			 t = m[d];
			 
			 if(t.equals("보")) {
			  a++;
			  label2.setText("                    " + t);
			  label3.setText("                                             " + a + "승" + b + "패" + c + "무");
			
			 }else if(t.equals("바위")){	
				  b++;
				  label2.setText("                    " + t);
				  label3.setText("                                             " + a + "승" + b + "패" + c + "무");
				 
			 }else if(t.equals("가위")) {
				  c++;
				  label2.setText("                    " + t);
				  label3.setText("                                             " + a + "승" + b + "패" + c + "무");
				 
			 }
			
			}
			else if (btnTitle.equals("바위")) {
				label1.setText("                    " + "바위");
				d = (int)(Math.random()*3);
				 t = m[d];
				 
				 if(t.equals("보")) {
				  b++;
				  label2.setText("                    " + t);
				  label3.setText("                                             " + a + "승" + b + "패" + c + "무");
				
				 }else if(t.equals("바위")){	
					  c++;
					  label2.setText("                    " + t);
					  label3.setText("                                             " + a + "승" + b + "패" + c + "무");
					 
				 }else if(t.equals("가위")) {
					  a++;
					  label2.setText("                    " + t);
					  label3.setText("                                             " + a + "승" + b + "패" + c + "무");			 
				 }					
			}
			else if (btnTitle.equals("보")) {
				label1.setText("                    " + "보");
				d = (int)(Math.random()*3);
				 t = m[d];
				 
				 if(t.equals("보")) {
				  c++;
				  label2.setText("                    " + t);
				  label3.setText("                                             " + a + "승" + b + "패" + c + "무");
				
				 }else if(t.equals("바위")){	
					  a++;
					  label2.setText("                    " + t);
					  label3.setText("                                             " + a + "승" + b + "패" + c + "무");
					 
				 }else if(t.equals("가위")) {
					  b++;
					  label2.setText("                    " + t);
					  label3.setText("                                             " + a + "승" + b + "패" + c + "무");
					 
				 }
			
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
