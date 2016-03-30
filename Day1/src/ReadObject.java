import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
	FileInputStream fos;
	ObjectInputStream ois;
	ReadObject(){
		try{
			fos=new FileInputStream("src/obj.txt");
			ois=new ObjectInputStream(fos);
			Book temp=(Book) ois.readObject();
			System.out.println("From file: "+temp);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				ois.close();
				fos.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args)
	{
	 new ReadObject();
	}
}
