package com.codlex.uincore.system.network;
/**
 * 
 * Message is elementary object which is sent 
 * between two or more nodes. It relies on 
 * UNICOre abstraction which then uses various
 * methods to compress data and send it efficiently
 * over network.
 * 
 * @author Dejan Pekter deximat@gmail.com
 *
 */
public interface Message {
	public int getCode();
	public String getJSON();
}
