package org.test.pLesson30.p2.m9_realizeCollector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a1_GroupingByModuloComparison {
    public static Map<String, List<Integer>> supplier(){
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("even", new ArrayList<>());
        map.put("odd", new ArrayList<>());
        return map;
    }

    public static void accumulator(Map<String, List<Integer>> map, Integer element){
        if ((element % 2 == 0)){
            map.get("even").add(element);
        }else {
            map.get("odd").add(element);
        }
    }

    public static void combiner(Map<String, List<Integer>> map1, Map<String, List<Integer>> map2){
        map2.forEach((k, v) -> map1.get(k).addAll(v));
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7);

        Map<String, List<Integer>> result = numbers.stream()
                .collect(a1_GroupingByModuloComparison::supplier, a1_GroupingByModuloComparison::accumulator, a1_GroupingByModuloComparison::combiner);
        System.out.println(result);
    }
}
