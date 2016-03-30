import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class FileOperations {
  FileOperations()  {
		FileInputStream fis;
		FileOutputStream fos;	
		int i;
		
			try{
				fis=new FileInputStream("src/a.txt");
				fos=new FileOutputStream("src/b.txt");
				while((i=fis.read())!=-1)//Every time you say read it returns the integer
						{
							System.out.print((char)i);
							fos.write((char)i);
						}
				fos.close();
				fis.close();
			}
			catch(IOException e){
				
			}
			finally{
				
			}
		}
	
public static void main(String[] args) 
{
new FileOperations();	
	
}
}
