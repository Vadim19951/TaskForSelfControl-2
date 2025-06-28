package task4;

/*
LinkedList vs ArrayList	

Измерьте (System.nanoTime)
время вставки 10 000 элементов в начало ArrayList и LinkedList,
выведите результаты.



 */


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
    static List<String> names1 = new ArrayList<>();
    static List<String> names2 = new LinkedList<>();

    public static void main(String[] args) {
        getMeasureOfFillingList(names1);
        getMeasureOfFillingList(names2);
    }

    public static void getMeasureOfFillingList(List<String> list){
        for (int i = 0; i < 10000; i++) {
            list.add(0, "testWarm");
        }
        list.clear();
        long endTime;
        long startTime = System.nanoTime();
        for (int i = 0; i <10000; i++) {
            list.add(0, "Test");
        }
        endTime = System.nanoTime();
        System.out.println("Type of List = " + list.getClass().getSimpleName() + "\n\nstartTime = " + startTime + "\nendTime = " + endTime +
                "\noperationTime = " + (endTime - startTime) + "\n------------------------------");
    }
}


