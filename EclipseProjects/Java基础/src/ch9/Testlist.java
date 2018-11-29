package ch9;

import java.io.File;

public class Testlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fs=new File("src");
		ListFile(fs);
	}

	private static void ListFile(File fs) {
		// TODO Auto-generated method stub
		File[] filename=fs.listFiles();
		for(File file:filename){
			if(file.isDirectory()){
				ListFile(file);
			}
			else{
				System.out.println(file.getName());
			}
		}
	}

}
