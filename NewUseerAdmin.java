

public abstract class NewUseerAdmin extends User {
    int status;
    public NewUseerAdmin(String name, int status) {
        super(name);
        this.status = status;
    }

    protected Integer getStatus(){
        return status;
    }
}
