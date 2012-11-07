package com.codlex.uincore.client.viewer;

import javax.swing.JFrame;


public class SimpleViewer extends JFrame implements Viewer{
	private static final long serialVersionUID = 1L;
	static private SimpleViewer instance;
	static public synchronized Viewer getInstance(){
		if(instance == null) {
			instance = new SimpleViewer();
		}
		return instance;
	}
	public void close(){
		return;
	}
	private SimpleViewer() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		Viewer loginWindow = new LoginWindow();
		loginWindow.show();
		
	}
}
