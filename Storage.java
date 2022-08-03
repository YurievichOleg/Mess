/** Абстрактный класс, показывающий что у наследников будет список с сообщениями.
 * Имплементирует интерфейс WriteMess, говорящий что у класса будет метод записи 
 * экземпляров класса Message.
 */

import java.util.ArrayList;


public abstract class Storage implements WriteMess {
    private ArrayList<Message> messageStor = new ArrayList<>();

    @Override
    public void writeMess(Message msg) {
        messageStor.add(msg);
    }
    public ArrayList<Message> getMessageStor() {
        return messageStor;
    }

    
}
