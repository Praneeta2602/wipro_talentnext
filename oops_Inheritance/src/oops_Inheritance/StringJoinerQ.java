package oops_Inheritance;
import java.util.*;
public class StringJoinerQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner s1 = new StringJoiner("-", "[", "]");
        s1.add("Delhi");
        s1.add("Mumbai");
        s1.add("Chennai");
        StringJoiner s2 = new StringJoiner("-", "[", "]");
        s2.add("Paris");
        s2.add("London");
        s2.add("New York");
        StringJoiner s1Copy = new StringJoiner("-", "[", "]");
        s1Copy.add("Delhi").add("Mumbai").add("Chennai");
        s1Copy.merge(s2);
        System.out.println("i) s1 merged to s2: " + s1Copy);
        StringJoiner s2Copy = new StringJoiner("-", "[", "]");
        s2Copy.add("Paris").add("London").add("New York");
        s2Copy.merge(s1);
        System.out.println("ii) s2 merged to s1: " + s2Copy);
		
	}

}
