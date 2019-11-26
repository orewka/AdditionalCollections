package Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<String> changeList(int a,List<String> list) {
        List<String> res = new ArrayList<>();
        for (int i = a+1; i < list.size(); i++) {
            res.add(list.get(i));
        }
        for (int i = 0; i <= a; i++) {
            res.add(list.get(i));
        }
        return res;
    }


    public static void main(String[] args) {
        List<String> task3 = new ArrayList<>();
        task3.add("q");
        task3.add("qw");
        task3.add("qwe");
        task3.add("qwer");
        task3.add("qwert");
        System.out.println(changeList(2,task3));
    }
}
