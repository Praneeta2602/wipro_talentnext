package oops_Inheritance;
import java.util.*;

public class String8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '*') {
                
                    System.out.println(s.substring(i-1, i+1));
                }
            }
        }
    }
}
