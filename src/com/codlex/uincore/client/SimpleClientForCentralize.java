package com.codlex.uincore.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClientForCentralize {
	
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 3300);
			
			new ObjectOutputStream(socket.getOutputStream()).writeObject(new SimpleMessage("pera", "marko", 1));
			System.out.println(new ObjectInputStream(socket.getInputStream()).readUTF());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
