import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CountWord{
	public static void main(String[] args) {
		int counter = 0;
		try{
			//File file = new File("berthastatement.txt");
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\jpainam\\Documents\\berthastatement.txt"));
			String line = "";
			while((line = br.readLine()) != null){
				String[] tab = line.split(" ");
				counter += tab.length;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(counter);
	}
}