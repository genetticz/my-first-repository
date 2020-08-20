package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HelloWorld {

    public static void main(String[] args) {

        List<String> demo = new ArrayList<>();
        List<String> newDemo = new ArrayList<>();
        demo.add("Apple");
        demo.add("Banana");
        demo.add("Orange");
        demo.add("Amanda");
        demo.add("Anita");
        demo.add("Awwakana");
//
//        demo.forEach(x -> {
//            if(x.charAt(0) == 'A') {
//                newDemo.add(x);
//            }
//        });

        Collections.copy(demo,newDemo);

        System.out.println(newDemo);

    }
}
