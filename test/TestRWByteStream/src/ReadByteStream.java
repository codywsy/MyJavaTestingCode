import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class ReadByteStream {

	public static void main(String[] args) {
		try {
			byte input[] = new byte[21];
			FileInputStream fis = new FileInputStream("text.txt");
			try {
				fis.read(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			String inputString;
			inputString = new String(input);
			System.out.println(inputString);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
