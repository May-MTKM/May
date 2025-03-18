package javacore;
import java.io.*;

public class FileTest3 {
	public static void main(String[] args) {
		File f=new File("/file");
		String filenames[]=f.list();
		for(String filename:filenames){
		System.out.println(filename);
		}
		}
}
