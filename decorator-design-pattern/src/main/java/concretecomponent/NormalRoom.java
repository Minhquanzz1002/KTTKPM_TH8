package concretecomponent;

import component.Room;

public class NormalRoom implements Room {

    @Override
    public void infoRoom() {
        System.out.println("WiFi in lobby");
        System.out.println("Parking");
        System.out.println("Private Bathroom");
        System.out.println("Non-smoking");
    }
}
