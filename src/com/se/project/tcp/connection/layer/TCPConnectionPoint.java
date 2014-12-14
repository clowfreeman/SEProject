/**
 * 
 */
package com.se.project.tcp.connection.layer;


/**
 * @author ClPardos
 *
 */
public interface TCPConnectionPoint {

	void open();
	
	void read(byte[] data,int length);
	
	void write(byte[] data );
	
	void close();
}
