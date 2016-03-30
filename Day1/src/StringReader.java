import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StringReader {
	BufferedReader br;
	FileReader fr;
	FileWriter fw;
	String s;
	StringReader()
	{
		try {
			fr=new FileReader("src/a.txt");
			fw=new FileWriter("src/b.txt");
			while((s=br.readLine())!=null)
			{
				fw.write(s);	
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
		
		}
		
		
	}
public static void main(String[] args)
{
	new StringReader();
}
}
