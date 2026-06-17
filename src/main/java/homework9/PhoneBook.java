package homework9;

import java.util.HashMap;

public class PhoneBook {

    static HashMap<String, String> phoneBook = new HashMap<>();

    public static String findPhone(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }
        return "არ მოიძებნა";
    }

    public static void main(String[] args) {

        phoneBook.put("Mikheili", "555111111");
        phoneBook.put("Anna", "555222222");
        phoneBook.put("Beka", "555333333");
        phoneBook.put("Eka", "555444444");

        System.out.println(findPhone("Anna"));
        System.out.println(findPhone("Nino"));

        for (String key : phoneBook.keySet()) {
            System.out.println(key + " -> " + phoneBook.get(key));
        }
    }
}