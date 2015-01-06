/**
 * 
 */
package com.se.project.tcp.connection.layer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author ClPardos
 *
 */
public class TCPClient implements TCPConnectionPoint {

	private Socket sock;
	private String destIp;
	private int destPort;
	
	public TCPClient(String ip,int port){
		destIp=ip;
		destPort=port;
		
	}
	
	public void open() {
		try {
			sock=new Socket(destIp,destPort);
			
		} catch (IOException e) {
			System.out.println("Nu s-a putut realiza conexiunea!");
            System.exit(-1);
		}
		
	}

	public void read(byte[] data1) throws IOException {
		InputStream in;
		
			in = sock.getInputStream();
			in.read(data1,0,data1.length);
	}

	public void write(byte[] data1) throws IOException {
		OutputStream out;
		
			out = sock.getOutputStream();
			out.write(data1,0,data1.length);
		
	}

	public void close() {
		try {
			sock.close();
		} catch (IOException e) {
			System.out.println("Nu s-a putut inchide conexiunea!");
            System.exit(-1);
		}
		
	}

}
