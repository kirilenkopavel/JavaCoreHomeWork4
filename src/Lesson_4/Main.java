package Lesson_4;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add ("Дом");
        list.add ("Двор");
        list.add ("Собака");
        list.add ("Кот");
        list.add ("Дом");
        list.add ("Авто");
        list.add ("Дети");
        list.add ("Авто");
        list.add ("Стул");
        list.add ("Дом");
        list.add ("Кот");
        list.add ("Вешалка");
        list.add ("Кот");
        list.add ("Мышь");
        list.add ("Авто");
        list.add ("Дом");
        list.add ("Мышь");

        for(String k : list){
            System.out.println(k);
        }

        HashMap<String, Integer> repeatSumm = new HashMap<>();
        for (String character : list) {
            if (repeatSumm.get(character) == null) {
                repeatSumm.put(character, 1);
            }
            else {
                repeatSumm.put(character, repeatSumm.get(character) + 1);
            }
        }
        System.out.println(repeatSumm);

        Set<String> set = new HashSet<String>(list);
        String[] result = set.toArray(new String[set.size()]);
        for(String k : set) {
            System.out.println(k);
        }

        Phonebook phonebook = new Phonebook();

        phonebook.add("Вася", "555-555");
        phonebook.add("Петя", "666-666");
        phonebook.add("Дима", "777-777");
        phonebook.add("Коля", "888-888");
        phonebook.add("Вика", "999-9999");
        phonebook.add("Глеб", "123-456");

        phonebook.get("Вася");





    }
}
