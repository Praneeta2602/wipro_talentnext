package Collection;


import java.util.*;

public class map_ques_1 {
    // Instance variable M1
    private HashMap<String, String> M1 = new HashMap<>();

    // 1. Method to save country and capital
    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    // 2. Method to get capital by country name
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // 3. Method to get country by capital name
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return null; // If not found
    }

    // 4. Method to reverse the map (Capital -> Country)
    public HashMap<String, String> reverseMap() {
        HashMap<String, String> M2 = new HashMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    // 5. Method to get list of all countries
    public ArrayList<String> getAllCountries() {
        return new ArrayList<>(M1.keySet());
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        map_ques_1 map = new map_ques_1();

        // Adding countries and capitals
        map.saveCountryCapital("India", "Delhi");
        map.saveCountryCapital("Japan", "Tokyo");

        // Testing getCapital
        System.out.println("Capital of India: " + map.getCapital("India"));

        // Testing getCountry
        System.out.println("Country with capital Tokyo: " + map.getCountry("Tokyo"));

        // Testing reverseMap
        HashMap<String, String> reversed = map.reverseMap();
        System.out.println("Reversed Map (Capital -> Country): " + reversed);

        // Testing getAllCountries
        ArrayList<String> countries = map.getAllCountries();
        System.out.println("List of Countries: " + countries);
    }
}
