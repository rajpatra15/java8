import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparatorlambda {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(0);
        al.add(20);
        al.add(12);
        al.add(17);
        al.add(100);
        System.out.println(al);

        Comparator<Integer> myComparator = (Integer obj1, Integer obj2) -> obj2 - obj1;
        al.sort(myComparator);

        System.out.println(al);
    }
}
