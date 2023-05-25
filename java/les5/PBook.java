package les5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PBook {
    private Map<String, ArrayList<String>> map = new HashMap<>();

    void deleteByName(String name) {
        if (map.containsKey(name)) {
            map.remove(name);
            System.out.printf("Контакт \"%s\" удалён\n", name);
        } else {
            System.out.printf("Контакта \"%s\" не существует\n", name);
        }
    }
    String getByName(String name){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey().equals(name)){
                stringBuilder.append(entry.getKey());
                stringBuilder.append(": ");
                stringBuilder.append(entry.getValue());
                stringBuilder.append("\n");
            }
        }
        if (stringBuilder.length() == 0) {
            System.out.println("Такого контакта не существует!");
        }
        return stringBuilder.toString();
    }
    void addContact(String name, String phoneNumber) {
        if (map.containsKey(name)) {
            ArrayList<String> list = map.get(name);
            list.add(phoneNumber);
        } else {
            ArrayList<String> list = new ArrayList<>();
            list.add(phoneNumber);
            map.put(name, list);
        }
    }

    String getList() {
        System.out.println("Список всех контактов:");
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}