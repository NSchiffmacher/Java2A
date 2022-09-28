package lists;

import java.util.ArrayList;

public class FindMinStringMain {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> strings = new ArrayList<>();

        // Fill it with stuff
        String[] val = {"aaa", "aa", "aac"};
        for (String e: val) strings.add(e);

        // Compute the minimum
        String min = strings.get(0);
        for (String e: strings){
            if (e.compareTo(min) < 0) min = e;
        }
        System.out.println(min);
    }
}
