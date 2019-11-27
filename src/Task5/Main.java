package Task5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // сначало вводим данные с клавиатуры в формате покупатель товар количество
        // для начала сортировки написать в консоли go
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        String input;
        String[] newClient;
        Map<String, Map<String, Integer>> result = new TreeMap<>();
        while (!done) {
            input = scanner.nextLine();
            if (!input.equals("go")) {
                int count;
                newClient = input.split(" ");
                if (result.containsKey(newClient[0])) {
                    if (result.get(newClient[0]).containsKey(newClient[1])) {
                        result.get(newClient[0]).replace(newClient[1],result.get(newClient[0]).get(newClient[1]),result.get(newClient[0]).get(newClient[1]) + Integer.parseInt(newClient[2]));
                    } else {
                        result.get(newClient[0]).put(newClient[1],Integer.parseInt(newClient[2]));
                    }
                } else {
                    Map<String, Integer> items = new TreeMap<>();
                    items.put(newClient[1],Integer.parseInt(newClient[2]));
                    result.put(newClient[0],items);
                }
            } else done = true;
        }
        for (Map.Entry<String, Map<String, Integer>> entry: result.entrySet()) {
            System.out.println(entry.getKey() + ":");
            System.out.println(entry.getValue().toString().replaceAll("[{}]","").replace("="," - "));
        }
    }
}