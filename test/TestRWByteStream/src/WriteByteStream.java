import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class WriteByteStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {	
			FileOutputStream fos = new FileOutputStream("textw.txt");
			String str = "����������һ�����ԣ�";
			byte output[];
			try {
				output = str.getBytes("GBK");
				fos.write(output);
				fos.close();
			} catch (UnsupportedEncodingException e1) {
					e1.printStackTrace();	
			} catch (IOException e) {
				e.printStackTrace();
			} 
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
