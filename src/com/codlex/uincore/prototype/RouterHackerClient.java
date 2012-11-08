package com.codlex.uincore.prototype;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * This class is for testing purposes only
 * and is attempt to open ports on router
 * so we can use it for all other connections.
 * If this is possible we will use it in whole
 * system. * 
 */
public class RouterHackerClient {
	public static final String serverName = "codlex.com";
	public static final int  port =  5050;
	public static void main(String[] args) throws UnknownHostException, IOException{
		System.out.println("Client for testing purposes!");
		Socket socket = new Socket(serverName, port);
		System.out.println("Connection opened with server.");
		System.out.println("getAddress: " + socket.getInetAddress());
		System.out.println("getPort: " + socket.getPort());
		System.out.println("getLocalAdress: " + socket.getLocalAddress());
		System.out.println("getLocalPort: " + socket.getLocalPort());
		System.out.println("getLocalSocketAddress: " + socket.getLocalSocketAddress());
		System.out.println("getRemoteSocketAddress: " + socket.getRemoteSocketAddress());
		//socket.close();
		System.out.println("Connection closed.");
		System.out.println("Jobs done!");
		System.out.println("Tutturu!");
		
	}
}
