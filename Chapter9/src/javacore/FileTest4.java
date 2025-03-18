package javacore;
import java.io.*;

public class FileTest4 {
	public static void main(String[] args) {
		File dir=new File("/Users/sonoojaiswal/Documents");
		File files[]=dir.listFiles();
		for(File file:files){
			System.out.println(file.getName() + " Can Write: " + file.canWrite() +
                    " Is Hidden: " + file.isHidden() + " Length: " + file.length() + " bytes");
		}
		}
}
