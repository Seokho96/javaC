package UI;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;




public class MainMenu extends JFrame implements ActionListener{
	
	JLabel label;
	JButton btn[];
	
	public MainMenu() {
	
		label = new JLabel("Baseball");
		label.setBounds(40, 20, 250, 100);
		label.setBackground(Color.darkGray);
		label.setOpaque(true);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setForeground(Color.white);
		add(label);	
		
		
		btn = new JButton[6];
		String btnTitle[] = { "추가","삭제", "검색", "수정", "출력", "저장" };
		
		for (int i = 0; i < btnTitle.length; i++) {
			
			btn[i] = new JButton(btnTitle[i]);
			
			btn[i].setBounds(90 , 125+ (i *100) , 150, 50);
			btn[0].setBounds(90 , 125 , 150, 50);
			add(btn[i]);
		}
		
	btn[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	
				Change cg = Change.getInstance();
				cg.one.setVisible(false);
				cg.two.setVisible(true);
				
			}
		});
	btn[1].addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {

			Change cg = Change.getInstance();
			cg.one.setVisible(false);
			cg.three.setVisible(true);
			
		}
	});
	btn[2].addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {

			Change cg = Change.getInstance();
			cg.one.setVisible(false);
			cg.four.setVisible(true);
			
		}
	});
	btn[3].addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {

			Change cg = Change.getInstance();
			cg.one.setVisible(false);
			cg.five.setVisible(true);
			
		}
	});
	btn[4].addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {

			Change cg = Change.getInstance();
			cg.one.setVisible(false);
			cg.six.setVisible(true);
			
		}
	});
	btn[5].addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {

			Change cg = Change.getInstance();
			cg.one.setVisible(false);
			cg.seven.setVisible(true);
			
		}
	});
	
	

		
	
		
		setLayout(null);
		
		setBounds(0, 0, 350, 800);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
