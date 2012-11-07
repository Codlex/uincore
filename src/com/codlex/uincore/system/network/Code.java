package com.codlex.uincore.system.network;
/**
 * Messages that are massivly used are represented by enum
 * so we can easily send them over network just by one int
 * and not spending a lot of characters to describe them.
 * 
 * @author Dejan Pekter deximat@gmail.com
 *
 */
public enum Code {
	GET,
	POST,
	PERMISSION_DENIED
}
