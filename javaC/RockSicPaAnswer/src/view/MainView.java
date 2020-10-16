package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import game.gbbGame;

public class MainView extends JFrame implements ActionListener {

	JLabel frontLabel;
	JLabel label[];
	JButton button[];
	
	gbbGame game = new gbbGame();
	
	public MainView() {
		super("가위 바위 보");
		
		setLayout(null);
				
		frontLabel = new JLabel("? 승 ? 패 ? 무");
		frontLabel.setBounds(70, 50, 500, 30);
		frontLabel.setBackground(Color.yellow);
		frontLabel.setHorizontalAlignment(JLabel.CENTER);    // 가운데 맞춤
		frontLabel.setOpaque(true);
		add(frontLabel);
		
		label = new JLabel[5];
		
		label[0] = new JLabel("Player");
		label[0].setBounds(70, 100, 150, 30);
		label[0].setBackground(Color.darkGray);
		label[0].setOpaque(true);
		label[0].setHorizontalAlignment(JLabel.CENTER);
		label[0].setForeground(Color.white);
		add(label[0]);	
		
		label[1] = new JLabel("Com");
		label[1].setBounds(420, 100, 150, 30);
		label[1].setBackground(Color.darkGray);
		label[1].setOpaque(true);
		label[1].setHorizontalAlignment(JLabel.CENTER);
		label[1].setForeground(Color.white);
		add(label[1]);
		
		label[2] = new JLabel("?");
		label[2].setBounds(70, 150, 150, 60);
		label[2].setBackground(Color.blue);
		label[2].setOpaque(true);
		label[2].setHorizontalAlignment(JLabel.CENTER);
		label[2].setForeground(Color.white);
		add(label[2]);
		
		label[3] = new JLabel("?");
		label[3].setBounds(240, 150, 150, 60);
		label[3].setBackground(Color.green);
		label[3].setOpaque(true);
		label[3].setHorizontalAlignment(JLabel.CENTER);
		label[3].setForeground(Color.white);
		add(label[3]);
		
		label[4] = new JLabel("?");
		label[4].setBounds(420, 150, 150, 60);
		label[4].setBackground(Color.red);
		label[4].setOpaque(true);
		label[4].setHorizontalAlignment(JLabel.CENTER);
		label[4].setForeground(Color.white);
		add(label[4]);
		
		button = new JButton[3];
		String btnTitle[] = { "가위", "바위", "보" };
		
		for (int i = 0; i < btnTitle.length; i++) {
			button[i] = new JButton(btnTitle[i]);
			button[i].setBounds(120 + 140 * i, 250, 120, 50);
			button[i].addActionListener(this);
			add(button[i]);
		}		
		
		setSize(640, 480);
		setLocation(100, 0);
		setVisible(true);
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		JButton btn = (JButton)e.getSource();
		String title = btn.getLabel();
		
		game.init();
		
		if(title.equals("가위")) {
			game.setUserNum(0);			
		}
		else if(title.equals("바위")) {
			game.setUserNum(1);
		}
		else if(title.equals("보")) {
			game.setUserNum(2);
		}
		
		label[2].setText(game.getUser());
		label[4].setText(game.getCom());
		
		String msg = game.play();
		label[3].setText( msg );
		
		int win = game.getWin();
		int lose = game.getLose();
		int draw = game.getDraw();
		
		frontLabel.setText(win + "승 " + lose + "패 " + draw + "무");
		
	}

}





