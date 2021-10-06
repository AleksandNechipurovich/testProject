package test.lesson1;

import java.util.ArrayList;
import java.util.List;

public class BubbleSorter {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(43);
        list.add(32);
        list.add(54);
        list.add(1);
        list.add(12);
        sort(list);

    }

    public static void sort(List<Integer> list){
        for (int out = list.size() - 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if(list.get(in) > list.get(in + 1)){
                    int temp = list.get(in);
                    list.set(in, list.get(in+1));
                    list.set(in+1,temp);


                }

            }
        }
        System.out.println(list);

    }

}
