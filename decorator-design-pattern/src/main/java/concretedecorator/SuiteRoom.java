package concretedecorator;

import component.Room;
import decorator.RoomDecorator;

public class SuiteRoom extends RoomDecorator {
    public SuiteRoom(Room specialRoom) {
        super(specialRoom);
    }

    @Override
    public void infoRoom() {
        System.out.println("------- Suite Room -------");
        specialRoom.infoRoom();
        System.out.println("1 king bed");
        System.out.println("Shower");
        System.out.println("Mini bar\n\n");
    }
}
