class BoardingPass {

    private String seatNumber;
    private String gate;

    public BoardingPass(String seatNumber, String gate) {
        this.seatNumber = seatNumber;
        this.gate = gate;
    }


    public String toString() {
        return "seat: " + seatNumber + " gate: " + gate;
    }
}

class Flight {

    private String flightID;
    private String destination;
    private BoardingPass object;


    public Flight(String flightID, String destination, String seatNumber, String gate) {
        this.flightID = flightID;
        this.destination = destination;
        this.object = new BoardingPass(seatNumber, gate);
    }

    public void printFlightInfo() {
        System.out.println("Flight: " + flightID);
        System.out.println("Destination: " + destination);
        System.out.println("Boarding P: " + object);
    }
}

public class Aviation {
    public static void main(String[] args) {
        Flight f1 = new Flight("101", "Usbekistan", "14", "1");
        f1.printFlightInfo();
    }

}
