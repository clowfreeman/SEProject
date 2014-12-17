/**
 * 
 */
package com.se.project.tcp.connection.layer;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * @author ClPardos
 *
 */
public class TCPServer implements TCPConnectionPoint {

	private ServerSocket servSock;
	private Socket sock;
	private int listeningPort;
	
	public TCPServer(int port){
		listeningPort=port;
		
	}
	
	public void open() {
		try {
			servSock=new ServerSocket(listeningPort);
			sock=servSock.accept();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void read(byte[] data1) {
		InputStream in;
		try {
			in = sock.getInputStream();
			
			in.read(data1,0,data1.length);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
		

	public void write(byte[] data1) {
		OutputStream out;
		try {
			out = sock.getOutputStream();
			out.write(data1,0,data1.length);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void close() {
		try {
			sock.close();
			servSock.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
