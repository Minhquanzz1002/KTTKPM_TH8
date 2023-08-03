import component.Room;
import concretecomponent.NormalRoom;
import concretedecorator.CornerSuiteRoom;

public class Client {
    public static void main(String[] args) {
        Room room = new NormalRoom();
        System.out.println("------- Normal Room -------");
        room.infoRoom();

        Room roomVip = new CornerSuiteRoom(room);
        roomVip.infoRoom();
    }
}
