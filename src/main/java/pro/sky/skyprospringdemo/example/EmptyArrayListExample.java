package pro.sky.skyprospringdemo.example;

import java.util.ArrayList;
import java.util.List;

public class EmptyArrayListExample {
    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>(List.of());
        List<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.set(0, 10);
        numbers.add(30);
        System.out.println("numbers = " + numbers);
        for (Integer number : numbers) {
            System.out.println("numbers = " + numbers);
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("numbers.get(i) = " + numbers.get(i));
        }
    }
}
