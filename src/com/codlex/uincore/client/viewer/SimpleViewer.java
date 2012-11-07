package com.codlex.uincore.client.viewer;


import javax.swing.JFrame;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;


public class SimpleViewer extends JFrame implements Viewer{
	private static Logger log = Logger.getLogger(SimpleViewer.class);
	private static final long serialVersionUID = 1L;
	static private SimpleViewer instance;
	static public synchronized Viewer getInstance(){
		if(instance == null) {
			instance = new SimpleViewer();
			log.debug("Created new window");
			
		}
		return instance;
	}
	public void close(){
		return;
	}
	private SimpleViewer() {
		BasicConfigurator.configure();
		log.setLevel(Level.DEBUG);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		Viewer loginWindow = new LoginWindow();
		loginWindow.show();
		
	}
}
