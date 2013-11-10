package lesson16;

import java.io.*;

public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream myFile = null;
		BufferedInputStream buff =null;
		try {
			
			//String path = "C:/Program Files/MySQL/MySQL Server 5.5/data/mysql/slow_log.CSM";
			String path = "c:/windows/bootstat.dat";
			myFile = new FileInputStream(path);
			
			buff = new BufferedInputStream(myFile);
			boolean eof = false;
			while (!eof) {
				int byteValue = buff.read();
				System.out.print(byteValue+" ");
				if (byteValue == -1)
					eof = true;
			}
		} catch (IOException e) {  }
		finally{ 
			if (myFile !=null){
				try{
					buff.close(); 
					myFile.close();
				} catch (Exception e1){
					e1.printStackTrace();
				}
			}
		}

	}

}
