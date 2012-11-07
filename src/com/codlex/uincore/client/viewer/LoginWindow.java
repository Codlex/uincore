package com.codlex.uincore.client.viewer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginWindow extends JFrame implements Viewer{
	private static final long serialVersionUID = 1L;

	LoginWindow() {
		setBounds(100, 100, 400, 400);
		setBackground(Color.BLUE);
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		JPanel blockPanel = new JPanel();
		JPanel spaceHolderRight = new JPanel();
		JPanel spaceHolderLeft = new JPanel();

		spaceHolderLeft.setPreferredSize(new Dimension(50, 250));
		spaceHolderRight.setPreferredSize(new Dimension(50, 250));

		mainPanel.add(spaceHolderLeft, BorderLayout.EAST);
		mainPanel.add(spaceHolderRight, BorderLayout.WEST);
		blockPanel.setPreferredSize(new Dimension(400, 250));
		blockPanel.setLayout(new GridLayout(6, 1));
		JLabel usernameLabel = new JLabel("Username:");
		usernameLabel.setAlignmentX(CENTER_ALIGNMENT);
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setAlignmentX(CENTER_ALIGNMENT);
		JTextField username =  new JTextField();
		username.setPreferredSize(new Dimension(200, 25));
		JPanel wrapper1 = new JPanel();
		wrapper1.add(username);
		JTextField password = new JTextField();
		password.setPreferredSize(new Dimension(200, 25));
		JPanel wrapper2 = new JPanel();
		wrapper2.add(password);
		JButton submitButton = new JButton("Login");
		JButton registerButton = new JButton("Register");
		blockPanel.add(usernameLabel);
		blockPanel.add(wrapper1);
		blockPanel.add(passwordLabel);
		blockPanel.add(wrapper2);
		blockPanel.add(submitButton);
		blockPanel.add(registerButton);
		mainPanel.add(blockPanel, BorderLayout.CENTER);
		add(mainPanel);		
		
	}
	
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
