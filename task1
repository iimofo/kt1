import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 3, 5, 6));
        int target = 5;

        int index = list.indexOf(target);

        if (index != -1) {
            System.out.print(index);
        } else {
            list.add(target);
            Collections.sort(list);
            System.out.print(list.indexOf(target));
        }
    }
}
