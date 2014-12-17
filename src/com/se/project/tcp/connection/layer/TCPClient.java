/**
 * 
 */
package com.se.project.tcp.connection.layer;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author ClPardos
 *
 */
public class TCPClient implements TCPConnectionPoint {

	public Socket sock;
	public String destIp;
	public int destPort;
	
	public TCPClient(String ip,int port){
		destIp=ip;
		destPort=port;
		
	}
	
	public void open() {
		try {
			sock=new Socket(destIp,destPort);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void read(byte[] data1, int length) {
		InputStream in;
		try {
			in = sock.getInputStream();
			data1=new byte[length];
			for (int i=0;i<length;i++){
				in.read(data1,0,length);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void write(byte[] data1) {
		OutputStream out;
		try {
			out = sock.getOutputStream();
			for (int i=0;i<data1.length;i++){
			out.write(data1,0,data1.length);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void close() {
		try {
			sock.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
