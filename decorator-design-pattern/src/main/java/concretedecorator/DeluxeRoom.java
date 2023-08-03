package concretedecorator;

import component.Room;
import decorator.RoomDecorator;

public class DeluxeRoom extends RoomDecorator {
    public DeluxeRoom(Room specialRoom) {
        super(specialRoom);
    }

    @Override
    public void infoRoom() {
        System.out.println("------- Deluxe Room -------");
        specialRoom.infoRoom();
        System.out.println("Towels");
        System.out.println("Alarm clock\n\n");
    }
}
