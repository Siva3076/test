import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class List1 {
public static void main(String[] args) {
	ArrayList li= new ArrayList();
	li.add(10);
	li.add(20);
	li.add(40);
	li.add(30);
	li.add(05);
	li.add(20);
	//System.out.println(li);
	Set se= new HashSet(li);
	
	//System.out.println(se);
	
	  for (int i = 0; i < li.size(); i++) {
		 // System.out.println(li.get(i));
		  if (li.equals(30)) {
			System.out.println("Pass");
		}
	}
		  
	  
	 
	 
	List li2= new LinkedList();
	li2.add(10);
	li2.add(30);
	li2.add(20);
	li2.add(40);
	li2.add(30);
	//System.out.println(li2);
	Set se2= new LinkedHashSet(li2);
	//System.out.println(se2);
	
}
}
