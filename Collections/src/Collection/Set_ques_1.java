package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Set_ques_1 {

	private HashSet<String> country=new HashSet<String>();
	public HashSet<String> saveCountryName(String CountryName) {
		country.add(CountryName);
		return country;
	}
	public String getCountry(String CountryName) {
		Iterator<String> itr = country.iterator();
		while(itr.hasNext()) {
			String n=itr.next();
			if(n.equals(CountryName)) {
				return n;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set_ques_1 obj = new Set_ques_1();
		obj.saveCountryName("India");
        obj.saveCountryName("USA");
        obj.saveCountryName("Japan");
        System.out.println("HashSet after adding countries: " + obj.saveCountryName("Germany"));
        String result = obj.getCountry("India");
        if (result != null) {
            System.out.println("Country found: " + result);
        } else {
            System.out.println("Country not found.");
        }
        
        result = obj.getCountry("Brazil");
        if (result != null) {
            System.out.println("Country found: " + result);
        } else {
            System.out.println("Country not found.");
        }
	}

}