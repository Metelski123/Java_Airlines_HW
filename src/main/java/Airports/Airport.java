package Airports;

public enum Airport {
    ABZ("Aberdeen"),
    EDI("Edinburgh"),
    GLA("Glasgow"),
    PIK("Glagow Prestwick"),
    INV("Inverness");


    private final String airportName;


    Airport(String airportName){
        this.airportName = airportName;
    }

    public String getAirportName(){
        return this.airportName;
    }
}