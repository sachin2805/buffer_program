package buffer;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Multi_resource {

	public static void main(String[] args) throws Exception {
	try(FileInputStream fis = new FileInputStream("C:\\Users\\tmi\\eclipse-workspace\\all_program_java_lab_manual\\src\\buffer\\Sachin79");
			 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
		
		 System.out.println("Enter the line = ");
		 String x= br.readLine();
		 System.out.println(x+"\n");
		 
		 
		int i=0;
	     while((i=fis.read())!=-1){    
             System.out.print((char)i);    
            } 
		}
	
	}
}
/*OUTPUT
Enter the line = 
My name is Sachin 
My name is Sachin 

Sachin
JSPM ICOER
Pune
Profound
what , where , when , whom , how , why is the questions
*/
