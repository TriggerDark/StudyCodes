package ��ҵ��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DealFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("src\\broadcast.txt");
		String[] s={"����Ԥ��:","������","�Ϻ�����,��С��","�����磬��ʱ����"};
		try {
			BufferedWriter in = 
					new BufferedWriter(
						new FileWriter(file));
			for(int i=0;i<s.length;i++){
				in.write(s[i]);
				in.newLine();
			}
			in.close();
			BufferedReader out=
					new BufferedReader(
							new FileReader(file));
			String str = null;
			while((str=out.readLine())!=null){
				System.out.println(str);
			}
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
