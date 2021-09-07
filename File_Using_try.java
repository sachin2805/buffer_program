package buffer;
import java.io.FileInputStream;
public class File_Using_try {

public static void main(String[] args) throws Exception {
				try(FileInputStream fis = new FileInputStream("C:\\Users\\tmi\\eclipse-workspace\\all_program_java_lab_manual\\src\\buffer\\Sachin79");){
			
			int i=0;
		     while((i=fis.read())!=-1){    
	             System.out.print((char)i);    
	            } 
			}
		
		}

}


