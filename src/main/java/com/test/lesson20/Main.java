package com.test.lesson20;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

       /* Map<String, String> stringStringMap = new HashMap<>();
        String kye = "First";
        String value = "Lisa";

        String key1 = "Second";
        String value1 = "Petro";

        stringStringMap.put(kye, value);
        stringStringMap.put(key1, value1);

        String key2 = "Second";
        String value2 = "Adam";

        stringStringMap.put(key2, value2);

        stringStringMap.put(value2, key2);

        stringStringMap.put("value2", key2);

        stringStringMap.put("value1", key2);*/

  /*      stringStringMap.forEach((k, v) -> {
            System.out.println(k + " " +  v);
        });
*/


      /*  Map<City, Integer> stringCityHashMap = new HashMap<>();

        final City city = new City(0, "Misto1");
        final City city1 = new City(1, "Misto2");
        final City city2 = new City(1, "Misto2");

        stringCityHashMap.put(city, 1);
        stringCityHashMap.put(city1, 2);

        stringCityHashMap.put(city2, 5);

        stringCityHashMap.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });*/


     /*   Map<String, List<City>> cityMap = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            List<City> cities = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                City city3 = new City(i, "city" + i);
                cities.add(city3);
            }
            String k = String.valueOf(i + 1);
            cityMap.put(k, cities);
        }*/


     /*   System.out.println(cityMap);*/


        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("one", "Petro");
        stringStringMap.put("two", "Lisa");
        stringStringMap.put("three", "Adam");

        final String s = stringStringMap.get("dsds");

        if (Objects.isNull(s)) {
            System.out.println("Wrong key");
        } else {
            System.out.println(s.length());
        }

        stringStringMap.clear();

        Map<String, String> sd = new HashMap<>(stringStringMap);


        System.out.println(stringStringMap);

    }

}
