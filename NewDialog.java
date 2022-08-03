import java.util.LinkedHashMap;
import java.util.Map;

public abstract class NewDialog {
    Map<NewUser, Message> storage = new LinkedHashMap<>();

    protected void addUser(NewUser user){};
    /**
     * @param admin - тот кто хочет удалить
     * @param user - тот, кого хотят удалить
     * если @param admin прошел проверку на админа, то из хранилища удаляется запись по ключу @param user
     */
    protected void removeUser(NewUser admin ,NewUser user){
        if (admin.getAdmin()){
            storage.remove(user);
        }
    };


}
