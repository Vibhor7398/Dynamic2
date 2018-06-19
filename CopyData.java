package copyingData;

import java.io.*;

public class CopyData {

	public static void transferData() throws IOException {
		File f1 = new File("W:/Super30/New folder/src/abc.txt");
		File f2 = new File("W:/Super30/New folder/src/xyz.txt");
		f2.createNewFile();
		FileInputStream fin = new FileInputStream(f1);
		FileOutputStream fout = new FileOutputStream(f2);

		try {
			int i;
			while ((i = fin.read()) != -1) {
				fout.write((char) i);
			}
		} catch (Exception e) {
			System.out.println("Error");
		} finally {
			fin.close();
			fout.close();
			
		}
	}

	public static void printData() throws IOException {
		File f = new File("W:/Super30/New folder/src/xyz.txt");
		FileReader fr = new FileReader(f);
		int ch = fr.read();
		while (ch != -1) {
			System.out.print((char) ch + "");
			ch = fr.read();
		}
		fr.close();
	}

	public static void main(String[] args) throws IOException {
		transferData();
		printData();
	}

}
