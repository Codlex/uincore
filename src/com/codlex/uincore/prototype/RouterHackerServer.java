package com.codlex.uincore.prototype;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * This class should accept connections and say to
 * clients what is their ip adress and port opened
 * on router.
 * This is basically just for testing purposes.
 * This class should be run on public ip adress.
 */
public class RouterHackerServer {
	public static void main(String[] args) throws IOException{
		ServerSocket server = new ServerSocket(60393);
		System.out.println("Welcome to UINCore test server for hacking routers...");
		System.out.println("Loading...");
		while(true) {
			System.out.println("Server is ready and waiting for connections...");
			Socket konekcija = server.accept();
			System.out.println("Connected client:");
			System.out.println("Client info:");
			System.out.println(";-------------------------------------------");
			System.out.println("getAddress: " + konekcija.getInetAddress());
			System.out.println("getPort: " + konekcija.getPort());
			System.out.println("getLocalAdress: " + konekcija.getLocalAddress());
			System.out.println("getLocalPort: " + konekcija.getLocalPort());
			System.out.println("Your router is hacked, use above info to acces your remote computer...");
			OutputStreamWriter output = new OutputStreamWriter(konekcija.getOutputStream());
			System.out.println("Sending ip to client");
			output.write(konekcija.getInetAddress().toString());
			System.out.println("Sending port to client");
			output.write(konekcija.getPort());
			System.out.println("Info sent.");
			//konekcija.
			//konekcija.close();
			System.out.println("Connection closed...");
		}
	}
}
