package People.Crew;

public enum CrewType {
    CAPTAIN("Captain"),
    FIRSTOFFICER("First Officer"),
    PURSER("Purser"),
    FLIGHTATTENDANT("Flight Attendant");


    private final String rank;

    CrewType(String rank){
        this.rank = rank;
    }

    public String getRank() {
        return this.rank;
    }
}