package org.example.model;

import org.example.model.enums.SeatStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Bus {
    private List<Seat> seats=new ArrayList<>();

    public Bus(int numberOfSeat) {
        for(int i=1;i<=numberOfSeat;i++){
            this.seats.add(new Seat(i, null, SeatStatus.EMPTY));
        }
    }

    public void countAvailableSeat(){
        long seatCount=seats.stream().filter(seat -> seat.getSeatStatus().equals(SeatStatus.EMPTY)).count();
        System.out.println("Avaliable Seat: "+seatCount);
    }

    public void bookSeat(Passenger passenger){
       Optional<Seat> seat=seats.stream().filter(s -> s.getSeatStatus().equals(SeatStatus.EMPTY)).findFirst();
       if(seat.isPresent()){
           seat.get().setPassenger(passenger);
           seat.get().setSeatStatus(SeatStatus.FILLED);
           seatDetailsPrinter(passenger, seat.get());

       } else {
           System.out.println("No Seat Available");
       }
    }

    private static void seatDetailsPrinter(Passenger passenger, Seat seat) {
        System.out.println("+------------+-----------------+--------+-----+");
        System.out.println("| Seat No.   | Passenger Name  | Gender | Age |");
        System.out.println("+------------+-----------------+--------+-----+");
        System.out.printf("| %-10d | %-15s | %-6s | %-3d |\n",
                seat.getId(), passenger.getName(), passenger.getGender(), passenger.getAge());
        System.out.println("+------------+-----------------+--------+-----+");
    }

    public void vacateSeat(int seatId){
        Optional<Seat> seat=seats.stream().filter(s -> s.getId()==seatId).findFirst();
        if(seat.isPresent()){
            seat.get().setPassenger(null);
            seat.get().setSeatStatus(SeatStatus.EMPTY);
            System.out.println("Seat Vacated");
        } else {
            System.out.println("No Seat Found");
        }
    }
}
