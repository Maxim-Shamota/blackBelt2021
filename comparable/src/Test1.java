import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Max");
        list.add("Nata");
        list.add("Juliya");
        Collections.sort(list);
        System.out.println(list);
    }
}
