package decorator;

import component.Room;

public abstract class RoomDecorator implements Room {
    protected Room specialRoom;

    public RoomDecorator(Room specialRoom) {
        this.specialRoom = specialRoom;
    }

    @Override
    public void infoRoom() {
        specialRoom.infoRoom();
    }
}
