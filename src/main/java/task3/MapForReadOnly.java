package task3;

import java.util.Collections;
import java.util.Map;

public class MapForReadOnly {

    private Map<String, Integer> grades = Map.of(
            "Sportic", 1,
            "Shaxmatist", 4,
            "Karatist", 0,
            "Geek", 10
    );

    public void setGrades(Map<String, Integer> grades) {
        this.grades = grades;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public Map<String, Integer> unmodifiableGrades(Map<String, Integer> unstableMap) {
        Map<String, Integer> stableMap = Collections.unmodifiableMap(unstableMap);
        return stableMap;
    }


}
