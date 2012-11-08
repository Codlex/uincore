package com.codlex.uincore.prototype;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Connector {
	public static void main(String[] args) throws NumberFormatException, UnknownHostException, IOException {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println("Connecting...");
		Socket socket = new Socket(args[0], Integer.parseInt(args[1]));
		socket.close();
		System.out.println("Connected!!!!!");
	}

}
