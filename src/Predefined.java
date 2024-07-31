import java.util.function.Predicate;

public class Predefined {
    public static void main(String[] args) {

        Predicate<Integer> predicate = n -> n % 2 == 0 ;
        System.out.println(predicate.test(56));
    }
}
