package Collection;
import java.util.*;
public class List_ques_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> data=new ArrayList<String>();
		data.add("hi");
		data.add("in the middle para");
		data.add("bye");
		
		printAll(data);
	}
	
	static void printAll(ArrayList<String> list) {
		
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	

}