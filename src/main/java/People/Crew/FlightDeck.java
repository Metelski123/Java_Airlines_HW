package People.Crew;


public class FlightDeck extends CrewMember {

    private String licenseNumber;


    public FlightDeck(String name, CrewType crewType, String licenseNumber){
        super(name, crewType);
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber(){
        return this.licenseNumber;
    }

    public String takeOff(){
        return "Fasten your seat belts, we're off!";
    }

    public String land() {
        return "Could be a bumpy landing, kiss your ass goodbye!";
    }
}