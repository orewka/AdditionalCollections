package Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
        public static List<Good> cloneGood(List<Good> good) throws CloneNotSupportedException {
            List<Good> res = new ArrayList<>();
            for (Good g : good) {
                res.add(g);
                res.add((Good) g.clone());
            }
            return res;
        }


    public static void main(String[] args) throws CloneNotSupportedException {
        List<Good> task2 = new ArrayList<>();
        Good good = new Good("Яблоко","1",50);
        Good good1 = new Good("Банан","2",25);
        task2.add(good);
        task2.add(good1);
        System.out.println(task2.size());
        System.out.println(cloneGood(task2));
    }
}
