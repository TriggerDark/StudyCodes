package ch9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInoutReaderWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//读取当前Java源文件，一行行读加上行号
		//输出到文件并且输出到控制台
		File src = new File("src\\ch9\\FileInoutReaderWriter.java");
		File dest = new File("src\\desc.txt");
		try (
			BufferedReader in =
					new BufferedReader(
							new FileReader(src));
			BufferedWriter out =
					new BufferedWriter(
							new FileWriter(dest))){
			String str = null;
			int n = 0;
			while((str=in.readLine())!=null){
				n++;
				out.write(str);
				out.newLine();
				System.out.println(n + " " + str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
