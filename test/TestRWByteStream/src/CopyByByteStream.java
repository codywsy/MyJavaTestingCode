import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyByByteStream {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("ani.gif");
			FileOutputStream fos = new FileOutputStream("ani_copy.gif");
			byte input[] = new byte[50];
			while(fis.read(input) != -1){
				fos.write(input);		
			}
			System.out.println("done!");
			fos.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
	}

}
