package task3;

/*
3
Неизменяемые коллекции

Метод unmodifiableGrades(Map<String,Integer>)
возвращает read-only карту.
Проверьте, что put() бросает исключение.
 */


import java.util.Map;

public class Main3 {

    public static void main(String[] args) {
        MapForReadOnly mapForReadOnly = new MapForReadOnly();
        Map<String, Integer> newMap = mapForReadOnly.unmodifiableGrades(MapForReadOnly.getGrades());
        newMap.put("Idaho", 8);
    }
}
