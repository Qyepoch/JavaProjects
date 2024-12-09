package com.jan.demo;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) {
		
		try {
			// 1. 创建socket
			ServerSocket serverSocket = new ServerSocket(6666); //args:port
			// 接受客户端请求
			Socket socket = serverSocket.accept();
			// 获取客户端请求
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			String message = dis.readUTF();
			System.out.println(message);
			dis.close();
			is.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
