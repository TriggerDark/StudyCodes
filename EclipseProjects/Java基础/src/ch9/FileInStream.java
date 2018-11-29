package ch9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("src\\1.txt");
		try {
			FileInputStream fis=new FileInputStream(file);
			byte[]buffer=new byte[1024];
			int len=fis.read(buffer);
			while(len != -1){
				System.out.println(new String(buffer));
				len = fis.read(buffer);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*try(FileInputStream fis=new FileInputStream(file)){
			byte[]buffer=new byte[1024];
			int len=fis.read(buffer);
			while(len != -1){
				System.out.println(new String(buffer));
				len = fis.read(buffer);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
