
package FIle_Create;
import java.io.File;



public class File_Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("Ayman Sajid");
		dir.mkdir();
		// To Get Path
		String path = dir.getAbsolutePath();
		
		// create file 
		
		File file1 = new File(path+"/Student.txt");
		File file2 = new File(path+"/teacher.txt");
		try {
			
			file1.createNewFile();
			file2.createNewFile();
			System.out.println("Files Has Been Created");
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		/*
		file2.delete();
		if(file2.exists()) {
			System.out.println("File Exists");
		}else {
			System.out.println("File does not Exists");
		}*/
		


	}

}
