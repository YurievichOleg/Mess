

public class ProgramMes {
    public static void main(String[] args) {
        User name1 = new User("Ваня");
        User name2 = new User("Маша");
        Dialog room1 = new Dialog();
        Dialog room2 = new Dialog();

        Message msg1 = new Message(name1, "Привет.");
        room1.writeMess(msg1);
        Message msg2 = new Message(name2, "И тебе привет!");
        room1.writeMess(msg2);
        Message msg3 = new Message(name1, "Как дела?");
        room1.writeMess(msg3);

        User name3 = new User("Петя");

        Message msg4 = new Message(name3, "Я тоже с вами!");
        room2.writeMess(new Message(name1, "В разговор какой-то Петя влез."));
        room2.writeMess(new Message(name2, "Я тоже увидела."));
        room1.writeMess(msg4);
        Message msg5 = new Message(name1, "Привет, Петя");
        room1.writeMess(msg5);
        // room1.printingDialog(name1);
        room1.printingDialog();
        System.out.println();
        room2.printingDialog();

        

    }

}
