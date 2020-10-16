package awtSample08;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class WindowTest extends JFrame implements WindowListener {
	
	Choice choice;  // select option     swing -> JCombobox
	Label label;

	public WindowTest() {
			
		
		
        setLayout(new FlowLayout());	
        
        choice = new Choice();
        choice.add("사과");
        choice.add("포도");
        choice.add("낑깡");
        choice.add("딸기");
        choice.add("수박");
        
        choice.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				label.setText(choice.getSelectedItem());
				
			}
		});
        
        add(choice);
        
        label = new Label("---");
        add(label);
		
		setBounds(0, 0, 640, 480);
	
		setVisible(true);
		
		addWindowListener(this);
	}
	

	@Override
	public void windowActivated(WindowEvent e) {

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
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
