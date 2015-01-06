/**
 * 
 */
package com.se.project.tcp.connection.layer;

import java.io.IOException;




/**
 * @author ClPardos
 *
 */
public interface TCPConnectionPoint {

	void open();
	
	void read(byte[] data) throws IOException ;
	
	void write(byte[] data ) throws IOException;
	
	void close();
}
