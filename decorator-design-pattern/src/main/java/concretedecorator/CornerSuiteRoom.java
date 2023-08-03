package concretedecorator;

import component.Room;
import decorator.RoomDecorator;

public class CornerSuiteRoom extends RoomDecorator {

    public CornerSuiteRoom(Room specialRoom) {
        super(specialRoom);
    }

    @Override
    public void infoRoom() {
        System.out.println("------- Corner Suite Room -------");
        specialRoom.infoRoom();
        System.out.println("Shower and bathtub");
        System.out.println("Bathroom phone\n\n");
    }
}
