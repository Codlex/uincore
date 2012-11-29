package com.codlex.uincore.dispatcher;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.TreeMap;

import com.codlex.uincore.system.network.Message;

public class Accepter implements Runnable {
	public TreeMap<String, Socket> map = new TreeMap<String, Socket>();
	
	public void run() {
		ServerSocket server;
		try {
			server = new ServerSocket(3300);
			System.out.println("Accepter started!");
			while (true) {
				

				Socket newConnection = server.accept();
				System.out.println("Accepting connection!");
				ObjectInputStream input = new ObjectInputStream(newConnection.getInputStream());
				try {
					Message message = (Message) input.readObject();
					System.out.println("Stigla poruka od " + message);
					map.put(message.toString(), newConnection);
					new ObjectOutputStream(map.get("pera").getOutputStream()).writeUTF("MASH!");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}
