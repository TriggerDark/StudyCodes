package ×÷ÒµËÄ;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fis = new File("src\\first.txt");
		File fos = new File("src\\first_copy.txt");
		try {
			BufferedInputStream in = 
					new BufferedInputStream(
							new FileInputStream(fis));
			BufferedOutputStream out = 
					new BufferedOutputStream(
							new FileOutputStream(fos));
			byte[]buffer=new byte[1024];
			int len=in.read(buffer);
			while(len != -1){
				System.out.println(new String(buffer));
				out.write(buffer);
				len = in.read(buffer);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
