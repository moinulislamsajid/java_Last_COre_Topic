package FIle_Create;
import java.io.File;
public class File1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("Ayman Sajid");
		dir.mkdir(); // directory will be create
		File font_ent = new File("C:/Users/Sajid/Desktop/Ayman Sajid");
		font_ent.mkdir();
		
		// to show the file to create location
		String location = font_ent.getAbsolutePath();
		System.out.println(location);
		
		// folder name 
		System.out.println(font_ent.getName());
		
		// folder delete
		
		if(font_ent.delete()) {
			System.out.println(font_ent.getName()+"Folder Has Been Deleted");
		}
	

	}

}
