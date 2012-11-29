package com.codlex.uincore.dispatcher;

import java.net.Socket;
import java.util.TreeMap;

public class Center {
	public Accepter accepter;
	public Center() {
		accepter = new Accepter();
		Thread accepterThread = new Thread(accepter);
		accepterThread.start();
			
	}
	
	public static void main(String[] args) {
		Center center = new Center();		
	}

}
