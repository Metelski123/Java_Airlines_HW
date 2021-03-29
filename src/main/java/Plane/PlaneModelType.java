package Plane;

public enum PlaneModelType {
    B737("737", 100),
    B747("747", 101),
    B767("767", 102),
    A300("A300", 105),
    A310("A310", 106),
    A321("A321", 111);

    private final String model;
    private final int seats;


    PlaneModelType(String model, int seats) {
        this.model = model;
        this.seats = seats;
    }

    public String getModelType() {
        return this.model;
    }

    public int getNumberOfSeats() {
        return this.seats;
    }
}