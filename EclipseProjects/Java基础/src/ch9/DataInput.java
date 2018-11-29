package ch9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("src\\data.txt");
		try {
			DataOutputStream dos = 
					new DataOutputStream(
							new BufferedOutputStream(
									new FileOutputStream(file)));
			dos.writeInt(123);
			dos.writeUTF("ÄãºÃ");
			dos.writeByte(12);
			dos.writeDouble(123.4567);
			dos.close();
			
			DataInputStream dis = 
					new DataInputStream(
							new BufferedInputStream(
									new FileInputStream(file)));
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
			System.out.println(dis.readByte());
			System.out.println(dis.readDouble());
			dis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
