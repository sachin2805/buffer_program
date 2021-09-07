package buffer;

import java.util.*;

/*public class All_list {

	public static void main(String[] args) {
LinkedList l = new LinkedList();
 l.add("Sachin");
 l.add(1,"Powar");
 l.add("Rajaram");
 l.add(0,"BE");


 
 l.addFirst("Details");
 l.addLast("Last");
 
 System.out.println(l);
 
 l.remove(0);
 l.removeLast();
 
 System.out.println(l);
  }

}

/*OUTPUT
[Details, BE, Sachin, Powar, Rajaram, Last]
[BE, Sachin, Powar, Rajaram]
*/
public class All_list {

	public static void main(String[] args) {
ArrayList a = new ArrayList();
 a.add("Sachin");
 a.add(1,"Powar");
 a.add("Rajaram");
 a.add(0,"BE");

 System.out.println(a);
 
 a.remove(0);  //Using index
 a.remove("BE");  // Using name
 
 System.out.println(a);
  }
}
/*OUTPUT
[BE, Sachin, Powar, Rajaram]
[Sachin, Powar, Rajaram]
*/


