package org.example.model;

import org.example.model.enums.SeatStatus;

public class Seat {
    private int id;
    private Passenger passenger;
    private SeatStatus seatStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }

    public Seat(int id, Passenger passenger, SeatStatus seatStatus) {
        this.id = id;
        this.passenger = passenger;
        this.seatStatus = seatStatus;
    }
}
