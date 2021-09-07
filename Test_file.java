package buffer;

import java.io.*;
public class Test_file {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\tmi\\eclipse-workspace\\all_program_java_lab_manual\\src\\buffer\\Sachin79");
		
		int i=0;
	     while((i=fis.read())!=-1){    
             System.out.print((char)i);    
            } 
	}

}
/*OUTPUT
Sachin
JSPM ICOER
Pune
Profound
what , where , when , whom , how , why is the questions
*/