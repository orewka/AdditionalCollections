package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> task1 = new ArrayList<>();
        task1.add("q");
        task1.add("qw");
        task1.add("qwe");
        task1.add("q");
        task1.add("qwert");
        task1.add("qwert");
        task1.add("trr");
        task1.add("rrr");
        task1.add("hrr");
        while (true) {
            String input = in.nextLine();
            String tmp;
            switch (input) {
                case "short":
                    tmp = task1.get(0);
                    for (String word: task1) if (word.length() < tmp.length()) tmp = word;
                    for (String word: task1) if (word.length() == tmp.length()) System.out.println(word);
                    break;
                case "long":
                    tmp = task1.get(0);
                    for (String word: task1) if (word.length() > tmp.length()) tmp = word;
                    for (String word: task1) if (word.length() == tmp.length()) System.out.println(word);
                    break;
                case "exit":
                    return;
            }
            if (input.length() == 1) {
                for (String word: task1) {
                    if (word.startsWith(input)) System.out.println(word);
                }
            }
        }
    }
}

