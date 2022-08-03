

public class User {
    private int ids;
    private String name;
    public static Integer id;
    static {
        id = 1;
    }
    private User(int ids, String name){
        this.ids = ids;
        this.name = name;
        id++;
    }

    public User(String name){
        this(id, name);
    }

    public String getName() {
        return name;
    }
    public Integer getId() {
        return ids;
    }

}
