package app;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BetweenTwoSets {
  public static void main(String[] args) {
    List<Integer> source1 = Arrays.asList(3, 4);
    List<Integer> source2 = Arrays.asList(24, 48);

    System.out.println(getTotalX(source1, source2));
  }

  public static int getTotalX(List<Integer> a, List<Integer> b) {

    List<Integer> div = new ArrayList<>();
    HashMap<Integer, Integer> divMap = new HashMap<>();
    b.forEach(bx ->
            IntStream.rangeClosed(1, bx).filter(i -> bx % i == 0).forEachOrdered(div::add));

    div.forEach(dm -> {
      if (!divMap.containsKey(dm)) {
        divMap.put(dm, 1);
      } else {
        divMap.replace(dm, divMap.get(dm) + 1);
      }
    });

    List<Integer> cd = divMap.keySet().stream().filter(key -> divMap.get(key) == b.size()).collect(Collectors.toList());
    HashSet<Integer> cd1 = new HashSet<>();

    for (Integer factor : cd) {
      for (Integer divisor : a) {
        if (factor % divisor == 0 && a.get(a.size() - 1).equals(divisor)) cd1.add(factor);
        else if (factor % divisor == 0) {
        } else break;
      }
    }
    return cd1.size();
  }


//  public static int getTotalX(List<Integer> a, List<Integer> b) {
//    Collections.sort(a);
//    Collections.sort(b);
//    int maxA = a.get(a.size()-1);
//    int minB = b.get(0);
//    int totalX = 0;
//    int currentVal = maxA;
//    while(currentVal <= minB) {
//      final int current = currentVal;
//
//      if(a.stream().allMatch(e->current % e == 0 || e % current == 0) &&
//              b.stream().allMatch(e->current % e == 0 || e % current == 0)) {
//        totalX++;
//      }
//
//      currentVal += maxA;
//    }
//    return totalX;
//  }
}
