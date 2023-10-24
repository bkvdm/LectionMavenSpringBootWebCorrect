package pro.sky.skyprospringdemo.example;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        Integer[] numbersArray = {1, 2, 3};
        System.out.println(Arrays.toString(numbersArray));
        System.out.println("numbersArray[0] = " + numbersArray[0]);
        numbersArray[0] = 10;
        System.out.println("numbersArray.length = " + numbersArray.length);

//        List<Integer> numbersList = List.of(1, 2, 3);
//        List<Integer> numbersList = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println("numbersList = " + numbersList);
        System.out.println("numbersList.toString() = " + numbersList.toString());
        System.out.println("numbersList.get(0) = " + numbersList.get(0));
        numbersList.set(0, 10);
        System.out.println("numbersList.size() = " + numbersList.size());
        numbersList.add(56);

//        Map<String, Integer> numbersMap = new HashMap<>();
        Map<String, Integer> numbersMap = new HashMap<>(Map.of("four", 4, "five", 5));
        numbersMap.put("one", 1);
        numbersMap.put("two", 2);
        numbersMap.get("two");
        numbersMap.size();
        numbersMap.toString();
        numbersMap.put("three", 3);
        System.out.println(numbersMap);
    }

}
