package com.jan.demo;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	public static void main(String[] args) {
		
		try {
			// 1. 创建一个socket
			Socket socket = new Socket("localhost", 6666);
			
			// 2. 给服务端发消息
			String message = "Hello Server , I am Client";
			System.out.println("我是客户端，我说：" + message);
			// 将流传给socket
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeUTF(message);
			dos.close();
			os.close();
			socket.close();
			} catch (UnknownHostException e) { // 找不到主机报错
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) { // 数据传输报错   Exception e是父类异常
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
