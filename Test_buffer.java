/*package buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_buffer {

	public static void main(String[] args) throws IOException {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter the char = ");
	 char m=(char)br.read();
	 System.out.println(m);
	 br.close();
	}

}
/*OUTPUT
 Enter the char = 
S
S
 */

//---------------- Using readLine -------------------

package buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_buffer {

	public static void main(String[] args) throws IOException {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	 
	 System.out.println("Enter the  char or for exit type 'q'= ");
	char i;
	 do {
		i=(char) br.read();
	 System.out.println(i);
	 }while(i!='q');
	 
	 System.out.println("Enter the line  or for exit type exit= ");
	 String x;
	 do {
		 x= br.readLine();
	 System.out.println(x);
	 }while(!x.equals("exit"));
	 
	 br.close();
	}

}
/*
OUTPUT
Enter the  char or for exit type 'q'= 
sa
s
a


b
b


z
z


q
q     // Use for exit 
Enter the line  or for exit type exit= 

Hello this is the new version
Hello this is the new version
so u want to participet on it 
so u want to participet on it 
hurry up grb it now
hurry up grb it now
exit
exit   / Use for exit or terminate the loop

*/

