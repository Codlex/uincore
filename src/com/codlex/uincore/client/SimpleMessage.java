package com.codlex.uincore.client;

import com.codlex.uincore.system.network.Message;

public class SimpleMessage implements Message {
	private String to;
	private String from;
	private String json;
	private int code;
	
	public SimpleMessage(String from, String to, int code) {
		this.from = from;
		this.to = to;
		this.code = code;
		this.json = new String();
	}
	@Override
	public String getTo() {
		return to;
	}

	@Override
	public String getFrom() {
		return from;
	}

	@Override
	public int getCode() {
		return code;
	}

	@Override
	public String getJSON() {
		return json;
	}
	public String setJSON() {
		return json;
	}
	public String toString() {
		return getFrom();
	}

}
