package ch11_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleCliet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//本机还回地址：127.0.01，localhost
		try (
			Socket client = new Socket("127.0.0.1",5432)){
			
			InputStream in = client.getInputStream();
			BufferedReader br =
					new BufferedReader(
							new InputStreamReader(in));	
			
			OutputStream out  = client.getOutputStream();
			BufferedWriter bw = 
					new BufferedWriter(
							new OutputStreamWriter(out));
			bw.write("Hello,World!");
			bw.flush();
			
			client.shutdownInput();
			System.out.println(br.readLine());
			
			bw.close();
			br.close();
			
			/*System.out.println(br.readLine());
			br.close();
			DataInputStream dis = 
					new DataInputStream(in);
			System.out.println(dis.readUTF());
			dis.close();*/
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
