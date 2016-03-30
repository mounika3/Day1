import java.io.File;
import java.lang.Exception;
public class FileDemo {
	File file;
	FileDemo(String ext){
		String path="/Users/ssnani9";
		try
		{
			file=new File(path);// You are converting a normal string to the path by using File
			if(file.isDirectory()){
				System.out.println("Is DIr");
				String[] arr=file.list(new Extension(ext));
				for(int i=0;i<arr.length;i++)
				{
					if(new File(path+"/"+arr[i]).isDirectory())// we have to have one more local object. instead we can dynamically converting string it in to the file object  crely 
							{
						System.out.println(arr[i]+"  is Directory");
							}
					else System.out.println(arr[i]+"  is File");
				}
			}
			else{
				System.out.println(file.isHidden()?"Hidden... ":"Visible");
				System.out.println(file.canWrite()?"Writable... ":"Visible");
				System.out.println(file.length());

			}
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  new FileDemo(args[0]);
	}

}
