/** Класс наследник класса Storage */

public class Dialog extends Storage implements PrintingMess {
    

    public Dialog() {
        
    }

    @Override
    public void writeMess(Message msg) {
        super.writeMess(msg);
    }

    @Override
    public void printingDialog(User name) {
        for (Message msg : getMessageStor()) {
            if (msg.user == name) {
                System.out.printf("\n_ _ _Вы: %s\n", msg.text);
            } else {
                System.out.printf("\n%s: %s\n", msg.user.getName(), msg.text);
            }
        }
    }

    @Override
    public void printingDialog() {
        for (Message msg : getMessageStor()){
            System.out.printf("%s: %s\n",msg.user.getName(),msg.text);
        }
    }

}
