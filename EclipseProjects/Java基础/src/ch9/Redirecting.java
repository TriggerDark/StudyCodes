package ch9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Redirecting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader in =
				new BufferedReader(
						new InputStreamReader(System.in))){
			String str = null;
			while((str=in.readLine())!=null){
				System.out.println(" " + str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
