package main;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowTest extends Frame implements WindowListener{

	public WindowTest()  {
		setSize(640, 480); // 원도우 폭, 높이
		setLocation(0, 0); // 원도우 실행 위치
		setVisible(true); // 윈도우 시각화
		
		//Listener
		addWindowListener(this);
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("WindowActivated");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("WindowClosed");
	}

	@Override
	public void windowClosing(WindowEvent e) {
	   System.out.println("WindowClosing");
	   System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("WindowDeactivated");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Windowcondified");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Windowopened");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	}
    
	



