package task5;

import java.util.Objects;

public class Task {

    int id;
    String name;

    public Task(int id, String name){
        this.id = id;
        this.name = name;
    }


    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if( obj == null) return  false;
        if (obj instanceof  Task){
            if (this.id == ((Task) obj).id ){
                return  true;
            }
        }
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
}
