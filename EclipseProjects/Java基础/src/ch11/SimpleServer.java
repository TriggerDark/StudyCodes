package ch11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
			ServerSocket server = new ServerSocket(5432)){
					//服务器端套接字，对方创建连接，返回Socket对象
					Socket socket = server.accept();
					//得到服务器端一对输入输出字节流
					InputStream in = socket.getInputStream();
					BufferedReader br =
							new BufferedReader(
									new InputStreamReader(in));	
					OutputStream out = socket.getOutputStream();
					BufferedWriter bw = 
							new BufferedWriter(
									new OutputStreamWriter(out));
					System.out.println(socket.getPort());
					bw.write("Hello World!");
					bw.flush();
					bw.close();
					/*DataOutputStream dos = 
							new DataOutputStream(out);
					dos.writeUTF("Hello, Java");
					dos.close();
					
					*/
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
