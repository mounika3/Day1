import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObjects {
	FileOutputStream fos;
	ObjectOutputStream os;
	WriteObjects(){
		try{
			fos=new FileOutputStream("src/obj.txt");
			os=new ObjectOutputStream(fos);
			Book b1=new Book(101,"Java",12.34);
			os.writeObject(b1);// you are trying to push in to permanent storage. after the running the object 
			//will die. By default none of the java objects will have the persistence property . So inorder to provide persistence proviede serialixzability
			System.out.println("Book is Stored");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			try{
			os.close();
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
		new WriteObjects();
	}

}
