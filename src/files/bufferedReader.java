package files;
import java.io.*;
public class bufferedReader {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter writer = null;
		String line = null;
		try {
			fr = new FileReader("src/files/sample.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			writer = new FileWriter("src/files/sample1.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(writer);
		try {
			while((line = br.readLine())!=null) {
				System.out.println(line);
				bw.write(line);
				bw.newLine();
			}
			br.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
