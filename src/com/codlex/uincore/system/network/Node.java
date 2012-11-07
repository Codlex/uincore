package com.codlex.uincore.system.network;

/**
 * This interface defines elementary network abstraction
 * everything within UINCore is referenced by Node
 * Node can be created from factory, or can be gathered 
 * from NodeService, owned by Dispatcher
 * 
 * @author Dejan Pekter <deximat@gmail.com>
 *
 */
public interface Node {
	/**
	 * Node uses this method to receive messages
	 * and act as a server, it can receive multiple
	 * messages from multiple nodes.
	 * 
	 * @return message received from other node/s
	 */
	public Message getMessage();
	/**
	 * This method sends message to node who's id is provided,
	 * and enables fast response right away through return value.
	 * Every message is signatured, by sending node.
	 * 
	 * @param toNodeId that we are sending message to
	 * @param message that should be sent to node
	 * @return message fast response
	 */
    public Message sendMessage(int toNodeId, Message message); 

}
