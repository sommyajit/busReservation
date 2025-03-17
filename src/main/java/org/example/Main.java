package org.example;

import org.example.model.Passenger;
import org.example.model.Bus;
import org.example.model.enums.Gender;

public class Main {
    public static void main(String[] args) {
        Bus bus =new Bus(50);
        Passenger passenger1 =new Passenger("Sommyajit", Gender.MALE, 26);
        Passenger passenger2 =new Passenger("Saurav", Gender.MALE, 26);
        Passenger passenger3 =new Passenger("Nikita", Gender.FEMALE, 26);
        bus.bookSeat(passenger1);
        bus.countAvailableSeat();
        bus.bookSeat(passenger2);
        bus.countAvailableSeat();
        bus.bookSeat(passenger3);
        bus.vacateSeat(1);
        bus.countAvailableSeat();
        bus.bookSeat(passenger1);
    }
}