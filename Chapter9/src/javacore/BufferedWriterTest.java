package javacore;
import java.io.*;
public class BufferedWriterTest {
	public static void main(String[] args) throws Exception {
		FileWriter writer = new FileWriter("D:\\testout.txt");
		BufferedWriter buffer = new BufferedWriter(writer);
		buffer.write("Welcome to AI.");
		buffer.close();
		System.out.println("Success");
		}
		}

