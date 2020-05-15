package InteviewquestionsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraylistremoveAhmed {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        names.removeAll(Arrays.asList("Ahmed"));
        System.out.println(names);

    }
}
