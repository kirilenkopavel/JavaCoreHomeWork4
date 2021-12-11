package Lesson_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Phonebook {
    HashMap<String, String> phonebook;

    Phonebook() {
        phonebook = new HashMap<>();
    }

    public void add(String surname, String number) {
        phonebook.put(surname, number);
    }

    public void get(String surname) {
        if (phonebook.containsValue(surname)) {
            Set<HashMap.Entry<String, String>> set = phonebook.entrySet();
            for (HashMap.Entry<String, String> temp : set) {
                if (temp.getValue().equals(surname)) {
                    System.out.println(temp.getKey() + " : " + temp.getValue());
                }
            }
        }
    }
}
