package entity;

import Types.TaxiType;

public class Order {
    private String passengerName;
    private String destination;
    private TaxiType taxiType;

    public Order(String passengerName, String destination, TaxiType taxiType) {
        this.passengerName = passengerName;
        this.destination = destination;
        this.taxiType = taxiType;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public TaxiType getTaxiType() {
        return taxiType;
    }

    public void setTaxiType(TaxiType taxiType) {
        this.taxiType = taxiType;
    }

    @Override
    public String toString() {
        return
                "passengerName='" + passengerName + '\'' +
                ", destination='" + destination + '\'' +
                ", taxiType=" + taxiType;
    }
}
