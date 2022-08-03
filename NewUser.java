public class NewUser extends NewUseerAdmin {
    public NewUser(String name, int status) {
        super(name, status);
    }

    public boolean getAdmin(){
        return getStatus() > 0;
    }
}
