package Home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_duplicate_arrayList {
    public static void main(String[] args) {


        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 2, 4, 4, 5, 5));

        List news =  list2.stream().distinct().collect(Collectors.toList());
        System.out.println(news);
        System.out.println(Collections.max(news));
        //System.out.println(Collections.max(list2));


        List<Object> let = new ArrayList<>(Arrays.asList('a','b','a',"@","1", "@"));

        List newList = let.stream().distinct().collect(Collectors.toList());
        System.out.println("New l " + newList);


    }
}
