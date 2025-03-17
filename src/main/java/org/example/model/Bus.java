package org.example.model.enums;

import org.example.model.Seat;

import java.util.List;

public class Bus {
    private List<Seat> seats;

    public Bus(int numberOfSeat) {
        for(int i=1;i<=numberOfSeat;i++){
            seats.add(new Seat(i, null, SeatStatus.EMPTY));
        }
    }

    public int countAvailableSeat(){
        return seats.stream().filter(seat -> seat.getSeatStatus().equals(SeatStatus.EMPTY)).count();
    }

}
