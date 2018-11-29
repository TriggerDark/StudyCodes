package ×÷ÒµËÄ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteFile {
	
	public static void main(String[] args){
		//Scanner scan = new Scanner(System.in);
		File file = new File("src\\first.txt");
		try (
			BufferedReader in=
					new BufferedReader(
							new InputStreamReader(System.in));
			BufferedWriter out = 
					new BufferedWriter(
							new FileWriter(file))){
			String s = in.readLine();
			/*while(scan.hasNext()){
				s = scan.next();
				if(s.equals("end"))break;
				out.write(s);
				out.newLine();
				System.out.println(s);
			}*/
			while(!s.equals("end")){
				out.write(s);
				out.newLine();
				System.out.println(s);
				s = in.readLine();
			}
			in.close();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
