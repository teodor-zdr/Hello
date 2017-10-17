package Plur;

public class Flight {
//    public int passengers;
//    public int seats;
    private int passengers, flightNumber, seats = 150;
    private char flightClass;
    private boolean[] isSeatAvailable;
    //private int seats;

    {
        isSeatAvailable = new boolean[seats];
        for (int i = 0; i < seats; i++) {
            isSeatAvailable[i] = true;
        }
    }

    public Flight() {}

    public boolean[] getIsSeatAvailable() {
        return isSeatAvailable;
    }

    public void setIsSeatAvailable(boolean[] isSeatAvailable) {
        this.isSeatAvailable = isSeatAvailable;
    }

    public Flight(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass) {
        this.flightClass = flightClass;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean hasRoom(Flight f2) {
        int total = this.passengers + f2.passengers;
        return total <= seats;
    }

    public Flight createNewWithBoth(Flight f2) {
        Flight newFlight = new Flight();
        newFlight.seats = seats;
        newFlight.passengers = passengers + f2.passengers;
        return newFlight;
    }
}
