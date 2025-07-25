package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
// import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

class MapCollectionsEx {
      Map<Integer, String> map = new HashMap<>();

      MapCollectionsEx(List<Integer> l, List<String> s) {
            for (int i = 0; i < 6; i++) {
                  map.put(l.get(i), s.get(i));
            }
            map.put(1, "shreeram");

      }

      void display() {
            System.out.println(map);

      }
}

class Exforeachmeth {

      Exforeachmeth(List<Integer> list1) {
            Consumer<Integer> cons = new Consumer<Integer>() {

                  @Override
                  public void accept(Integer t) {

                        System.out.println(t);
                  }
            };
            list1.forEach(cons);
      }

}

class Exset {
      Set<Integer> s = new TreeSet<Integer>();// for sorted set

      Exset(List<Integer> list1) {

            // Set<Integer> s = new HashSet<Integer>();

            for (Integer i : list1) {
                  s.add(i);
            }

            s.remove(674);
            System.out.println(s);
      }
}

public class PracticeCollections {

      public static void main(String[] args) {
            // initilization 2d array list;
            ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                  arrayList.add(new ArrayList<>());
            }

            List<Integer> numlist = Arrays.asList(9, 7, 3, 44, 674, 43, 3);
            List<String> sList = Arrays.asList("shreeram", "shrijay", "lokesh", "vaishu",
                        "Vicky", "Jay", "Yash");

            Exforeachmeth exforeachmeth = new Exforeachmeth(numlist);

            MapCollectionsEx m = new MapCollectionsEx(numlist, sList);
            m.display();
            // System.out.println(list1.get(4));

      }
}
