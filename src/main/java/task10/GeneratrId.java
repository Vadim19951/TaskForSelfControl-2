package task10;

public enum GeneratrId {
    INSTANCE;

    int id = 0;

    public int generate(){
        return ++id;
    }
}
