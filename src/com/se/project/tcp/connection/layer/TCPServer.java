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
	
	public String getRemoteIpAddress(){
        return sock.getInetAddress().getHostAddress();}
	
	public void open() {
		try {
			servSock=new ServerSocket(listeningPort);
			sock=servSock.accept();
			
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
			servSock.close();
		} catch (IOException e) {
			 System.out.println("Nu s-a putut inchide conexiunea!");
	         System.exit(-1);
		}
		
	}

}
