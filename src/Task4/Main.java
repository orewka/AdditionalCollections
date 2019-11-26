package Task4;

import java.time.LocalDate;
import java.util.*;

public class Main {
    static Map<String, LocalDate> getPeople(Season season, Map<String, LocalDate> map) {
        Map<String, LocalDate> res = new HashMap<>();
        switch (season) {
            case autumn:
                for (Map.Entry<String, LocalDate> entry : map.entrySet()) {
                    if (entry.getValue().getMonthValue() > 8 && entry.getValue().getMonthValue() < 12)
                        res.put(entry.getKey(), entry.getValue());
                }
                break;
            case spring:
                for (Map.Entry<String, LocalDate> entry : map.entrySet()) {
                    if (entry.getValue().getMonthValue() > 2 && entry.getValue().getMonthValue() < 6)
                        res.put(entry.getKey(), entry.getValue());
                }
                break;
            case summer:
                for (Map.Entry<String, LocalDate> entry : map.entrySet()) {
                    if (entry.getValue().getMonthValue() > 5 && entry.getValue().getMonthValue() < 9)
                        res.put(entry.getKey(), entry.getValue());
                }
                break;
            case winter:
                for (Map.Entry<String, LocalDate> entry : map.entrySet()) {
                    if (entry.getValue().getMonthValue() > 11 || entry.getValue().getMonthValue() < 3)
                        res.put(entry.getKey(), entry.getValue());
                }
                break;
        }
        return res;
    }

    public static void main(String[] args) {
        Map<String, LocalDate> task3 = new HashMap<>();
        task3.put("Alex", LocalDate.of(89, 1, 25));
        task3.put("Victor", LocalDate.of(89, 6, 25));
        task3.put("Dmitriy", LocalDate.of(89, 9, 25));
        System.out.println(getPeople(Season.autumn, task3));
    }
}
